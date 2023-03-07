package com.example.android.whowroteitloader;

import com.example.android.whowroteitloader.bean.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoogleService {
    @GET("books/v1/volumes")
    Call<Book> getVolume(@Query("q") String q, @Query("maxResults") int maxResult, @Query("printType") String printType);
}
