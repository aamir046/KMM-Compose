package org.kmmcompose.demo.project

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.kmmcompose.demo.project.presentation.homebookslist.HomeBooksListScreen

@Preview
@Composable
fun PreviewHomeCharactersScreen(){
    HomeBooksListScreen(modifier = Modifier)
}