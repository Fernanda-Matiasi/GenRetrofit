package com.generation.todo.adapter

import com.generation.todo.model.Tarefa

interface TaskItemClickListener {
//Atualização 04/04
    fun onTaskClicked(tarefa: Tarefa)
}