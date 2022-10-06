package com.example.movie_app

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {
    //인기있는
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "키발급",
        @Query("page") page: Int,
        @Query("language") language : String = "ko"
    ): Call<GetMoviesResponse>

    //최고평점
    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "키발급",
        @Query("page") page: Int,
        @Query("language") language : String = "ko"
    ): Call<GetMoviesResponse>

    //개봉 예정중인
    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "키발급",
        @Query("page") page: Int,
        @Query("language") language : String = "ko"
    ): Call<GetMoviesResponse>

}
