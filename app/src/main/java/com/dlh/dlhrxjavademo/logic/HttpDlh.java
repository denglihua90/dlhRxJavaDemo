package com.dlh.dlhrxjavademo.logic;

import com.dlh.dlhrxjavademo.config.ApiConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/**
 * Created by dlh on 2017/3/13.
 */

public class HttpDlh {
    public Retrofit getRetrofit() {
        return retrofit;
    }

    public void setRetrofit(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    private Retrofit retrofit;
    private static final int DEFAULT_TIMEOUT = 5;
    private static HttpDlh httpDlh;

    public static HttpDlh getHttpDlh() {
        if (httpDlh == null) {
            httpDlh = new HttpDlh();
        }
        return httpDlh;
    }

    //构造方法私有
    private HttpDlh() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.interceptors().add(new HttpInterceptor());
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        retrofit = new Retrofit.Builder()
                .client(builder.build())
                //modify by zqikai 20160317 for 对http请求结果进行统一的预处理 GosnResponseBodyConvert
//                .addConverterFactory(GsonConverterFactory.create())
//                .addConverterFactory(ResponseConvertFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(ApiConfig.getApi())
                .build();
//        movieService = retrofit.create(MovieService.class);
    }
}
