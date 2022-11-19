package com.example.dynamiclayoutexamples.dynamicIslands

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CallIconFlight(modifier: Modifier = Modifier, icon: Int, backgroundColor: Color) {
    Row(
        modifier = modifier
            .width(60.dp)
            .height(24.dp)
            .padding(end = 8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(backgroundColor),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier
                .size(22.dp)
                .layoutId("icCall"),
            painter = painterResource(id = icon),
            contentDescription = "",
            tint = Color.Black
        )
        Text(text = "2")
    }
}