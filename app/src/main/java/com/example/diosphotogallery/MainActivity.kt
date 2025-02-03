package com.example.diosphotogallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diosphotogallery.ui.theme.DiosPhotoGalleryTheme
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.HorizontalDivider
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.diosphotogallery.R
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
                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        color = Color.Gray,
                        thickness = 1.dp)

                    Row (
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ){

                        Box(
                            modifier = Modifier
                                .wrapContentSize()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.nanjing),
                                contentDescription = "Food Image",
                                modifier = Modifier
                                    .size(300.dp)
                                    .padding(top = 8.dp)
                                    .align(Alignment.TopStart)
                            )
                            
                        }


                    }
                    Row {
                        /*TODO: photo row 2*/
                    }
                    Row {
                        /*TODO: photo row 3*/
                    }
                }
            }
        }
    }
}
