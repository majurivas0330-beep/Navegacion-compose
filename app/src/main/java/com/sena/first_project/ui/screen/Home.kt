package com.sena.first_project.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Home(
    onirProducto: () -> Unit,
    onIrPerfil: () -> Unit,
    onIrConfiguracion: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Hola desde la Home"
        )
        Button(
            onClick = onirProducto
        ) {
            Text(
                text = "ir a producto"
            )
        }
        Button(
            onClick = onIrPerfil
        ) {
            Text(
                text = "ir a perfil"
            )
        }
        Button(
            onClick = onIrConfiguracion
        ) {
            Text(
                text = "ir a configuración"
            )
        }
    }
}
