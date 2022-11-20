package com.zainul.medichapp.mainhome.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ObatViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is obat Fragment"
    }
    val text: LiveData<String> = _text
}