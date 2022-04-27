package ca.temi.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val quoteLiveDataObject = MutableLiveData<String>("This is a fact")

    val quoteLiveData: LiveData<String>
        get() = quoteLiveDataObject

    fun updateQuote() {
        quoteLiveDataObject.value = "Another Quote"
    }
}