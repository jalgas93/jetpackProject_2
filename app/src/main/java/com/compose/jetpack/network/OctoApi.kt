package com.compose.jetpack.network

import com.compose.jetpack.Constants.API_KEY
import com.compose.jetpack.model.Popular
import com.compose.jetpack.model.Result
import retrofit2.http.GET
import retrofit2.http.Query
import javax.xml.transform.Source

interface OctoApi {
    @GET("popular")
    suspend fun getData(
        @Query("page") page:Int = 1,
        @Query("language") language: String ="en-US",
        @Query("api_key") apiKey:String = API_KEY
    ): List<Result>
}