package com.example.todonote.model
import java.time.LocalDateTime

data class TodoItem(
    val datetime: LocalDateTime,
    val title: String
)