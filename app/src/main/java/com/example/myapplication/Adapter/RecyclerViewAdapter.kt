package com.example.myapplication.Adapter

import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.CardViewHolder

class RecyclerViewAdapter : RecyclerView.Adapter<CardViewHolder>() {
    var itemViewModel = ItemViewModel()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return itemViewModel.itemList.value!!.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        var Item  = itemViewModel.itemList.value!![position]

    }

}