package com.example.mvvmskeletonwithhilt.data.di

import com.example.mvvmskeletonwithhilt.Config
import com.example.mvvmskeletonwithhilt.data.source.remote.RestRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Singleton
    @Provides
    fun providesRemoteDataSource() = RestRemoteDataSource(
        Config.RemoteUrl,
        Config.ConnectTimeout,
        Config.ReadTimeout,
        Config.WriteTimeout
    )

}