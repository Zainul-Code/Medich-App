package com.zainul.medichapp.mainhome.ui.dokter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DokterViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dokter Fragment"
    }
    val text: LiveData<String> = _text
}