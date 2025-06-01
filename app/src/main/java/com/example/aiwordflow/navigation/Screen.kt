package com.example.aiwordflow.navigation

sealed class Screen(val rout: String) {
    object Inico: Screen("Inicio")
    object Diccionario: Screen("diccionario")
    object Desafíos: Screen("desafios")
}