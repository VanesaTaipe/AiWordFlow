package com.example.aiwordflow.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.painter.Painter
import androidx.navigation.NavController

@Composable
fun BottomNavigationBar(
    navController: NavController
) {
    val selectedNavigationIndex = rememberSaveable {
        mutableIntStateOf(0)
    }

    val navigationItems = listOf(
        NavigationItem(
            title = "Inicio",
            icon = Icons.Default.Home,
            route = Screen.Inico.rout
        ),
        NavigationItem(
            title = "Mi Diccionario",
            icon = Icons.Default.FavoriteBorder,
            route = Screen.Diccionario.rout
        ),
        NavigationItem(
            title = "Desafíos",
            icon = Icons.Default.Create,
            route = Screen.Desafíos.rout
        )
    )

    NavigationBar(
    ) {
        navigationItems.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedNavigationIndex.intValue == index,
                onClick = {
                    selectedNavigationIndex.intValue = index
                    navController.navigate(item.route)
                },
                icon = {
                    if (item.icon != null) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title
                        )
                    } else if (item.painter != null) {
                        Icon(
                            painter = item.painter,
                            contentDescription = item.title
                        )
                    }
                },
                label = {
                    Text(
                        item.title
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    indicatorColor = MaterialTheme.colorScheme.onSecondary
                )
            )
        }
    }
}

data class NavigationItem(
    val title: String,
    val icon: ImageVector? = null,
    val painter: Painter? = null,
    val route: String
)