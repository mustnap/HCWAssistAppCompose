package my.bloomy.hcwassistappcompose.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import my.bloomy.hcwassistappcompose.navigation.AUTH_GRAPH_ROUTE
import my.bloomy.hcwassistappcompose.navigation.Screen
import my.bloomy.hcwassistappcompose.screens.LoginScreen
import my.bloomy.hcwassistappcompose.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Login.route,
        route = AUTH_GRAPH_ROUTE
    ){
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}