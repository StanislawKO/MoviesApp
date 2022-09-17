package com.codexample.moviesapp.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.codexample.moviesapp.MainViewModel

@Composable
fun DetailsScreen(navController: NavHostController, viewModel: MainViewModel, itemId: String) {
    Text(text = "Details screen item id: ${itemId}")
}