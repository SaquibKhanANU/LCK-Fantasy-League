package com.example.lckfantasyapp.ui.components

import ImageComponent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import com.example.lckfantasyapp.data.PlayerCard

val fantasyPlayersList = listOf(
    PlayerCard(
        playerName = "Zeus",
        playerRole = "TOP",
        playerImage = "https://am-a.akamaihd.net/image?resize=750:&f=http%3A%2F%2Fstatic.lolesports.com%2Fplayers%2F1708514718374_T1_Faker_F.png",
        teamLogo = "https://am-a.akamaihd.net/image?resize=1000:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1704375161752_T1_esports.png"
    ),
    PlayerCard(
        playerName = "Oner",
        playerRole = "JNG",
        playerImage = "https://am-a.akamaihd.net/image?resize=750:&f=http%3A%2F%2Fstatic.lolesports.com%2Fplayers%2F1708514718374_T1_Faker_F.png",
        teamLogo = "https://am-a.akamaihd.net/image?resize=1000:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1704375161752_T1_esports.png"
    ),
    PlayerCard(
        playerName = "Faker",
        playerRole = "MID",
        playerImage = "https://am-a.akamaihd.net/image?resize=750:&f=http%3A%2F%2Fstatic.lolesports.com%2Fplayers%2F1708514718374_T1_Faker_F.png",
        teamLogo = "https://am-a.akamaihd.net/image?resize=1000:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1704375161752_T1_esports.png"
    ),
    PlayerCard(
        playerName = "Gumayusi",
        playerRole = "BOT",
        playerImage = "https://am-a.akamaihd.net/image?resize=750:&f=http%3A%2F%2Fstatic.lolesports.com%2Fplayers%2F1708514718374_T1_Faker_F.png",
        teamLogo = "https://am-a.akamaihd.net/image?resize=1000:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1704375161752_T1_esports.png"
    ),
    PlayerCard(
        playerName = "Keria",
        playerRole = "SUP",
        playerImage = "https://am-a.akamaihd.net/image?resize=750:&f=http%3A%2F%2Fstatic.lolesports.com%2Fplayers%2F1708514718374_T1_Faker_F.png",
        teamLogo = "https://am-a.akamaihd.net/image?resize=1000:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1704375161752_T1_esports.png"
    ),
)

@Preview(showBackground = true)
@Composable
fun FantasyTeamSection() {
    LazyRow (
        modifier = Modifier.padding(vertical = 6.dp)
            .background(MaterialTheme.colorScheme.background)
    ) {
        items(fantasyPlayersList) {
                item -> FantasyPlayerCard(playerCard = item)
        }
    }
}

@Composable
fun FantasyPlayerCard(playerCard: PlayerCard) {
    Box(
        modifier = Modifier
            .padding(horizontal = 5.dp).width(150.dp)
            .height(140.dp).border(1.dp, Color.Black)
    ) {
        val imageLoader = ImageLoader.Builder(LocalContext.current)
            .build()
        ImageComponent(
            imageUrl = playerCard.teamLogo,
            imageLoader = imageLoader,
            contentDescription = "PNG for testing",
            modifier = Modifier.fillMaxSize()
        )
        Column (modifier = Modifier
            .clickable {}) {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = 1.dp, horizontal = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = playerCard.playerRole,
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = playerCard.playerName,
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            val imageLoader = ImageLoader.Builder(LocalContext.current)
                .build()
            ImageComponent(
                imageUrl = playerCard.playerImage,
                imageLoader = imageLoader,
                contentDescription = "PNG for testing",
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}