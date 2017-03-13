package com.dlh.dlhrxjavademo.logic;


import com.dlh.dlhrxjavademo.bean.User;

import io.reactivex.Observable;
import okhttp3.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by dlh on 2017/3/13.
 */

public interface LoginService {
    
    @POST("/user/login")
    Observable<Response> login(@Body User user);


}
