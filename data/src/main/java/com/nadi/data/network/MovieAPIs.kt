package com.nadi.data.network

import com.nadi.core.movie.Movie
import com.nadi.core.trailer.Trailer
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieAPIs {
    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies(): Response<Movie>

    @GET("movie/{MOVIE_ID}/videos")
    suspend fun getTrailers(@Path("MOVIE_ID") movieID: Int): Response<Trailer>

    //https://api.themoviedb.org/3/movie/464052/similar?api_key=7c0d4bddac83cf06e582a9ce636b0b7a&language=en-US&page=1
    @GET("movie/{MOVIE_ID}/similar")
    suspend fun getSimilar(@Path("MOVIE_ID") movieID: Int): Response<Movie>

}