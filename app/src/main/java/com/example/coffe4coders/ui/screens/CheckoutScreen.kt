package com.example.coffe4coders.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffe4coders.ui.componentes.CustomTextField
import com.example.coffe4coders.ui.theme.Coffe4codersTheme

@Composable
fun CheckoutScreen() {
    var name by rememberSaveable { mutableStateOf("") }

    CustomTextField(value = name, placeholder = "Nombre"){
        name = it
    }
}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenPreview() {
    Coffe4codersTheme() {
        CheckoutScreen()
    }
}