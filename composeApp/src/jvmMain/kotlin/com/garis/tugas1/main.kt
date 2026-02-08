package com.garis.tugas1

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Tugas1PAMGaris",
    ) {
        App()
    }
}