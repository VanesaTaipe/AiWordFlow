package com.example.aiwordflow.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aiwordflow.ui.theme.AiWordFlowTheme


@Composable
fun InicioScreen(){

    Box (modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Inicio",
            style = MaterialTheme.typography.headlineLarge
        )
    }

}
@Preview(
    showBackground = true,
    widthDp = 360,
    heightDp = 640
)
@Composable
fun Inicsw() {
    AiWordFlowTheme {
        InicioScreen()

    }
}
