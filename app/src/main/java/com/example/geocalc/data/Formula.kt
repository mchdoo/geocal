package com.example.geocalc.data

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.geocalc.navigation.AppScreens
import com.example.geocalc.ui.theme.*

sealed class Formula(
    val title: String,
    val color: Color,
    val shape: Shape,
    val route: String = "",
) {
    object Cuadrado : Formula("Cuadrado", Green, RectangleShape, AppScreens.CuadradoScreen.route)
    object Circulo : Formula("Círculo", Red, CircleShape)
    object Triangulo : Formula("Triángulo", Yellow, TriangleShape)


}
fun getAllFormulas(): List<Formula> {
    return listOf<Formula>(
        Formula.Cuadrado,
        Formula.Circulo,
        Formula.Triangulo
    )
}
