package com.example.demonavigation.screen.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.demonavigation.screen.Screen

@Composable
fun ProfileScreen(
    navController: NavController,
    phone: String?
) {
    var text by remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            shape = RoundedCornerShape(8.dp),
            label = {
                Text(text = "Name")
            },
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate(Screen.MainScreen.withArgs(phone?:"",text))
        }) {
            Text(text = "Next")
        }
    }

}