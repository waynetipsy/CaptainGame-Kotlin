package app.ify.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.ify.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                CaptainGame()

            }
        }
    }
}

@Composable
fun CaptainGame() {
   val treasureFound = remember { mutableStateOf(0) }
   // val treasureFound by remember { mutableStateOf(0) }
    val direction = remember { mutableStateOf("North") }
    val  storm0rTreasure = remember { mutableStateOf("")

    }

    Column {
        Text(text = "Treasure Found: ${treasureFound.value}")
        Text(text = "Current Direction : ${direction.value}")
        Text(text = "${storm0rTreasure.value}")
        Button(onClick = {
            direction.value = "East"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                storm0rTreasure.value = "WE FOUND A TREASURE"
            }else {
                storm0rTreasure.value = "STORM AHEAD!!!"
            }
        }) {
            Text("Sail East")
        }
        Button(onClick = {
            direction.value = "North"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                storm0rTreasure.value = "WE FOUND A TREASURE"
            }else {
                storm0rTreasure.value = "STORM AHEAD!!!"
            }
        }) {
            Text("Sail North")
        }
        Button(onClick = {
            direction.value = "South"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                storm0rTreasure.value = "WE FOUND A TREASURE"
            }else {
                storm0rTreasure.value = "STORM AHEAD!!!"
            }
        }
        ) {
            Text("Sail South")
        }
        Button(onClick = {
            direction.value = "West"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                storm0rTreasure.value = "WE FOUND A TREASURE"
            }else {
                storm0rTreasure.value = "STORM AHEAD!!!"
            }
        }
        ) {
            Text("Sail West")
        }
    }
}}




