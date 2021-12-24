package com.example.projectimuplus.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@ExperimentalFoundationApi
@Composable
fun SoldApartments (){
    MaterialTheme() {
        Scaffold(
            topBar = {
                TopAppBar(
                    elevation = 0.dp,
                    backgroundColor =  Color(0xff222831),
                    contentColor = Color.White,
                    title = {
                        Text("Satılan Daireler")
                    }
                )
            },
        ) {
            val numbers = (0..20).toList()
            LazyColumn(
                contentPadding = PaddingValues(24.dp),
                verticalArrangement = Arrangement.spacedBy(18.dp),
            ) {
                items(numbers.size) {
                    Card(
                        modifier = Modifier.size(500.dp, 150.dp),
                        shape = RoundedCornerShape(4.dp),
                        elevation = 1.dp,
                        border = BorderStroke(1.dp, Color(0xff393E46))
                    ) {
                        Column(
                            horizontalAlignment = Alignment.Start
                        ) {
                            Column() {
                               Text(text = "Apartman Adı")
                               Text(text = "Güneş Apartmanı",)
                           }
                            Row() {
                                Row() {
                                    Text(text = "Kat")
                                    Text(text = "3",)
                                }
                                Row() {
                                    Text(text = "Oda Sayısı")
                                    Text(text = "3",)
                                }
                            }
                        }
                    }
                    Spacer(Modifier.width(14.dp))
                }
            }
        }
    }
}