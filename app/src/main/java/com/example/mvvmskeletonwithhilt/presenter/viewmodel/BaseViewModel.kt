package com.example.mvvmskeletonwithhilt.presenter.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvmskeletonwithhilt.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BaseViewModel @Inject constructor(private val repository: Repository):ViewModel() {
}