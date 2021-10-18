package com.enestekin.canvastutorial

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.enestekin.canvastutorial.ui.theme.CanvasTutorialTheme
import com.enestekin.canvastutorial.ui.weightpicker.WeightPicker

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CanvasTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ButtonsContainer()
                }
            }
        }
    }


@Composable
fun ButtonsContainer(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                openBasicShapeActivity()
            },
            modifier = Modifier.background(MaterialTheme.colors.primary)
        ) {
            Text(
                text = "Basic shapes",
                modifier = Modifier.wrapContentSize(),
                style = TextStyle(MaterialTheme.colors.onPrimary)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                openBallClickerGameActivity()
            },
            modifier = Modifier.background(MaterialTheme.colors.primary)
        )
        {

            Text(
                text = "Ball Clicker",
                modifier = Modifier.wrapContentSize(),
                style = TextStyle(MaterialTheme.colors.onPrimary)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                openDrawTextActivity()
            },
            modifier = Modifier.background(MaterialTheme.colors.primary)
        ) {
            Text(
                text = "Draw Text",
                modifier = Modifier.wrapContentSize(),
                style = TextStyle(MaterialTheme.colors.onPrimary)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                weightPicker()
            },
            modifier = Modifier.background(MaterialTheme.colors.primary)
        ) {
            Text(
                text = "Weight Picker",
                modifier = Modifier.wrapContentSize(),
                style = TextStyle(MaterialTheme.colors.onPrimary)
            )
        }
    }
}
private fun openBasicShapeActivity(){
    val intent = Intent(this,BasicShapeActivity::class.java)
    startActivity(intent)
}

    private fun openBallClickerGameActivity(){
        val intent = Intent(this,BallClickerGame::class.java)
        startActivity(intent)
    }
    private fun openDrawTextActivity() {
        val intent = Intent(this, DrawText::class.java)
        startActivity(intent)
    }

    private fun weightPicker() {
        val intent = Intent(this, WeightPicker::class.java)
        startActivity(intent)
    }
    }