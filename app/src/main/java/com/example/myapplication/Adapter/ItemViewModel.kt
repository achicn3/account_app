package com.example.myapplication.Adapter

import android.content.Context
import android.net.ConnectivityManager
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemViewModel : ViewModel() {
    var itemList =  MutableLiveData<List<ItemDetails>>()
    init {
        itemList.value = emptyList()
    }
}