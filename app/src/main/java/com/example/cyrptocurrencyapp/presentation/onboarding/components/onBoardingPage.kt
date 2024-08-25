package com.example.cyrptocurrencyapp.presentation.onboarding.components

import android.content.res.Configuration
import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cyrptocurrencyapp.R
import com.example.cyrptocurrencyapp.presentation.Dimens.MediumPadding2
import com.example.cyrptocurrencyapp.presentation.onboarding.Page
import com.example.cyrptocurrencyapp.ui.theme.CyrptoCurrencyAppTheme

@Composable
fun onBoardingPage(
    modifier: Modifier=Modifier,
    page: Page
){
    Column(modifier=Modifier) {
        Image(
             painter = painterResource(id = page.image),
            contentDescription =null,

            modifier = modifier
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
            )
        Text(
            text = page.title,
            modifier.padding(horizontal = MediumPadding2).padding(top = 10.dp),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )
        Text(text = page.description,
            modifier=modifier.padding(horizontal = MediumPadding2).padding(top = 5.dp),
            style = MaterialTheme.typography.bodyMedium,
            color= colorResource(id = R.color.text_medium)
        )

    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun onBoardingPagePreview(){
    CyrptoCurrencyAppTheme {
        onBoardingPage(page =Page(title = "alihan", description = "bbbbbb", image = R.drawable.bitcoin) )
    }
}