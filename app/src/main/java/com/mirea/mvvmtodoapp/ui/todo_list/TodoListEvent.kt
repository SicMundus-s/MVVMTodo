package com.mirea.mvvmtodoapp.ui.todo_list

import com.mirea.mvvmtodoapp.data.Todo

sealed class TodoListEvent { // События в списке дел
    data class OnDeleteTodoClick(val todo: Todo): TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}
