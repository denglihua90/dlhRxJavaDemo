package com.dlh.dlhrxjavademo.logic;

import com.dlh.dlhrxjavademo.bean.User;

import io.reactivex.Observable;
import okhttp3.Response;
import retrofit2.http.Body;

/**
 * Created by dlh on 2017/3/13.
 */

public class LoginLogic {

    public User login(User user) {
        Observable<Response> responseObservable = HttpDlh.getHttpDlh().getRetrofit().create(LoginService.class).login(user);
//        responseObservable.
        return null;
    }
}
