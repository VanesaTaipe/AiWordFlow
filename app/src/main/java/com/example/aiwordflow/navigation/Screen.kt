package com.example.aiwordflow.navigation

sealed class Screen(val rout: String) {
    object Inico: Screen("Inicio")
    object Diccionario: Screen("diccionario")
    object Desafíos: Screen("desafios")
    object NuevaPalabra: Screen("nueva_palabra")
    object Intentar: Screen("intenta_adivinar")
    object Resultado: Screen("resultado_screen/{palabra}/{esCorrecta}")
}