package com.example.tesnewsapi.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tesnewsapi.databinding.ItemSourceBinding
import com.example.tesnewsapi.model.Source

class SourceAdapter(var listSource : List<Source>):RecyclerView.Adapter<SourceAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemSourceBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SourceAdapter.ViewHolder {
     var view = ItemSourceBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: SourceAdapter.ViewHolder, position: Int) {
   holder.binding.nameSource.text = listSource
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}