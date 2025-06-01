package com.example.aiwordflow.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aiwordflow.ui.theme.AiWordFlowTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NuevaPalabraScreen(
    onBackClick: () -> Unit = {},
    onAgregarClick: (String) -> Unit = {}
) {
    var palabra by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Top bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.Default.Done,
                    contentDescription = "Volver"
                )
            }
            Text(
                text = "Nueva Palabra",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Pregunta
        Text(
            text = "¿Cuál es tu nueva palabra?",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Campo de texto
        OutlinedTextField(
            value = palabra,
            onValueChange = { palabra = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.outline
            ),
            placeholder = {
                Text("Escribe aquí tu palabra")
            }
        )

        Spacer(modifier = Modifier.weight(1f))

        // Botón Agregar
        Button(
            onClick = {
                if (palabra.isNotBlank()) {
                    onAgregarClick(palabra.trim())
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(28.dp),
            enabled = palabra.isNotBlank(),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        ) {
            Text(
                text = "Agregar",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Medium
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun pruebaS(){
    AiWordFlowTheme {
        NuevaPalabraScreen()
    }
}