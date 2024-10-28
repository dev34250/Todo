package com.example.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.time.Instant
import java.util.Date


class TodoViewModel : ViewModel() {
    private var _todolist =MutableLiveData<List<Todo>>()
    val todolist : LiveData<List<Todo>> = _todolist

    object TodoManager {
        private val todoList = mutableListOf<Todo>()

        fun getAllTodo(): List<Todo> {
            return todoList
        }

        fun addTodo(title: String) {
            // Convert Instant to Date
            todoList.add(Todo(System.currentTimeMillis().toInt(), title, Date.from(Instant.now())))
        }

        fun deleteTodo(id: Int) {
            todoList.removeIf {
                it.id == id
            }
        }
    }




    fun getAllTodo(){
        _todolist.value = TodoManager.getAllTodo().reversed()
    }

    fun addTodo(title: String){
        TodoManager.addTodo(title)
        getAllTodo()

    }

    fun deleteTodo(id: Int){
        TodoManager.deleteTodo(id)
        getAllTodo()

    }



}