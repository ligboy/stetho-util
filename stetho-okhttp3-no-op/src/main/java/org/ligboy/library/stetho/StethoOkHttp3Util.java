package org.ligboy.library.stetho;

import android.support.annotation.NonNull;

import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/**
 * Stetho OkHttp3 Util
 * @author Ligboy.Liu ligboy@gmail.com.
 */
public class StethoOkHttp3Util {

    /**
     * Setup Stetho for OkHttp3
     * <p>Same as {@link #setup(List)} {@link #setup(OkHttpClient)}
     * @param builder The {@link OkHttpClient.Builder} of the {@link OkHttpClient}
     */
    @NonNull
    public static OkHttpClient.Builder setup(@NonNull OkHttpClient.Builder builder) {
        /* no-op */
        return builder;
    }

    /**
     * Setup Stetho for OkHttp3
     * <p>Same as {@link #setup(List)}
     * @param client OkHttpClient
     */
    public static void setup(@NonNull OkHttpClient client) {
        /* no-op */
    }

    /**
     * Setup Stetho for OkHttp3
     * <p>Same as {@link #setup(OkHttpClient)}
     * @param interceptors OkHttp network interceptors
     */
    public static void setup(@NonNull List<Interceptor> interceptors) {
        /* no-op */
    }
}
