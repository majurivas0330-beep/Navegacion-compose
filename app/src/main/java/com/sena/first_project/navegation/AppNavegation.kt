package com.sena.first_project.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.sena.first_project.ui.screen.Configuracion
import com.sena.first_project.ui.screen.DetalleProducto as DetalleProductoScreen
import com.sena.first_project.ui.screen.Home
import com.sena.first_project.ui.screen.Perfil
import com.sena.first_project.ui.screen.Producto

@Composable
fun AppNavegation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Inicio
    ) {
        composable<Inicio> {
            Home(
                onirProducto = {
                    navController.navigate(Productos)
                },
                onIrPerfil = {
                    navController.navigate(Perfil)
                },
                onIrConfiguracion = {
                    navController.navigate(Configuracion)
                }
            )
        }

        composable<Productos> {
            Producto(
                onirDetalleProducto = { id ->
                    navController.navigate(DetalleProducto(id))
                },
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }

        composable<DetalleProducto> { dato ->
            val args = dato.toRoute<DetalleProducto>()
            DetalleProductoScreen(
                id = args.id
            )
        }

        composable<Perfil> {
            Perfil(
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }

        composable<Configuracion> {
            Configuracion(
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }
    }
}
