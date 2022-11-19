package com.example.dynamiclayoutexamples.dynamicIslands

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.layoutId


@Composable
fun CallIcon(modifier: Modifier = Modifier, icon: Int, backgroundColor: Color) {
    Box(
        modifier = modifier
            .size(50.dp)
            .clip(CircleShape)
            .background(backgroundColor),
        Alignment.Center
    ) {
        Icon(
            modifier = Modifier
                .size(28.dp)
                .layoutId("icCall"),
            painter = painterResource(id = icon),
            contentDescription = "",
            tint = Color.White
        )
    }
}