package com.example.coffe4coders.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.coffe4coders.ui.componentes.CountryISO
import com.example.coffe4coders.ui.componentes.CustomAppBar

@Composable
fun DetailScreen(navController: NavController, countryISO: CountryISO) {
    Scaffold(
        topBar = {
            CustomAppBar(navigationIcon = Icons.Filled.ArrowBack) {
                navController.navigate("feed") {
                    /* popUpTo tiene un comportamiento curioso probar el atras del dispositivo*/
                    popUpTo("feed")
                }
            }
        },
        content = {
            Column() {
                Text(
                    text = "Soy un Producto de: ${countryISO.iso}",
                    style = MaterialTheme.typography.h3
                )
                Button(
                    onClick = {
                        navController.navigate("feed") {
                            /* popUpTo tiene un comportamiento curioso probar el atras del dispositivo*/
                            popUpTo("feed")
                        }
                    }
                ) {
                    Text(text = "Volver")
                }

                Button(
                    onClick = {
                        navController.navigateUp()
                    }
                ) {
                    Text(text = "Volver navigateUp")
                }

                Button(
                    onClick = {
                        navController.popBackStack()
                    }
                ) {
                    Text(text = "Volver popBackStack")
                }

            }
        }

    )
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    val navController = rememberNavController()
    DetailScreen(navController, CountryISO.BRA)
}