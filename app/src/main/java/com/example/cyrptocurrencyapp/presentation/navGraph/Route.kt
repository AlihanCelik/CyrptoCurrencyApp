package com.example.cyrptocurrencyapp.presentation.navGraph

sealed class Route(
    val route: String
) {
    object onBoardingScreen:Route(route = "onBoardingScreen")
    object HomeScreen:Route("homeScreen")
    object SearchScreen:Route("searchScreen")
    object BookmarkScreen : Route("bookmarkScreen")
    object DetailScreen :Route("detailScreen")
    object AppStartNavigation : Route("appStartNavigation")
    object CryptoNavigation : Route("cryptoNavigation")
    object CryptoNavigatorScreen : Route("cryptoNavigatorScreen")
}