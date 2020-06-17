package com.viccontracovid.gamejam.ui.security

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecurityViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {


    }
    val text: LiveData<String> = _text
}