package com.example.todonote.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todonote.R
import com.example.todonote.model.TodoItem

class TodoItemAdapter(private val context: Context, private val dataset: List<TodoItem>) :
    RecyclerView.Adapter<TodoItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val button: Button = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.todo_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.button.text =
            context.getString(R.string.textview_format, item.datetime.toString(), item.title)
    }

    override fun getItemCount(): Int = dataset.size
}