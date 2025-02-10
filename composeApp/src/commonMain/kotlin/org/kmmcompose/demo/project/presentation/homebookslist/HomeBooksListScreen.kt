package org.kmmcompose.demo.project.presentation.homebookslist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeBooksListScreen(
    modifier: Modifier=Modifier,
){
    Scaffold(
        modifier = modifier.fillMaxSize()
    ) {paddingValues ->
        Box(
            modifier = modifier
                .padding(paddingValues)
                .background(Color.Black)
                .fillMaxSize()
        ){
            Card(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .fillMaxWidth()
                    .height(100.dp),
                elevation = CardDefaults.elevatedCardElevation(defaultElevation = 5.dp)
            ){
                Row(modifier=modifier.fillMaxSize()) {
                    Text(text = "Book Name",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}


