package com.example.listviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var listView:ListView
    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var country_names: Array<out String> = resources.getStringArray(R.array.country_names)

        listView = findViewById(R.id.listViewID)
        adapter = ArrayAdapter(this,R.layout.sample_view,R.id.txtID,country_names)
        listView.adapter = adapter



    }
}
