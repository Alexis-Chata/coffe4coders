package com.example.coffe4coders.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffe4coders.ui.componentes.CustomTextField
import com.example.coffe4coders.ui.componentes.DropdownTextField
import com.example.coffe4coders.ui.theme.Coffe4codersTheme

@Composable
fun CheckoutScreen() {
    val cities = listOf(
        "Ciudad de Mexico, Mexico",
        "La Habana, Cuba",
        "Cancun, Mexico",
        "Medellin, Colombia",
        "Buenos Aires, Argentina",
        "Sao Paulo, Brasil",
        "Lima, Peru",
        "Montevideo, Uruguay",
        "Ciudad de Panama, Panama",
    )
    var name by rememberSaveable { mutableStateOf("") }
    var city by rememberSaveable { mutableStateOf("") }
    Column {
        CustomTextField(value = name, placeholder = "Nombre"){
            name = it
        }

        DropdownTextField(suggestions = cities, value = city, placeholder = "ciudades"){
            city = it
        }
    }

}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenPreview() {
    Coffe4codersTheme() {
        CheckoutScreen()
    }
}