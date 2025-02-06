package org.kmmcompose.demo.project

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMM-Compose-Demo",
    ) {
        App()
    }
}