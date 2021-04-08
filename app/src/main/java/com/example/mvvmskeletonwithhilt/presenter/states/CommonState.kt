package com.example.mvvmskeletonwithhilt.presenter.states

import java.lang.Exception

sealed class CommonState {
    object Fetching:CommonState()
    object Complete:CommonState()
    data class Failed(val message:String,val exception: Exception):CommonState()
}