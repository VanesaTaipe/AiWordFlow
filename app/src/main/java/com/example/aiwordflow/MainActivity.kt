
package com.example.aiwordflow

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.aiwordflow.screens.DesScreen
import com.example.aiwordflow.screens.DicScreen
import com.example.aiwordflow.screens.InicioScreen
import com.example.aiwordflow.screens.SignInActivity
import com.example.aiwordflow.navigation.BottomNavigationBar
import com.example.aiwordflow.navigation.Screen
import com.example.aiwordflow.ui.theme.AiWordFlowTheme
import com.example.aiwordflow.components.TopAppBar
import com.google.firebase.auth.FirebaseAuth

import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions


class MainActivity : ComponentActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inicializar Firebase Auth
        auth = FirebaseAuth.getInstance()

        // Verificar si el usuario está autenticado
        val currentUser = auth.currentUser
        if (currentUser == null) {
            // Si no está autenticado, ir a SignInActivity
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
            return
        }

        setContent {
            AiWordFlowTheme {
                MainScreen(
                    userName = currentUser?.displayName ?: "Usuario",
                    onSignOut = {

                        signOut()

                        // Cerrar sesión en Firebase
                        auth.signOut()
                        // Ir a SignInActivity
                        startActivity(Intent(this@MainActivity, SignInActivity::class.java))
                        finish()

                    }
                )
            }
        }
    }


    private fun signOut() {
        // 1. Cerrar sesión en Firebase
        auth.signOut()

        // 2. IMPORTANTE: Limpiar también la sesión de Google Sign-In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        val googleSignInClient = GoogleSignIn.getClient(this, gso)
        googleSignInClient.signOut().addOnCompleteListener {
            // 3. Ir a SignInActivity después de limpiar todo
            startActivity(Intent(this@MainActivity, SignInActivity::class.java))
            finish()
        }
    }

}

@Composable
fun MainScreen(
    userName: String,
    onSignOut: () -> Unit
) {
    val navController = rememberNavController()
    val currentRoute by navController.currentBackStackEntryAsState()
    val currentDestination = currentRoute?.destination?.route

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(),
        topBar = {
            TopAppBar(
                userName = userName,
                onSignOut = onSignOut
            )
        },
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,

            startDestination = Screen.Inico.rout,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Screen.Inico.rout) {
                InicioScreen()
            }
            composable(route = Screen.Diccionario.rout) {
                DicScreen()
            }
            composable(route = Screen.Desafíos.rout) {
                DesScreen()
            }
        }
    }
}

@Preview
@Composable
fun aser(){
    AiWordFlowTheme {
        MainScreen(userName = "Vanesa") { }
    }
}


