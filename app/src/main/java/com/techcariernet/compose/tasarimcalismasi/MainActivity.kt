package com.techcariernet.compose.tasarimcalismasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techcariernet.compose.tasarimcalismasi.ui.theme.AnaRenk
import com.techcariernet.compose.tasarimcalismasi.ui.theme.AnaRenkDark
import com.techcariernet.compose.tasarimcalismasi.ui.theme.TasarimCalismasiTheme
import com.techcariernet.compose.tasarimcalismasi.ui.theme.YaziRenk1
import com.techcariernet.compose.tasarimcalismasi.ui.theme.YaziRenk2
import com.techcariernet.compose.tasarimcalismasi.ui.theme.pasifico

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
//left-start:android, leading:ios
//@xml dosyalarında res klasorunu temsil eder.
//R kotlin dosyalarında res klasorunu temsil eder.
//string yapısının bir avantajı da çoklu dil destegidir.
//project calues-tr içine tüürkce secenek yazacağız
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa(darkTheme: Boolean = isSystemInDarkTheme(),
) {

    //ekran boyutuna göre içerikleri ayarlar.
    val configration = LocalConfiguration.current
    val ekran_genişligi=configration.screenWidthDp
    val ekranYuksekliği=configration.screenHeightDp
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Pizza", fontFamily = pasifico) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = if(darkTheme) AnaRenkDark else AnaRenk ,
                    titleContentColor = YaziRenk1,

                    )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            //padding(paddingvalues) kullanımı çevresine bir boşluk vermiş oluyoruz..

            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.pizzaBaslik),
                color = AnaRenk,
                fontWeight = FontWeight.Bold,
                fontSize = (ekran_genişligi/10).sp
            )
            Image(painter = painterResource(id = R.drawable.pizza_resim), contentDescription = "")
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Chip(icerik = stringResource(id = R.string.peynirYazi))
                Chip(icerik = stringResource(id = R.string.sucukYazi))
                Chip(icerik = stringResource(id = R.string.zeytinYazi))
                Chip(icerik = stringResource(id = R.string.biberYazi))

            }
            Text(
                text = stringResource(id = R.string.teslimatSüre),
                color = YaziRenk2,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                text = stringResource(id = R.string.pizzaBaslik),
                color = AnaRenk,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                text = stringResource(id = R.string.pizzaAcıklama),
                color = YaziRenk2,
                fontSize = 22.sp,
                textAlign = TextAlign.Center
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = (ekran_genişligi/10).dp,(ekran_genişligi/10).dp),
                horizontalArrangement = Arrangement.SpaceEvenly
                //veya Arrangement SpaceBeetween
            )
            {
                Text(
                    text = stringResource(id = R.string.fiyat),
                    color = AnaRenk,
                    fontWeight = FontWeight.Bold,
                    fontSize = 44.sp
                )
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AnaRenk,
                        contentColor = YaziRenk1
                    )
                ) {
                    Text(text = stringResource(id = R.string.teslimatBaslik), fontSize = 18.sp)
                }
            }

        }
    }
}


@Preview(showBackground = true, locale = "tr")
@Composable
fun GreetingPreview() {
    TasarimCalismasiTheme {
        Anasayfa()
        //Bu fonksiyon bizim tasarımımızı önizleyecek
    }
}