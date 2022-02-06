package com.example.recyclerappnovice.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerappnovice.databinding.RecyclerViewholderTestBinding

class AdapterRecyclerViewTest:
    RecyclerView.Adapter<RecyclerViewHolderTest>() {

    val listi = listOf<String>("One", "Two", "Three", "Four")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolderTest {
val binding: RecyclerViewholderTestBinding =
    RecyclerViewholderTestBinding.inflate(LayoutInflater.from(parent.context),
    parent,false)
        return RecyclerViewHolderTest(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolderTest, position: Int) {
holder.binding.itemNumber.text = (position+  1).toString()
        holder.binding.itemValue.text = listi[position]
    }

    override fun getItemCount(): Int {
    return listi.size
    }
}