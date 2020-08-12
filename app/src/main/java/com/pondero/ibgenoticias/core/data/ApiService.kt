package com.pondero.ibgenoticias.core.data

import androidx.core.os.BuildCompat
import com.pondero.ibgenoticias.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

interface ApiService {

    @GET(BuildConfig.ROUTER_ALL_NEWS)
    fun fetchNews(){

    }

}