package com.sena.first_project.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Perfil(
    onVolverHome: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Hola desde Perfil"
        )
        Button(
            onClick = onVolverHome
        ) {
            Text(
                text = "Volver a Home"
            )
        }
    }
}
