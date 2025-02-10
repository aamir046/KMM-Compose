package org.kmmcompose.demo.project.app.navigation

import androidx.navigation.NavHostController
import org.kmmcompose.demo.project.app.navigation.AppScreens.HOME_SCREEN_BOOKS

private object AppScreens{
     const val HOME_SCREEN_BOOKS:String = "home"
}

object Distinations{
    const val HOME_SCREEN_BOOKS_ROUTE = HOME_SCREEN_BOOKS
}

class AppNavigation(navHostController: NavHostController) {

}