package com.example.lckfantasyapp

import PlayerListSection
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lckfantasyapp.ui.components.ChooseSeasonSection
import com.example.lckfantasyapp.ui.components.FantasyTeamSection
import com.example.lckfantasyapp.ui.components.Navbar
import com.example.lckfantasyapp.ui.components.TeamDescriptionSection
import com.example.lckfantasyapp.ui.theme.LCKFantasyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LCKFantasyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FantasyTeamScreen()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun FantasyTeamScreen() {
    Scaffold (
        bottomBar = {
            Navbar()
        }
    ) {
        paddingValues ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            ChooseSeasonSection()
            TeamDescriptionSection()
            FantasyTeamSection()
            PlayerListSection()
        }
    }
}