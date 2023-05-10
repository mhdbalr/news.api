package com.example.tesnewsapi.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tesnewsapi.R
import com.example.tesnewsapi.databinding.ActivityCategoryBinding
import com.example.tesnewsapi.model.CategoryData
import com.example.tesnewsapi.view.adapter.CategoryAdapter

class CategoryActivity : AppCompatActivity() {
    lateinit var binding: ActivityCategoryBinding
    lateinit var categoryAdapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listCategory = arrayListOf(
            CategoryData("BUSINESS",R.drawable.business),
            CategoryData("ENTERTAINMENT",R.drawable.entertainment),
            CategoryData("GENERAL",R.drawable.general),
            CategoryData("HEALTH",R.drawable.health),
            CategoryData("SCIENCE",R.drawable.science),
            CategoryData("SPORTS",R.drawable.sports),
            CategoryData("TECHNOLOGY",R.drawable.technology)
        )

            categoryAdapter = CategoryAdapter(listCategory)
        binding.rvCategory.apply {
            layoutManager = LinearLayoutManager(this@CategoryActivity, LinearLayoutManager.VERTICAL,false)
            adapter = categoryAdapter
        }
    }
}