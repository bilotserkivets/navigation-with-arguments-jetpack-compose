package com.example.navigationwithargumentsjatpackcompouse

sealed class Screen(var route: String) {
    object HomeScreen : Screen(route = "home_screen")
    object DetailScreen : Screen(route = "detail_screen?name={name}&age={age}")
}
