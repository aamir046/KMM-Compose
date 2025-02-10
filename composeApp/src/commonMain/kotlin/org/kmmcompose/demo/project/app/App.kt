package org.kmmcompose.demo.project.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.kmmcompose.demo.project.app.navigation.AppNavGraph

@Composable
@Preview
fun App() {
    MaterialTheme {
     AppNavGraph()
    }
}