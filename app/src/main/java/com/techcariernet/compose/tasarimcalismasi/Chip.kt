package com.techcariernet.compose.tasarimcalismasi

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.techcariernet.compose.tasarimcalismasi.ui.theme.AnaRenk
import com.techcariernet.compose.tasarimcalismasi.ui.theme.YaziRenk1

@Composable
fun Chip(icerik:String){
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            containerColor = AnaRenk,
            contentColor = YaziRenk1
        )
    ) {
        Text(text = icerik)
    }
}