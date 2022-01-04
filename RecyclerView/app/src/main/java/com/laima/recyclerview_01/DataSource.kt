package com.laima.recyclerview_01

import android.content.Context

class DataSource(private val context: Context) {

    fun getBookList(): Array<String> {

        return context.resources.getStringArray(R.array.example_array)
    }

}