package com.example.contadordevidas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaPrincipal()

        }
    }
}



@Composable
fun PantallaPrincipal( ){
        var texto by remember {
            mutableStateOf("25/0")
        }
    var texto2 by remember {
        mutableStateOf("25/0")
    }


        Column {
            Row() {

                    Button(onClick = {
                        val partes=  texto.split("/")
                        val numero=partes[0].toIntOrNull()
                        if (numero!=null){
                            val resultado= numero-1
                            texto=resultado.toString()+"/"+partes[1]

                        }else{

                        }
                    }) {
                        Text(text = "-")
                    }


                    Button(onClick = {
                      val partes=  texto.split("/")
                      val numero=partes[1].toIntOrNull()
                        if (numero!=null){
                            val resultado= numero-1
                            texto=partes[0]+"/"+resultado.toString()

                        }else{

                        }


                    }) {
                        Text(text = "-")
                    }


            }
            Row {
                Button(onClick = {
                    val partes=  texto.split("/")
                    val numero=partes[0].toIntOrNull()
                    if (numero!=null){
                        val resultado= numero+1
                        texto=resultado.toString()+"/"+partes[1]

                    }else{

                    }}) {
                    Text(text = "+")
                }
                Text(text = texto2,
                    fontSize = 30.sp)

                Button(onClick = {
                    val partes=  texto.split("/")
                    val numero=partes[1].toIntOrNull()
                    if (numero!=null){
                        val resultado= numero+1
                        texto=partes[0]+"/"+resultado.toString()

                    }else{

                    } }) {
                    Text(text = "+")
                }
            }
            
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Arriba")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Abajo")
            }
            Row {
                Button(onClick = {
                    val partes=  texto2.split("/")
                    val numero=partes[0].toIntOrNull()
                    if (numero!=null){
                        val resultado= numero+1
                        texto2=resultado.toString()+"/"+partes[1]

                    }else{

                    } }) {
                    Text(text = "+")
                }
                Text(text =texto2,
                    fontSize = 30.sp)
                Button(onClick = {
                    val partes=  texto2.split("/")
                    val numero=partes[1].toIntOrNull()
                    if (numero!=null){
                        val resultado= numero+1
                        texto2=partes[0]+"/"+resultado.toString()

                    }else{

                    } }) {
                    Text(text = "+")
                    
                }
            }
            Row {
                Button(onClick = { val partes=  texto2.split("/")
                    val numero=partes[0].toIntOrNull()
                    if (numero!=null){
                        val resultado= numero-1
                        texto2=resultado.toString()+"/"+partes[1]

                    }else{

                    }}) {
                    Text(text = "-")
                }
                Button(onClick = {
                    val partes=  texto2.split("/")
                    val numero=partes[1].toIntOrNull()
                    if (numero!=null){
                        val resultado= numero-1
                        texto2=partes[0]+"/"+resultado.toString()
                    }else{

                    }}) {
                    Text(text = "-")
                }
            }
        }



}

