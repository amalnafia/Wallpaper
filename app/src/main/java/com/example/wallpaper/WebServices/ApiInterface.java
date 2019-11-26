package com.example.wallpaper.WebServices;

import com.example.wallpaper.Models.Photo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("photos")
    Call<List<Photo>> getPhotos();
    @GET("photos/{id}")
    Call<Photo> getPhoto(@Path("id") String id);
}
