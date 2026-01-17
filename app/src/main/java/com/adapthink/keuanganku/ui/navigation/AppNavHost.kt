package com.adapthink.keuanganku.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.adapthink.keuanganku.ui.screen.detail.DetailScreen
import com.adapthink.keuanganku.ui.screen.home.HomeRoute
import com.adapthink.keuanganku.ui.screen.setting.SettingScreen
import com.adapthink.keuanganku.ui.screen.transfer.TransferScreen

/**
 * Created by Muhammad Fikri Fadilah on 14/01/2026
 */
@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: NavRoute.Home.route

    val bottomNavItems = listOf(
        BottomNavItem(
            route = NavRoute.Home.route,
            label = "Home",
            icon = Icons.Default.Home
        ),
        BottomNavItem(
            route = NavRoute.Detail.route,
            label = "Detail",
            icon = Icons.Default.Build
        ),
        BottomNavItem(
            route = NavRoute.Transfer.route,
            label = "Transfer",
            icon = Icons.Filled.Create
        ),
        BottomNavItem(
            route = NavRoute.Setting.route,
            label = "Atur",
            icon = Icons.Default.Settings
        ),
    )

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                items = bottomNavItems,
                selectedRoute = currentRoute,
                onItemSelected = { route ->
                    navController.navigate(route) {
                        popUpTo(NavRoute.Home.route) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavRoute.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(NavRoute.Home.route) { HomeRoute() }
            composable(NavRoute.Detail.route) { DetailScreen() }
            composable(NavRoute.Transfer.route) { TransferScreen() }
            composable(NavRoute.Setting.route) { SettingScreen() }
        }
    }
}