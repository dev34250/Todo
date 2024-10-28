package com.example.todoapp

import android.annotation.SuppressLint
import java.time.Instant
import java.util.Date

data class Todo(
    var id:Int,
    var title:String,
    var createAt: Date,
)

@SuppressLint("NewApi")
fun fakeTodo() : List<Todo>{
    return  listOf<Todo>(
        Todo(id = 1 ,"First Todo",Date.from(Instant.now())),
        Todo(id = 2 ,"Second Todo",Date.from(Instant.now())),
        Todo(id = 3 ,"Third Todo",Date.from(Instant.now())),
        Todo(id = 4 ,"Fourth Todo",Date.from(Instant.now())),
    );


}
