package com.enestekin.canvastutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.enestekin.canvastutorial.ui.theme.CanvasTutorialTheme

class BasicShapeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CanvasTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    MyCanvas()
                }
            }
        }
    }


}


@Composable
fun MyCanvas() {
    Canvas(
        modifier = Modifier
            .padding(20.dp)
            .size(300.dp)
    ){

        drawRect(
            color = Color.Black,
            size = size
        )
        drawRect(
            color = Color.Red,
            topLeft = Offset(100f,100f),
            size = Size(100f,100f),
            style = Stroke(
                width = 3.dp.toPx()
            )
        )
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(Color.Red,Color.Yellow),
                center = center,
                radius = 100f
            ),
            radius = 100f
        )

        drawArc(
            color = Color.Green,
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(100f,400f),
            size = Size(200f,200f)
        )
        drawOval(
            color = Color.Magenta,
            topLeft = Offset(400f,100f),
            size = Size(200f,300f)
        )
        drawLine(
            color = Color.Blue,
            start = Offset(100f,50f),
            end = Offset(500f,50f),
            strokeWidth = 10.dp.toPx()
        )
    }

}

