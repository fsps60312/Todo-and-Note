package com.example.todonote.data

import android.content.Context
import com.example.todonote.R
import com.example.todonote.model.Affirmation
import com.example.todonote.model.TodoItem

class Datasource {
    fun loadTodoItems(context: Context): List<TodoItem> {
        return listOf<TodoItem>(
            TodoItem("start of a list of TodoItems."),
            TodoItem(context.getString(R.string.affirmation1)),
            TodoItem(context.getString(R.string.affirmation2)),
            TodoItem(context.getString(R.string.affirmation3)),
            TodoItem(context.getString(R.string.affirmation4)),
            TodoItem(context.getString(R.string.affirmation5)),
            TodoItem(context.getString(R.string.affirmation6)),
            TodoItem(context.getString(R.string.affirmation7)),
            TodoItem(context.getString(R.string.affirmation8)),
            TodoItem(context.getString(R.string.affirmation9)),
            TodoItem(context.getString(R.string.affirmation10))
        )
    }
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}