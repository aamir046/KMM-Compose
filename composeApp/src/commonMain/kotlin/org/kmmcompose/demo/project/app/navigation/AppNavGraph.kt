package org.kmmcompose.demo.project.app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.kmmcompose.demo.project.app.navigation.Distinations.HOME_SCREEN_BOOKS_ROUTE
import org.kmmcompose.demo.project.presentation.homebookslist.HomeBooksListScreen

@Composable
fun AppNavGraph(
    navHostController: NavHostController = rememberNavController(),
    startDestination:String = HOME_SCREEN_BOOKS_ROUTE,
    navActions: AppNavigation = remember(navHostController) {
        AppNavigation(navHostController)
    }
){

    NavHost(navController = navHostController, startDestination = startDestination){
        composable(
            HOME_SCREEN_BOOKS_ROUTE
        ) {
            HomeBooksListScreen()
        }
    }

}