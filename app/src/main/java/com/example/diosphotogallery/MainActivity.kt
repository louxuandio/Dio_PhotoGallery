package com.example.diosphotogallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diosphotogallery.ui.theme.DiosPhotoGalleryTheme
import androidx.compose.foundation.layout.*
//I asked ChatGPT about what do I need to import


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            DiosPhotoGalleryTheme {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ){
                    Text("Dio's Photo Gallery",
                        modifier = Modifier
                            .padding(bottom = 8.dp),
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold))
                    //ChatGPT helps me with this HorizontalDivider
                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        color = Color.Gray,
                        thickness = 1.dp)

                    Row (
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ){
                        Column {
                            Box(
                                modifier = Modifier
                                    .wrapContentSize()
                            ) {
                                Image(
                                    //I struggled a lot with import pics into drawable, and I solved that with the help of ChatGPT
                                    painter = painterResource(id = R.drawable.nanjing),
                                    contentDescription = "Nanjing Image",
                                    modifier = Modifier
                                        .size(200.dp)
                                        .padding(top = 8.dp)
                                        .align(Alignment.TopStart)
                                )
                            }
                            Text("Nanjing 2024.1",
                                modifier = Modifier
                                    .padding(8.dp)
                                    .align(Alignment.CenterHorizontally))
                        }
                        Column {
                            Box(
                                modifier = Modifier
                                    .wrapContentSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.newyork),
                                    contentDescription = "New York Image",
                                    modifier = Modifier
                                        .size(200.dp)
                                        .padding(top = 8.dp)
                                        .align(Alignment.TopStart)
                                )
                            }
                            Text("New York 2024.12",
                                modifier = Modifier
                                    .padding(8.dp)
                                    .align(Alignment.CenterHorizontally))
                        }
                    }
                    Row {
                        Column {
                            Box(
                                modifier = Modifier
                                    .wrapContentSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.cds),
                                    contentDescription = "CDS Image",
                                    modifier = Modifier
                                        .size(200.dp)
                                        .padding(top = 8.dp)
                                        .align(Alignment.TopStart)
                                )
                            }
                            Text("BU CDS 2023.10",
                                modifier = Modifier
                                    .padding(8.dp)
                                    .align(Alignment.CenterHorizontally))
                        }
                        Column {
                            Box(
                                modifier = Modifier
                                    .wrapContentSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.bucenter),
                                    contentDescription = "BU CENTER Image",
                                    modifier = Modifier
                                        .size(200.dp)
                                        .padding(top = 8.dp)
                                        .align(Alignment.TopStart)
                                )
                            }
                            Text("BU Center 2024.5",
                                modifier = Modifier
                                    .padding(8.dp)
                                    .align(Alignment.CenterHorizontally))
                        }
                    }
                    Row {
                        Column {
                            Box(
                                modifier = Modifier
                                    .wrapContentSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.tufts),
                                    contentDescription = "Tufts Image",
                                    modifier = Modifier
                                        .size(200.dp)
                                        .padding(top = 8.dp)
                                        .align(Alignment.TopStart)
                                )
                            }
                            Text("Tufts 2024.3",
                                modifier = Modifier
                                    .padding(8.dp)
                                    .align(Alignment.CenterHorizontally))
                        }
                        Column {
                            Box(
                                modifier = Modifier
                                    .wrapContentSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.harvard),
                                    contentDescription = "Harvard Image",
                                    modifier = Modifier
                                        .size(200.dp)
                                        .padding(top = 8.dp)
                                        .align(Alignment.TopStart)
                                )
                            }
                            Text("Harvard 2024.2",
                                modifier = Modifier
                                    .padding(8.dp)
                                    .align(Alignment.CenterHorizontally))
                        }
                    }
                }
            }
        }
    }
}
