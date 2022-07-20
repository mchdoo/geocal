package com.example.geocalc.screens

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Build
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.geocalc.components.CustomAppBar
import com.example.geocalc.data.Formula
import com.example.geocalc.ui.theme.FadingWhite
import com.example.geocalc.ui.theme.GeoCalcTheme
import com.example.geocalc.ui.theme.Red
import java.lang.Character.isDigit
import java.lang.Math.floorMod
import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CuadradoScreen(navController: NavController) {

    var b by remember {mutableStateOf<String>("")}
    var h by remember {mutableStateOf<String>("")}

    val aspectRatio: Float = if (b.isNotEmpty() && h.isNotEmpty()) {
        ( b.toInt() / h.toInt()).toFloat()
    } else {
        1f
    }

    val space: Dp = 10.dp

    GeoCalcTheme() {
        Scaffold(
            topBar = {
                CustomAppBar(
                    title = { Text("Cuadrado") },
                    onClickNavIcon = { navController.popBackStack() },
                    actions = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.Clear, contentDescription = null)
                        }
                    }
                    )
            }
        ) {

        }
    }
}
@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun RenderShape(b: Int, h: Int, aspectRatio: Float) {

}