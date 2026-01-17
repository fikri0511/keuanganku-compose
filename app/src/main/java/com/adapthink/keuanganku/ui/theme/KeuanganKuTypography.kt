package com.adapthink.keuanganku.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Created by Muhammad Fikri Fadilah on 14/01/2026
 */
object KeuanganKuTypography {
    val title = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    )

    val body = TextStyle(
        fontSize = 14.sp
    )

    val caption = TextStyle(
        fontSize = 12.sp,
        color = AppColors.TextSecondary
    )
}
