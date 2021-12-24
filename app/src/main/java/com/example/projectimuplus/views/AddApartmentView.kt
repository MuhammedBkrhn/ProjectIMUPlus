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
fun AddApartmentView (){
    MaterialTheme{
        Scaffold(
            topBar = {
                TopAppBar(
                    elevation = 0.dp,
                    backgroundColor =  Color(0xff2D4059),
                    contentColor = Color.White,
                    title = {
                        Text("Daire Ekle")
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
                    Text("Apartman İsmi")
                    TextField(
                        value = "",
                        placeholder  = { Text("Apartman İsmi") },
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
                    Text("Oda Sayısı")
                    TextField(
                        value = "",
                        placeholder  = {   Text("Oda Sayısı") },
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
                    Text("Kat")
                    TextField(
                        value = "",
                        placeholder  = {   Text("Kat") },
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
                   Text("İl")
                   TextField(
                       value = "",
                       placeholder  = { Text("İl") },
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
                    Text("İlçe")
                    TextField(
                        value = "",
                        placeholder  = { Text("İlçe") },
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
                    Text("Daire Ücreti")
                    TextField(
                        value = "",
                        placeholder  = {   Text("Daire Ücreti") },
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

                Spacer(modifier = Modifier.size(18.dp))

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
                    Text(text = "Daireyi Ekle")
                }
            }
        }
    }
}