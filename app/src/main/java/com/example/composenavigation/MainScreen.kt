package com.example.composenavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("MainScreen") })
        }
    ) { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            Text(text = "AmirahmadAdibi1")
            Text(text = "AmirahmadAdibi2")
            Text(text = "AmirahmadAdibi3")
            Text(text = "AmirahmadAdibi4")
            Text(text = "AmirahmadAdibi5")
            Text(text = "AmirahmadAdibi6")
            Text(text = "AmirahmadAdibi7")
            Text(text = "AmirahmadAdibi8")
            Text(text = "AmirahmadAdibi9")
            Text(text = "AmirahmadAdibi10")
            Text(text = "AmirahmadAdibi11")
        }
    }
}