package com.dlh.dlhrxjavademo.logic;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by dlh on 2017/3/13.
 */

public class HttpInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        Request requst = builder.addHeader("Content-type", "application/json").build();
        return chain.proceed(requst);
    }
}
