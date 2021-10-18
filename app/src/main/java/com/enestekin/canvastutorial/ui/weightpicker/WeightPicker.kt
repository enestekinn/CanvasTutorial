package com.enestekin.canvastutorial.ui.weightpicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.enestekin.canvastutorial.ui.weightpicker.ui.theme.CanvasTutorialTheme

class WeightPicker : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
     var weight  by remember {
         mutableStateOf(80)
     }
            CanvasTutorialTheme {
                androidx.compose.material.Surface(color = MaterialTheme.colors.background) {
                    Box(modifier = Modifier.fillMaxSize()){
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Spacer(modifier = Modifier.height(32.dp))
                            Text(
                                text = "Select weight by draggging",
                                style = TextStyle(
                                    fontSize = 24.sp
                                )
                            )
                            Spacer(modifier = Modifier.height(32.dp))
Text(
    text = "$weight KG",
    style = TextStyle(fontSize = 24.sp)
)
                        }
                    Scale(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                            .align(Alignment.BottomCenter),
                        style = ScaleStyle(
                            scaleWidth = 150.dp
                        )
                    ){
                        weight = it
                    }
                    }
                }
            }

        }
    }
}

