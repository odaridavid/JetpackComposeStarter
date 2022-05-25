package com.example.luxacademydemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.luxacademydemo.ui.theme.LuxAcademyDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LuxAcademyDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun ListScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.Gray)
    ) {
        val list = listOf("Hello", "Test", "Test", "Test")
        items(list) {
            CardListItem(name = it)
        }
    }
}

@Composable
fun CardListItem(name: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp),
        elevation = 6.dp,
        shape = RoundedCornerShape(10.dp)
    
    ) {
        Text(
            text = name,
            modifier = Modifier.padding(6.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ListScreenPreview() {
    LuxAcademyDemoTheme {
        ListScreen()
    }
}