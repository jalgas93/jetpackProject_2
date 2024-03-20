package com.compose.jetpack.di

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.compose.jetpack.Constants.BASE_URL
import com.compose.jetpack.network.OctoApi
import com.compose.jetpack.network.OctoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOctoApi(): OctoApi {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build().create(OctoApi::class.java)

    }
/*
    @Provides
    @Singleton
    fun provideOctoRepository(octoApi: OctoApi):OctoRepository{
        return Pager(
            config = PagingConfig(pageSize = 10),
     *//*       pagingSourceFactory = {
        *//**//*        NewsPagingSource(
                    newsApi = newsApi,
                    sources = sources.joinToString(separator = ",")
                )*//**//*
            }*//*
        ).flow
    }*/

}