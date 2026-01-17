package com.adapthink.keuanganku.ui.navigation

/**
 * Created by Muhammad Fikri Fadilah on 17/01/2026
 */
sealed class NavRoute(val route: String) {
    data object Home: NavRoute("home")
    data object Detail: NavRoute("Detail")
    data object Transfer: NavRoute("Transfer")
    data object Setting: NavRoute("Setting")
}