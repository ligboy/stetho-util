package org.ligboy.library.stethoutil;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;

import org.ligboy.library.stetho.StethoOkHttp3Interceptor;
import org.ligboy.library.stetho.StethoOkHttpUtil;
import org.ligboy.library.stetho.StethoTree;
import org.ligboy.library.stetho.StethoUtil;

import timber.log.Timber;

/**
 * @author Ligboy.Liu ligboy@gmail.com.
 */
public class DemoApplication extends Application {

    /**
     * Don't do like this in product. You should use lazy initialization.
     */
    public static final OkHttpClient HTTP_CLIENT = new OkHttpClient();
    public static okhttp3.OkHttpClient httpClient3;

    @Override
    public void onCreate() {
        super.onCreate();
        StethoUtil.initialize(this);

        StethoOkHttpUtil.setup(HTTP_CLIENT);

        httpClient3 = new okhttp3.OkHttpClient.Builder()
                .addInterceptor(new StethoOkHttp3Interceptor())
                .build();

        Timber.plant(new StethoTree());
        Timber.plant(new Timber.DebugTree());
    }
}
