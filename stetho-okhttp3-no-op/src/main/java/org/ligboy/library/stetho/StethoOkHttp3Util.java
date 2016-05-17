package org.ligboy.library.stetho;

import android.support.annotation.NonNull;

import okhttp3.OkHttpClient;

/**
 * Stetho OkHttp3 Util
 * @author Ligboy.Liu ligboy@gmail.com.
 */
public class StethoOkHttp3Util {

    /**
     * Setup Stetho for OkHttp3
     * @param builder The {@link OkHttpClient.Builder} of the {@link OkHttpClient}
     * @return The {@link OkHttpClient.Builder} for building {@link OkHttpClient}
     */
    @NonNull
    public static OkHttpClient.Builder setup(@NonNull OkHttpClient.Builder builder) {
        /* no-op */
        return builder;
    }
}
