package com.example.mvvmskeletonwithhilt.data.source.remote

import com.example.mvvmskeletonwithhilt.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RestRemoteDataSource(
    remoteUrl: String,
    connectTimeout: Long,
    readTimeout: Long,
    writeTimeout: Long
) {
    private val okHttpClient by lazy {
        OkHttpClient.Builder()

            .connectTimeout(connectTimeout, TimeUnit.SECONDS)
            .readTimeout(readTimeout, TimeUnit.SECONDS)
            .writeTimeout(writeTimeout, TimeUnit.SECONDS)
            .apply {
                if (BuildConfig.DEBUG) {

                    addInterceptor(HttpLoggingInterceptor())
                }
            }
            .build()
    }

    private val retrofit by lazy {
        Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(remoteUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val restApiService: RestApiService by lazy {
        retrofit.create(RestApiService::class.java)
    }
}