package com.zainul.medichapp.mainhome.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DonasiViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is donasi Fragment"
    }
    val text: LiveData<String> = _text
}