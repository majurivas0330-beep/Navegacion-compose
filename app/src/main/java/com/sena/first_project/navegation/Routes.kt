package com.sena.first_project.navegation

import kotlinx.serialization.Serializable

@Serializable
data object Inicio

@Serializable
data object Productos

@Serializable
data class DetalleProducto(
    val id: Int
)

@Serializable
data object Perfil

@Serializable
data object Configuracion
