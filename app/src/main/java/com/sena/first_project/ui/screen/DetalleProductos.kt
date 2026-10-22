package com.sena.first_project.ui.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DetalleProducto(
    id: Int
) {
    Text(
        text = "El id del producto es $id"
    )
}
