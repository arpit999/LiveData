package ca.temi.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val factsLiveDataObject = MutableLiveData<String>("This is a fact")

    val quoteLiveData: LiveData<String>
        get() = factsLiveDataObject

    fun updateQuote() {
        factsLiveDataObject.value = "Another facts"
    }
}