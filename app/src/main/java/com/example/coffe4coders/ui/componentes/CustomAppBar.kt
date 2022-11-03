package com.example.coffe4coders.ui.componentes

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffe4coders.ui.theme.Coffe4codersTheme

typealias navigationAction = () -> Unit

@Composable
fun CustomAppBar(
    title: String? = null,
    navigationIcon: ImageVector? = null,
    navigationAction: navigationAction? = null
) {
    val titleText = title ?: ""
    if (navigationIcon != null && navigationAction != null) {
        TopAppBar(
            title = { Text(titleText) },
            navigationIcon = {
                IconButton(onClick = {
                    navigationAction()
                }) {
                    Icon(navigationIcon, "")
                }
            },
            backgroundColor = MaterialTheme.colors.primary
        )
    } else {
        TopAppBar(
            title = { Text(titleText) },
            backgroundColor = MaterialTheme.colors.primary
        )
    }
}

//hace lo mismo que CustomAppBar pero sin if-else
@Composable
fun CustomAppBar1(
    title: String = "",
    navigationIcon: ImageVector? = null,
    navigationAction: () -> Unit? = {}
) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon =
        navigationIcon?.let {
            {
                IconButton(onClick = { navigationAction() }) {
                    Icon(navigationIcon, contentDescription = null)
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun CustomAppBarPreview() {
    Coffe4codersTheme() {
        CustomAppBar("Coffe 4 Coders")
    }
}