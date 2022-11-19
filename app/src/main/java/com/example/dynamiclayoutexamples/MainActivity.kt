package com.example.dynamiclayoutexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Slider
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dynamiclayoutexamples.dynamicIslands.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                var progress by remember { mutableStateOf(0f) }
                ProfileHeader(progress = progress)
                Spacer(modifier = Modifier.height(32.dp))
                Slider(value = progress,
                    onValueChange = { progress = it },
                    modifier = Modifier.padding(horizontal = 32.dp)
                )
                MotionLayoutPhoneCall()
                MotionLayoutTaxi()
                MotionLayoutFlight()
            }
        }
    }
}

