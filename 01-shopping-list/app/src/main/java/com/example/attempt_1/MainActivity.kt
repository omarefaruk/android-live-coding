package com.example.attempt_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.attempt_1.ui.theme.Attempt1Theme


/*
The task: a Shopping List app (Jetpack Compose)

Set a 30-minute timer and start from a new, empty Compose project.

Must have:

A text field and an Add button that adds an item to a list.
A LazyColumn that shows the items.
Tapping an item toggles it done or not done, shown with a strikethrough or a checkbox.
A delete button on each item.
State lives in a ViewModel, not in the composable.*/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Attempt1Theme {
                ShoppingListScreen()

                // A little but clueless why I cannot add a LazyColumn in ShoppingListScreen() itself,
                //lemme try looking in the docs, but I only have 5 mins left now


            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AttemptPreview() {
    Attempt1Theme {

    }
}