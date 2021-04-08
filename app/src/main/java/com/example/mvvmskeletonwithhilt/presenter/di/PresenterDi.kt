package com.example.mvvmskeletonwithhilt.presenter.di

import com.example.mvvmskeletonwithhilt.data.RepositoryImpl
import com.example.mvvmskeletonwithhilt.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class PresenterDi {

    @Binds
    @Singleton
    abstract fun provideRepo(repositoryImpl: RepositoryImpl): Repository
}