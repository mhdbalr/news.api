package com.example.tesnewsapi.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tesnewsapi.databinding.ActivitySourceBinding
import com.example.tesnewsapi.view.adapter.SourceAdapter
import com.example.tesnewsapi.viewmodel.SourceViewModel

class SourceActivity : AppCompatActivity() {
    lateinit var binding: ActivitySourceBinding
    lateinit var sourceAdapter: SourceAdapter
    lateinit var sourceVm : SourceViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySourceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sourceVm = ViewModelProvider(this).get(SourceViewModel::class.java)
        sourceAdapter = SourceAdapter(ArrayList())
        sourceVm.getDataSource().observe(this, observer)
        sourceAdapter = SourceAdapter(it!!)
        val layoutMan = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)


    }
}