package com.example.cyrptocurrencyapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.cyrptocurrencyapp.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image: Int
)
val pages= listOf(
    Page(
        title = "Real-Time Crypto Market Updates",
        description ="Stay updated with the latest prices and market trends of cryptocurrencies. Don’t miss out on valuable opportunities!",
        image = R.drawable.bitcoin)
    ,Page(
        title = "Save Your Favorite Cryptocurrencies",
        description ="Add your favorite cryptocurrencies to your favorites and access them easily. Keep track of the ones that matter most to you!",
        image = R.drawable.bitcoin)
    ,Page(
        title = "Build Your Personal Crypto Portfolio",
        description ="Create your own crypto portfolio and track your investments effortlessly. Make informed decisions with your personal insights.",
        image = R.drawable.bitcoin)
)

