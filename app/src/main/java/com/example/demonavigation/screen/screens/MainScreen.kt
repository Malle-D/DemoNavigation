package com.example.demonavigation.screen.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(
    phone: String?,
    name: String?
) {
    Column(
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = phone ?: "")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = name ?: "")

    }
}