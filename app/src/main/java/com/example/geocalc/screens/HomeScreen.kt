package com.example.geocalc.screens

import android.graphics.Color.alpha
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.geocalc.components.CustomAppBar
import com.example.geocalc.data.Formula
import com.example.geocalc.data.getAllFormulas
import com.example.geocalc.navigation.AppScreens
import com.example.geocalc.ui.theme.FadingWhite
import com.example.geocalc.ui.theme.GeoCalcTheme
import com.example.geocalc.ui.theme.special
import java.text.Normalizer

@ExperimentalFoundationApi
@Composable
fun HomeScreen(navController: NavController){
    GeoCalcTheme {
        Scaffold(topBar = {
                CustomAppBar(
                    icon = Icons.Filled.Menu,
                    title = {
                        Text(text = "Dashboard", fontWeight = FontWeight.ExtraBold)
                    },
                    actions = {
                        IconButton(onClick = { }) {
                            Icon(Icons.Default.Search, contentDescription = null)
                        }
                        IconButton(onClick = { }) {
                            Icon(Icons.Default.Person, contentDescription = null)
                        }
                    }
                )
        }
        ) {
            MainBody(navController, modifier = Modifier.padding(30.dp))
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun MainBody(navController: NavController, modifier: Modifier = Modifier) {
    Column {
        Text("Más usadas", fontWeight = FontWeight.Bold, fontSize = 18.sp, modifier = modifier)
        Row {
            Spacer(Modifier.size(20.dp))
            LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.padding()
            ) {
                val allFormulas: List<Formula> = getAllFormulas()
                items(allFormulas.size) { index ->
                    FormulaCard(allFormulas[index], navController = navController)
                }
            }
            Spacer(Modifier.size(20.dp))
        }
    }
}

@Composable
fun FormulaCard(formula: Formula, navController: NavController){
    val backdropShape: Shape = RoundedCornerShape(50.dp)

    Box (
        Modifier
            .size(150.dp)
            .clickable(onClick = {
                if (formula.route.isEmpty()) navController.popBackStack() else navController.navigate(
                    formula.route
                )
            })
    ) {
        Box (
            modifier = Modifier
                .alpha(if (formula.route.isEmpty()) 0.2f else 1.0f)
                .border(width = 1.dp, color = formula.color, shape = backdropShape)
                .background(special(formula.color), backdropShape)
                .aspectRatio(1f)
        ) {
            Box (
                Modifier
                    .align(Alignment.Center)
                    .size(70.dp)
                    .background(Brush.linearGradient(listOf(formula.color, Color.Transparent)), formula.shape)
            )
        }
    }
}

