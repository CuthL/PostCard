package com.example.postcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.postcard.ui.theme.PostCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PostCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(message = "Cuthbert Langevine", from = "cuthbert.langevine@csi.cuny.edu")
                }

                }
            }
        }
    }


@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = message,
            fontSize = 75.sp,
            lineHeight = 116.sp,
            color = Color.Blue,
            textAlign = TextAlign.Center

        )
        Text(
            text = from,
            fontSize = 30.sp,
            lineHeight = 65.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PostCardTheme {
        GreetingImage("Cuthbert Langevine", from = "cuthbert.langevine@csi.cuny.edu")
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.project_image)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.5F
    )
    GreetingText(
        message = message,
        from = from,
        modifier = Modifier.fillMaxSize().padding(8.dp)
    )
}