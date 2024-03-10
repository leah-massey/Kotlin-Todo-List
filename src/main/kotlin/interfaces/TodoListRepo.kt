package interfaces

import TodoItem
import TodoList

interface TodoListRepo {
    fun getTodos(): TodoList
    fun updateTodos(updatedTodoList: TodoList)
}