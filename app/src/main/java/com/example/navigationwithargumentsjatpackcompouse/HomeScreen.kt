package com.example.navigationwithargumentsjatpackcompouse

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    var nameValue by remember {
        mutableStateOf("")
    }
    var ageValue by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
        ) {
        OutlinedTextField(
            value = nameValue, 
            onValueChange = {
                nameValue = it
            },
            label = {
                Text(text = "Enter your name")
            },
            modifier = Modifier.padding(bottom = 10.dp)
            )
        OutlinedTextField(
            value = ageValue,
            onValueChange = {
                ageValue = it
            },
            label = {
                Text(text = "Enter your name")
            },
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Button(onClick = {
            navController.navigate("detail_screen?name=$nameValue&age=$ageValue")
        }) {
            Text(text = "Go to detail")
        }
    }
}