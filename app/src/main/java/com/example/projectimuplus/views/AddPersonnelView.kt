package com.example.projectimuplus.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun AddPersonnelView (){
    MaterialTheme{
        Scaffold(
            topBar = {
                TopAppBar(
                    elevation = 0.dp,
                    backgroundColor =  Color(0xff2D4059),
                    contentColor = Color.White,
                    title = {
                        Text("Personel Ekle")
                    }
                )
            },
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                val lightBlue = Color(0xffD6E6F2)
                Column() {
                    Text("Personel İsmi")
                    TextField(
                        value = "",
                        placeholder  = { Text("Personel İsmi") },
                        onValueChange ={},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = lightBlue,
                            cursorColor = Color.Black,
                            disabledLabelColor = lightBlue,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        shape = RoundedCornerShape(12.dp),
                    )
                }

                Spacer(modifier = Modifier.size(6.dp))

                Column() {
                    Text("Personel Soyismi")
                    TextField(
                        value = "",
                        placeholder  = { Text("Personel Soyismi") },
                        onValueChange ={},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = lightBlue,
                            cursorColor = Color.Black,
                            disabledLabelColor = lightBlue,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        shape = RoundedCornerShape(12.dp),
                    )
                }

                Spacer(modifier = Modifier.size(6.dp))

                Column() {
                    Text("Yaş")
                    TextField(
                        value = "",
                        placeholder  = {   Text("Yaş") },
                        onValueChange ={},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = lightBlue,
                            cursorColor = Color.Black,
                            disabledLabelColor = lightBlue,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        shape = RoundedCornerShape(12.dp),
                    )
                }

                Spacer(modifier = Modifier.size(6.dp))

                Column() {
                    Text("Adres")
                    TextField(
                        value = "",
                        placeholder  = {  Text("Adres") },
                        onValueChange ={},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = lightBlue,
                            cursorColor = Color.Black,
                            disabledLabelColor = lightBlue,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        shape = RoundedCornerShape(12.dp),
                    )
                }

                Spacer(modifier = Modifier.size(6.dp))

                Column() {
                    Text("Kan Grubu")
                    TextField(
                        value = "",
                        placeholder  = { Text("Kan Grubu") },
                        onValueChange ={},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = lightBlue,
                            cursorColor = Color.Black,
                            disabledLabelColor = lightBlue,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        shape = RoundedCornerShape(12.dp),
                    )
                }

                Spacer(modifier = Modifier.size(6.dp))

                Column() {
                    Text("İletişim No")
                    TextField(
                        value = "",
                        placeholder  = { Text("İletişim No") },
                        onValueChange ={},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = lightBlue,
                            cursorColor = Color.Black,
                            disabledLabelColor = lightBlue,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        shape = RoundedCornerShape(12.dp),
                    )
                }

                Spacer(modifier = Modifier.size(24.dp))

                OutlinedButton(
                    shape = RoundedCornerShape(12.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(vertical = 4.dp).fillMaxWidth().height(50.dp),
                    elevation = ButtonDefaults.elevation(),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(0xFF2D4059),
                        contentColor = Color(0xFFFFFFFF),
                        disabledContentColor = Color(0xFFFFFFFF)
                    )
                ) {
                    Text(text = "Personel Ekle")
                }
            }
        }
    }
}