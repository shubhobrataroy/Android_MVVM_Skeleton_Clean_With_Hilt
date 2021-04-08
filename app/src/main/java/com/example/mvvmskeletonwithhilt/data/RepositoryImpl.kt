package com.example.mvvmskeletonwithhilt.data

import com.example.mvvmskeletonwithhilt.data.source.remote.RestRemoteDataSource
import com.example.mvvmskeletonwithhilt.domain.Repository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(remoteDataSource: RestRemoteDataSource) : Repository {
    private val restApiService by lazy { remoteDataSource.restApiService }
}