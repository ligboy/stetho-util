package org.ligboy.library.stethoutil;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;

import org.ligboy.library.stetho.StethoOkHttp3Util;
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
    public static final okhttp3.OkHttpClient HTTP_CLIENT_3 = new okhttp3.OkHttpClient();

    @Override
    public void onCreate() {
        super.onCreate();
        StethoUtil.initialize(this);

        StethoOkHttpUtil.setup(HTTP_CLIENT);

        StethoOkHttp3Util.setup(HTTP_CLIENT_3);

        Timber.plant(new StethoTree());
    }
}
