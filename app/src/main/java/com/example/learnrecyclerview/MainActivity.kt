package com.example.learnrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var itemListRecyclerView: RecyclerView
    private lateinit var itemListViewAdapter: ItemListViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemListRecyclerView = findViewById(R.id.recycler_view)
        itemListViewAdapter = ItemListViewAdapter(arrayListOf(
            ItemData(
            "Bakso", "Makanan", 2)
        ))

        itemListRecyclerView.layoutManager = LinearLayoutManager(this)
        itemListRecyclerView.adapter = itemListViewAdapter

    }


}