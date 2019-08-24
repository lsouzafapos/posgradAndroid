package com.example.posgrad.services;



import retrofit2.Call;
import retrofit2.http.GET;
import com.example.posgrad.entities.User;

import java.util.List;

public interface ApiEndPoint {

    @GET("users")
    Call<List<User>> getUsuarios();

}
