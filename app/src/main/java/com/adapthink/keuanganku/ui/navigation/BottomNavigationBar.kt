package com.adapthink.keuanganku.ui.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.adapthink.keuanganku.ui.theme.Spacing.dp4
import com.adapthink.keuanganku.ui.theme.Spacing.dp64
import com.adapthink.keuanganku.ui.theme.Spacing.dp8

/**
 * Created by Muhammad Fikri Fadilah on 14/01/2026
 */
@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    selectedRoute: String,
    onItemSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        tonalElevation = dp4,
        shadowElevation = dp8,
        color = Color.White,
        modifier = modifier
            .fillMaxWidth()
            .height(dp64)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = dp4),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEach { item ->
                BottomNavigationItem(
                    item = item,
                    isSelected = item.route == selectedRoute,
                    onClick = { onItemSelected(item.route) }
                )
            }
        }
    }
}