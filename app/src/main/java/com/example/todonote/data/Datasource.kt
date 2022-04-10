package com.example.todonote.data

import android.content.Context
import com.example.todonote.R
import com.example.todonote.model.Affirmation
import com.example.todonote.model.TodoItem
import java.time.LocalDateTime

class Datasource {
    fun loadTodoItems(context: Context): List<TodoItem> {
        val l = mutableListOf<TodoItem>()
        for (stringResourceId: Int in listOf(
            R.string.affirmation1,
            R.string.affirmation2,
            R.string.affirmation3,
            R.string.affirmation4,
            R.string.affirmation5,
            R.string.affirmation6,
            R.string.affirmation7,
            R.string.affirmation8,
            R.string.affirmation9,
            R.string.affirmation10
        )) {
            val t: String = context.getString(stringResourceId)
            l.add(TodoItem(LocalDateTime.now(), t))
        }
        return l.toList()
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