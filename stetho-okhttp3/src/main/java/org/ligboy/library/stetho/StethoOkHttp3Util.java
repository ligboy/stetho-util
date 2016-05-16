package org.ligboy.library.stetho;

import android.support.annotation.NonNull;

import com.facebook.stetho.okhttp3.StethoInterceptor;

import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;

/**
 * Stetho OkHttp3 Util
 * @author Ligboy.Liu ligboy@gmail.com.
 */
public class StethoOkHttp3Util {

    private static final StethoInterceptor STETHO_INTERCEPTOR = new StethoInterceptor();

    /**
     * Setup Stetho for OkHttp3
     * <p>Same as {@link #setup(List)} {@link #setup(OkHttpClient)}
     * @param builder The {@link Builder} of the {@link OkHttpClient}
     */
    @NonNull
    public static Builder setup(@NonNull OkHttpClient.Builder builder) {
        return builder.addInterceptor(STETHO_INTERCEPTOR);
    }

    /**
     * Setup Stetho for OkHttp3
     * <p>Same as {@link #setup(List)}
     * @param client OkHttpClient
     */
    public static void setup(@NonNull OkHttpClient client) {
        setup(client.networkInterceptors());
    }

    /**
     * Setup Stetho for OkHttp3
     * <p>Same as {@link #setup(OkHttpClient)}
     * @param interceptors OkHttp network interceptors
     */
    public static void setup(@NonNull List<Interceptor> interceptors) {
        interceptors.add(STETHO_INTERCEPTOR);
    }
}
