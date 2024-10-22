package com.example.composenavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNavigations()
        }
    }
}

@Composable
fun MyNavigations(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "MainScreen") {
        composable(route = "MainScreen") {
            MainScreen(navController)
        }

        composable(route = "InformationScreen/{username}/{family}/{ID}", arguments = listOf(
            navArgument("username") { type = NavType.StringType },
            navArgument("family") { type = NavType.StringType },
            navArgument("ID") { type = NavType.StringType }
        )) { navStackEntry ->
            val username = navStackEntry.arguments?.getString("username")
            val family = navStackEntry.arguments?.getString("family")
            val ID = navStackEntry.arguments?.getString("ID")
            InformationScreen(navController,username!!,family!!,ID!!)
        }

        composable(route = "SuccessScreen") {
            SuccessScreen(navController)
        }
    }
}