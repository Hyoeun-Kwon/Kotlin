package com.laima.recyclerview_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Data
        val bookList = DataSource(this).getBookList()

        // RecyclerView Init
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        // Set Adapter
        recyclerView.adapter = BookAdapter(bookList)

    }


}