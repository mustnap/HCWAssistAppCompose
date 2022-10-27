package my.bloomy.hcwassistappcompose.navigation.nav_graph

import androidx.navigation.*
import androidx.navigation.compose.composable
import my.bloomy.hcwassistappcompose.navigation.DETAIL_ARGUMENT_KEY
import my.bloomy.hcwassistappcompose.navigation.DETAIL_ARGUMENT_KEY2
import my.bloomy.hcwassistappcompose.navigation.HOME_GRAPH_ROUTE
import my.bloomy.hcwassistappcompose.navigation.Screen
import my.bloomy.hcwassistappcompose.screens.DetailScreen
import my.bloomy.hcwassistappcompose.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                    defaultValue = "Stevdza-San"
                }
            )
        ) {
            DetailScreen(navController = navController)
        }
    }
}