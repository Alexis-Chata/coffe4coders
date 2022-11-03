package com.example.coffe4coders.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.coffe4coders.ui.componentes.CountryISO

@Composable
fun DetailScreen(navController: NavController, countryISO: CountryISO) {
    Column() {
        Text(text = "Soy un Producto de: ${countryISO.iso}",
            style = MaterialTheme.typography.h3)
        Button(
            onClick = {
                navController.navigate("feed"){
                    /* popUpTo tiene un comportamiento curioso probar el atras del dispositivo*/
                    popUpTo("feed")
                }
            }
        ){
            Text(text = "Volver")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    val navController = rememberNavController()
    DetailScreen(navController, CountryISO.BRA)
}