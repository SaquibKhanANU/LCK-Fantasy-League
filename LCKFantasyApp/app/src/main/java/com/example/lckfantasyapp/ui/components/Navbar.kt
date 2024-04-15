package com.example.lckfantasyapp.ui.components

import ImageComponent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ImageLoader

const val IMAGE_PNG_URL = "https://am-a.akamaihd.net/image?resize=120:&f=http%3A%2F%2Fstatic.lolesports.com%2Fleagues%2Flck-color-on-white.png"

@Preview
@Composable
fun Navbar() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colorScheme.inverseOnSurface)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp)
        ) {
            IconButton(onClick = { /* Handle menu button click */ }) {
                Icon(Icons.Default.Home, contentDescription = "Menu",  modifier = Modifier.size(32.dp))
            }
            Spacer(modifier = Modifier.weight(1f))
            val imageLoader = ImageLoader.Builder(LocalContext.current)
                .build()
            ImageComponent(
                imageUrl = IMAGE_PNG_URL,
                imageLoader = imageLoader,
                contentDescription = "PNG for testing",
                modifier = Modifier.size(60.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { /* Handle settings button click */ }) {
                Icon(Icons.Default.AccountCircle, contentDescription = "Settings",
                    modifier = Modifier.size(32.dp))
            }
        }
    }
}


