package com.adapthink.keuanganku.ui

import androidx.compose.runtime.Composable
import com.adapthink.keuanganku.ui.navigation.AppNavHost
import com.adapthink.keuanganku.ui.theme.KeuangankuTheme

/**
 * Created by Muhammad Fikri Fadilah on 14/01/2026
 */
@Composable
fun KeuanganKu() {
    KeuangankuTheme {
        AppNavHost()
    }
}