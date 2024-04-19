package com.example.lckfantasyapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lckfantasyapp.data.NavbarItem

val items = listOf(
    NavbarItem (
        icon = Icons.Default.Home,
        link = ""
    ),
    NavbarItem (
        icon = Icons.Default.Home,
        link = ""
    ),

)
@Preview
@Composable
fun bottomNavbar() {
    NavigationBar (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.inverseOnSurface)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        ) {
            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(Icons.Default.Home, contentDescription = "Menu",  modifier = Modifier.size(32.dp))
                },
            )
            val groupsImageVector = rememberGroups()
            Spacer(modifier = Modifier.weight(1f))
            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Image(painter = rememberVectorPainter(image = groupsImageVector), contentDescription = null)
                },
            )
            Spacer(modifier = Modifier.weight(1f))
            val listImageVector = rememberFormatListNumbered()
            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Image(painter = rememberVectorPainter(image = listImageVector), contentDescription = null)
                },
            )
            Spacer(modifier = Modifier.weight(1f))
            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(Icons.Default.AccountCircle, contentDescription = "Menu",  modifier = Modifier.size(32.dp))
                },
            )
        }
    }
}


