package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // id declaration
        val listView = findViewById<ListView>(R.id.listView)

        //  array task list or data part code her
        val taskList = arrayListOf<String>()
        taskList.add("Prayer Fajar Prayer")
        taskList.add("Going to College")
        taskList.add("Doing Some It Support study")
        taskList.add("Android project understanding")
        taskList.add("Back to home and ready for IBCS")
        taskList.add("Going to IBCS and learning Android Dev")
        taskList.add("Back to home and take some rest")
        taskList.add("Studying on Android project")
        taskList.add("Push a github project on github")
        taskList.add("Going to Sleep")

        // adapter defined code here
        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)
        listView.adapter = adapterForMyListView

        // click on every item code here
        listView.setOnItemClickListener { parent, view, position, id ->
            val text = "Clicked on item : " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

    }
}