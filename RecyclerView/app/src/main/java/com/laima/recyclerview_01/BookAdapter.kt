package com.laima.recyclerview_01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
             [ Adapter Class ]
    1. Overview
    - Creates ViewHolder & Sets the data

    2. Components (Override)
    - onCreateViewHolder : Init
    - onBindViewHolder   : Set Data
    - getItemCount       : Data Size

    3. Inner Class
    - ViewHolder : Design an individual item

 **/

class BookAdapter(private val bookList: Array<String>):
    RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // RecyclerView 의 모양을 결정하는 것은 LayoutManager (XML) 이다.
        // 여기서 각 요소(item)가 어떻게 보일지 디자인한다.

        // ↓ ↓  book_item.xml 에 있는 UI  ↓ ↓
        private val bookTitle: TextView = itemView.findViewById(R.id.book_title)

        // UI & Data 연결하는 '틀'
        fun bind(title: String) {
            bookTitle.text = title
        }
    }

    // ViewHolder 초기화 (아직 Data 들어가있지 않음)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.book_item, parent, false)

        return BookViewHolder(view)
    }

    // ViewHolder 에 적절한 Data 연결해준다.
    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(bookList[position])
    }

    // Data Size
    override fun getItemCount(): Int {
        return bookList.size
    }


}