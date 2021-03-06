package com.example.todonote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todonote.adapter.TodoItemAdapter
import com.example.todonote.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val textView: TextView = findViewById(R.id.textview)
//        textView.text = Datasource().loadAffirmations().size.toString()
        val myDataset = Datasource().loadTodoItems(this)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = TodoItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}