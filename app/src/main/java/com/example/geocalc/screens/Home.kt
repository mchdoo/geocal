package com.example.geocalc.screens

import android.content.res.Configuration
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.ScrollScope
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.geocalc.navigation.AppScreens
import com.example.geocalc.ui.theme.*

@Composable
fun generalAppBar(title: @Composable () -> Unit, icon: ImageVector = Icons.Filled.ArrowBack, onCLickNavIcon: () -> Unit = {}) {

    TopAppBar(
        backgroundColor = Color.Transparent,
        contentColor = MaterialTheme.colors.onBackground,
        elevation = 0.dp,
        title = title,
        navigationIcon = {
            IconButton(
                onClick = onCLickNavIcon,
            ) {
                Icon(imageVector = icon, contentDescription = null)
            }
        },
    )
}

@Composable
fun Home(navController: NavController) {
    Scaffold(
        topBar = { generalAppBar(icon = Icons.Filled.Menu, title = {}, onCLickNavIcon = {navController.navigate(AppScreens.home.route)}) }
    ) {
        MainContent(navController)
    }
}

@Composable
fun MainContent(navController: NavController){

    val scrollState = ScrollState(0)

    val space = 20.dp

    Column {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = space)
        ) {
            Text("Geometría", style = MaterialTheme.typography.h4, fontWeight = FontWeight.ExtraBold)
            Spacer(Modifier.size(space + 5.dp))
        }
        Row(
            Modifier
                .horizontalScroll(state = scrollState),
        ) {
            Spacer(Modifier.size(space))
            ButtonForm(Red, CircleShape, "Círculos")
            Spacer(Modifier.size(space))
            ButtonForm(Yellow, RectangleShape, "Cuadrados")
            Spacer(Modifier.size(space))
            ButtonForm(Green, TriangleShape, "Triángulos", onClick = { navController.navigate(AppScreens.triangleScreen.route) })
            Spacer(Modifier.size(space))
        }
    }
}

@Composable
fun ButtonForm( color: Color = Red, shape: Shape = RectangleShape, name: String = "Undefined", onClick: () -> Unit = {}) {
    Column (modifier = Modifier.clickable(onClick = onClick)) {

        Box {

            Box (Modifier
                .matchParentSize()
                .alpha(0.3f)
                .background(special(color), RoundedCornerShape(40.dp))
            )

            Box(modifier = Modifier
                .padding(50.dp)
            ) {

                Column {
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .align(Alignment.CenterHorizontally)
                            .background(special(color), shape)
                    )
//                    Text(name,
//                        modifier = Modifier.padding(top = 10.dp).alpha(0.8f),
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color.White,
//                    )
                }
            }
        }
    }
}