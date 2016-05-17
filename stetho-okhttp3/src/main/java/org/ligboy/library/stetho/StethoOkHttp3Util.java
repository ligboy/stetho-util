package org.ligboy.library.stetho;

import android.support.annotation.NonNull;

import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;

/**
 * Stetho OkHttp3 Util
 * @author Ligboy.Liu ligboy@gmail.com.
 */
public class StethoOkHttp3Util {

    /**
     * Setup Stetho for OkHttp3
     * @param builder The {@link Builder} of the {@link OkHttpClient}
     * @return The {@link Builder} for building {@link OkHttpClient}.
     */
    @NonNull
    public static Builder setup(@NonNull OkHttpClient.Builder builder) {
        return builder.addInterceptor(new StethoOkHttp3Interceptor());
    }
}
