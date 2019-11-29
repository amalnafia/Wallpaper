package com.example.wallpaper.WebServices;

import com.example.wallpaper.Models.Collection;
import com.example.wallpaper.Models.Photo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("photos")
    Call<List<Photo>> getPhotos();
    @GET("collections/featured")
    Call<List<Collection>> getCollections();
    @GET("photos/{id}")
    Call<Photo> getPhoto(@Path("id") String id);
    @GET("collections/{id}/photos")
    Call<List<Photo>> getPhotosOfCollection(@Path("id") int id);

    @GET("collections/{id}")
    Call<Collection> getInformationOfCollection(@Path("id") int id);
}
