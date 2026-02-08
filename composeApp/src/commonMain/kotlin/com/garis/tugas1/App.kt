package com.garis.tugas1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// HAPUS @Preview biar tidak error saat compile
@Composable
fun App() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            var showContent by remember { mutableStateOf(false) }

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "Halo, Garis Rayya Rabbani!",
                    style = MaterialTheme.typography.headlineSmall
                )

                Text(
                    text = "NIM: 123140018",
                    modifier = Modifier.padding(top = 8.dp)
                )

                Text(
                    text = "Running on: Desktop (Windows)",
                    modifier = Modifier.padding(top = 8.dp, bottom = 24.dp)
                )

                // Tombol Interaktif
                Button(onClick = { showContent = !showContent }) {
                    Text("Klik ini untuk kelarin tugas 1!")
                }

                if (showContent) {
                    Text(
                        text = "Mantap! Tugas 1 Saya Kelar",
                        modifier = Modifier.padding(top = 16.dp)
                    )
                }
            }
        }
    }
}