package com.example.myapplication.ui.screens.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun PropertyTask(
    companyNameText: String,
    codeNameText: String,
    categoryNameText: String,
    addressNameText: String
) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.fillMaxWidth(0.5f)){
            PropertyTaskContent(title = "Company", content = companyNameText)
        }
        Column(modifier = Modifier.fillMaxWidth(1f)) {
            PropertyTaskContent(title = "Code", content = codeNameText)
        }

    }
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.fillMaxWidth(0.5f)){
            PropertyTaskContent(title = "Category", content = categoryNameText)
        }
        Column(modifier = Modifier.fillMaxWidth(1f)) {
            PropertyTaskContent(title = "Address", content = addressNameText)
        }
    }
}

@Composable
fun PropertyTaskContent(title: String, content:String){
    Column {
        Text(text = title, style = MaterialTheme.typography.caption)
        Text(text = content, style = MaterialTheme.typography.body1, maxLines = 2)

    }
}

@Preview(showBackground = true)
@Composable
private fun preview(){
    PropertyTaskContent(title = "Company", content = "Bubblemix" )
}



