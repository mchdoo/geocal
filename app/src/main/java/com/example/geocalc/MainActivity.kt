package com.example.geocalc

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.geocalc.navigation.AppNavigation
import com.example.geocalc.ui.theme.GeoCalcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }

    @Composable
    private fun App() {
        GeoCalcTheme {
            Surface (Modifier.background(MaterialTheme.colors.background)) {
                AppNavigation()
            }
        }
    }
}


