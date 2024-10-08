package com.example.cyrptocurrencyapp.presentation.onboarding.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.cyrptocurrencyapp.R

@Composable
fun NewButton(
    text:String,
    onClick:()->Unit
){
    Button(
        modifier = Modifier.padding(start = 10.dp), onClick=onClick, colors = ButtonDefaults.buttonColors(
        contentColor = Color.White,
        containerColor = MaterialTheme.colorScheme.primary),
        shape = RoundedCornerShape(size = 6.dp)
    ){
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.SemiBold)
        )
    }

}

@Composable
fun NewTextButton(
    text:String,
    onClick: () -> Unit
){
    TextButton(onClick = onClick) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.SemiBold),
            color = colorResource(id = R.color.text_medium)
        )

    }

}


