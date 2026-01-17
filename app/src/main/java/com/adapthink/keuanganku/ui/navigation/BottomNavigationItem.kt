package com.adapthink.keuanganku.ui.navigation

import android.widget.Space
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.adapthink.keuanganku.ui.theme.AppColors
import com.adapthink.keuanganku.ui.theme.KeuanganKuTypography
import com.adapthink.keuanganku.ui.theme.KeuanganKuTypography.caption
import com.adapthink.keuanganku.ui.theme.Spacing.dp22
import com.adapthink.keuanganku.ui.theme.Spacing.dp4
import com.adapthink.keuanganku.ui.theme.Spacing.dp8

/**
 * Created by Muhammad Fikri Fadilah on 14/01/2026
 */
@Composable
internal fun RowScope.BottomNavigationItem(
    item: BottomNavItem,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val contentColor = if (isSelected) AppColors.Primary else AppColors.TextSecondary
    Column(
        modifier = Modifier
            .weight(1f)
            .clickable(onClick= onClick)
            .padding(vertical = dp8),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = item.icon,
            contentDescription = item.label,
            tint = contentColor,
            modifier = Modifier.size(dp22)
        )
        Spacer(modifier = Modifier.height(dp4))
        Text(
            text = item.label,
            style = caption,
            color = contentColor
        )

    }
}