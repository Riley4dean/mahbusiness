package com.example.mahbusiness


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mahbusiness.ui.theme.MahBusinessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MahBusinessTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Card(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Card(name: String, modifier: Modifier = Modifier) {
    Column( verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(color = Color.Gray)) {
        Spacer(Modifier.height(60.dp))
        NameInfo(modifier.align(alignment = Alignment.CenterHorizontally))
        Spacer(Modifier.height(50.dp))
        Contact(modifier.align(alignment = Alignment.CenterHorizontally))
    }
}

@Composable
fun NameInfo(modifier : Modifier) {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = modifier
                .height(120.dp)
                .background(
                    color = Color.Black

                )
        )
        Text(
            text = "Riley Dean",
            modifier = modifier

        )
        Text(
            text = "Unprofessional Valorant Player",
            modifier = modifier
        )
    }
}

@Composable
fun Contact(modifier : Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
        Icon(
            Icons.Rounded.Call,
            contentDescription = null
        )
        Text(
            text = "(九 一 一)",
            modifier = modifier
        )
        }
        Row{
        Icon(
            Icons.Rounded.Email,
            contentDescription = null
        )
        Text(
            text = "ieatrocks@goodmail.mom",
            modifier = modifier
        )}
        Row {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null
            )
            Text(
                text = "rileyMcBeast123",
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    MahBusinessTheme {
        Card("Android")
    }
}