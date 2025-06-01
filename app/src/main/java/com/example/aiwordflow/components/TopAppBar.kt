package com.example.aiwordflow.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiwordflow.ui.theme.AiWordFlowTheme

@Composable
fun TopAppBar(
    userName: String = "Usuario",
    onSignOut: () -> Unit
) {
    var showProfileMenu by remember { mutableStateOf(false) }

    Box {
        // Overlay para cerrar el popup al tocar fuera (DEBE IR PRIMERO)
        if (showProfileMenu) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable { showProfileMenu = false }
            )
        }

        // Barra superior
        Card(
            modifier = Modifier
                .height(80.dp),
            shape = RoundedCornerShape(0.dp)

        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Saludo del usuario
                Text(
                    text = "Hola, $userName!",
                    fontSize =14.sp,
                    fontWeight = FontWeight.Bold
                )

                // Ícono de perfil
                IconButton(
                    onClick = { showProfileMenu = !showProfileMenu },
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF8D6E63))
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Perfil",
                        tint = Color.Gray,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }

        // Popup del perfil
        if (showProfileMenu) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 85.dp, end = 16.dp),
                contentAlignment = Alignment.TopEnd
            ) {
                Card(
                    modifier = Modifier.width(200.dp)

                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "PERFIL",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = userName,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Button(
                            onClick = {
                                showProfileMenu = false
                                onSignOut()
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "Cerrar Sesión",
                                color = Color.Black
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 360,
    heightDp = 640
)
@Composable
fun TopAppBarPreview() {
    AiWordFlowTheme {
        TopAppBar(
            userName = "Juan Pérez",
            onSignOut = { }
        )
    }
}