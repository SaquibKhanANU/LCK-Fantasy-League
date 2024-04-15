
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lckfantasyapp.data.PlayerListCard

val playerListCards  = listOf (
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
    PlayerListCard(
        playerName = "Faker"
    ),
)

@Preview
@Composable
fun PlayerListSection() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
    )
    {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = "Left Arrow",
                tint = Color.Black,
                modifier = Modifier.size(32.dp) // Adjust the size as needed
            )
            Text(
                text = "TOP",
                fontSize = 22.sp,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Right Arrow",
                tint = Color.Black,
                modifier = Modifier.size(32.dp) // Adjust the size as needed
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn (

        ) {
            items(playerListCards) {
                    playerListItem -> PlayerListCard(playerListCard = playerListItem)
            }
        }
    }
}

@Composable
fun PlayerListCard(playerListCard: PlayerListCard) {
    OutlinedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 2.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                // Display player name
                Text(
                    text = playerListCard.playerName,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start
                )
            }
        }
    }
}