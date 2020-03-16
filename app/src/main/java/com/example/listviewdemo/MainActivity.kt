package com.example.listviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import com.example.listviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var listView: ListView
    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // in this line we did hide title in the full screen..
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)


       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var country_names: Array<out String> = resources.getStringArray(R.array.country_names)
        adapter = ArrayAdapter(this,R.layout.sample_view,R.id.txtID,country_names)
       binding.listViewID.adapter = adapter



    }
}
