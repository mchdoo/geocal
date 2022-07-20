package com.example.geocalc.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun CustomAppBar(
    backgroundColor: Color = MaterialTheme.colors.background,
    title: @Composable () -> Unit = {},
    icon: ImageVector = Icons.Filled.ArrowBack,
    onClickNavIcon: () -> Unit = { },
    actions: @Composable() (RowScope.() -> Unit)  = {}
) {

    TopAppBar(
        backgroundColor = backgroundColor,
        contentColor = MaterialTheme.colors.onBackground,
        elevation = 0.dp,
        title = title,
        navigationIcon = {
            IconButton(
                onClick = onClickNavIcon,
            ) {
                Icon(imageVector = icon, contentDescription = null)
            }
        },
        actions = actions
    )
}