package com.example.geocalc.screens

import android.content.res.Configuration
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.geocalc.components.CustomAppBar
import com.example.geocalc.ui.theme.GeoCalcTheme

@Composable
fun TrianguloScreen(navController: NavController) {
    GeoCalcTheme {
        Scaffold (
            topBar = { CustomAppBar(
                onClickNavIcon = {navController.popBackStack()},
                title = {Text("Triángulo")}
            )}
        ){
            BodyContent()
        }
    }
}

@Composable
fun BodyContent() {

    val textState = remember { mutableStateOf("") }

    Box (Modifier.padding(20.dp)) {
        Box(Modifier
            .fillMaxWidth()
            .border(width = 1.dp, shape = RoundedCornerShape(20.dp), color = MaterialTheme.colors.onBackground)
        ) {
            Column(Modifier.padding(20.dp)) {
                Text("Datos del triángulo", style = MaterialTheme.typography.h4, fontWeight = FontWeight.ExtraBold)
                Spacer(Modifier.size(20.dp))
                OutlinedTextField(
                    value = textState.value,
                    onValueChange = {
                        textState.value = it
                    },
                    placeholder = {
                        Text("Cateto mayor")
                    }
                )
            }
        }
    }
}