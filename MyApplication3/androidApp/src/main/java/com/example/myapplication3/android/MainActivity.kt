package com.example.myapplication3.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication3.Greeting
import android.widget.TextView
import android.widget.ArrayAdapter

fun greet(): String {
    return Greeting().greeting()
}

fun getList(): ArrayList<String> {
    return Greeting().getList()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val listView: ListView = findViewById(R.id.list_view)
        val arrayAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getList())
        listView.adapter = arrayAdapter

    }
}
