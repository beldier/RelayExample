package com.example.myapplication.ui.screens.tasks

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.TasksRepository
import com.example.myapplication.data.model.Task
import com.example.myapplication.ui.screens.list.PropertyTask
import com.example.myapplication.ui.screens.list.PropertyTaskContent


@Composable
fun MainTaskScreen() {
    Column {
        TasksScreen()
    }
}

@Composable
fun TasksScreen() {
    var tasksState by remember { mutableStateOf(emptyList<Task>()) }

    LaunchedEffect(Unit) {
        tasksState = TasksRepository.getTasks()
    }

    TaskScreen(tasks = tasksState)
}

@Composable
fun TaskScreen(tasks: List<Task>) {
    LazyColumn(
        contentPadding = PaddingValues(4.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(tasks) {
            // Generated code with Relay
//            com.example.myapplication.propertytask.PropertyTask(
//                companyNameText = it.company,
//                codeNameText = it.code,
//                categoryNameText = it.title,
//                addressNameText = it.adress
//            )
            // Manual code
            PropertyTask(
                companyNameText = it.company,
                codeNameText = it.code,
                categoryNameText = it.title,
                addressNameText = it.adress
            )
        }
    }
}

