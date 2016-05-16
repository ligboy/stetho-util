package org.ligboy.library.stetho;

import android.support.annotation.NonNull;

import com.facebook.stetho.okhttp.StethoInterceptor;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;

import java.util.List;

/**
 * Stetho OkHttp Util
 * @author Ligboy.Liu ligboy@gmail.com.
 */
public class StethoOkHttpUtil {

    @SuppressWarnings("deprecation")
    private static final StethoInterceptor STETHO_INTERCEPTOR = new StethoInterceptor();

    /**
     * Setup Stetho for OkHttp2
     * <p>Same as {@link #setup(List)}
     * @param client OkHttpClient
     */
    public static void setup(@NonNull OkHttpClient client) {
        setup(client.networkInterceptors());
    }

    /**
     * Setup Stetho for OkHttp2
     * <p>Same as {@link #setup(OkHttpClient)}
     * @param interceptors OkHttp network interceptors
     */
    public static void setup(@NonNull List<Interceptor> interceptors) {
        interceptors.add(STETHO_INTERCEPTOR);
    }
}
