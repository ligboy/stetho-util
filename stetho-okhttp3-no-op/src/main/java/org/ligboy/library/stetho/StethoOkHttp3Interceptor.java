package org.ligboy.library.stetho;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * @author Ligboy.Liu ligboy@gmail.com.
 */
public class StethoOkHttp3Interceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        return chain.proceed(chain.request());
    }

}
