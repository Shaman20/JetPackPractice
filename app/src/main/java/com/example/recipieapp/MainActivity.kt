package com.example.recipieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipieapp.ui.theme.RecipieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipieAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .verticalScroll(
                rememberScrollState()
            )
    ) {
        Row(
            modifier = Modifier.padding(5.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.happy_meal),
                contentDescription = "Happy Meal",
                modifier = Modifier.height(300.dp),
                contentScale = ContentScale.Crop
            )
        }
        Row(
            modifier = Modifier.align(CenterHorizontally).padding(top = 5.dp)
        ) {
            Text(
                text = "Happy Meal",
                style = TextStyle(
                    fontSize = 26.sp,
                    color = Color.Black
                )
            )
        }
        Spacer(modifier = Modifier.size(10.dp))
        Row(modifier.padding(start = 10.dp)) {
            Text(
                text = "This is a full meal with which you can have fun all alone",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.DarkGray
                )
            )
        }
        Spacer(modifier = Modifier.size(5.dp))

        Row(modifier.padding(start = 10.dp)) {
            Text(
                text = "50$",
                style = TextStyle(
                    fontSize = 17.sp,
                    color = Color.Gray
                )
            )
        }

        Spacer(modifier = Modifier.size(5.dp))

        Row(
            modifier = Modifier.align(CenterHorizontally).padding(bottom = 10.dp)
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Order Now", style = TextStyle(fontSize = 16.sp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RecipieAppTheme {
        Greeting("Android")
    }
}