package com.techcariernet.compose.tasarimcalismasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.techcariernet.compose.tasarimcalismasi.ui.theme.TasarimCalismasiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TasarimCalismasiTheme {
              Anasayfa()
                }
            }
        }
    }
//run ettiğimiz zaman çalışacağımız sayfa

@Composable
fun Anasayfa(){
    Text(text = "Merhaba Dünya!!!")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TasarimCalismasiTheme {
        Anasayfa()
        //Bu fonksiyon bizim tasarımımızı önizleyecek
    }
}