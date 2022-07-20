package com.example.geocalc.ui.theme

import android.hardware.lights.Light
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradient
import androidx.core.graphics.scaleMatrix

fun special(color: Color): Brush {
    return (
            Brush.linearGradient(
                colors = listOf(Color.Transparent, color),
            ))
}
val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val Red = Color(0xFFCC3131)
val Yellow = Color(0xFFDBD541)
val Green = Color(0xFF4C974B)

val Surface = Color(0x1AFFFFFF)
val OnSurface = Color.White

val FadingWhite = Brush.linearGradient(listOf(Color(0xDDFFFFFF), Color.Transparent))
