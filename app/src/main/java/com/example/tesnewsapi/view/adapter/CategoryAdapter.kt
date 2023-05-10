package com.example.tesnewsapi.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tesnewsapi.databinding.ItemCategoryBinding
import com.example.tesnewsapi.model.CategoryData

class CategoryAdapter(var listCategory : List<CategoryData>): RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    class ViewHolder(var binding : ItemCategoryBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {
     var view = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent,false
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.categoryName.text = listCategory[position].name
        Glide.with(holder.itemView).load(listCategory[position].img).into(holder.binding.categoryImage)
    }

    override fun getItemCount(): Int {
       return listCategory.size
    }
}