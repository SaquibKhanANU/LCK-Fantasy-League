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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lckfantasyapp.data.NavigationItem


@Preview
@Composable
fun BottomNavbar() {
    val navigationItems = listOf(
        NavigationItem(Icons.Default.Home, "Menu"),
        NavigationItem(rememberGroups(), "Groups"),
        NavigationItem(rememberFormatListNumbered(), "List"),
        NavigationItem(Icons.Default.AccountCircle, "Account")
    )

    NavigationBar (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.inverseOnSurface)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        ) {
            navigationItems.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 0, // You can change this as needed
                    onClick = { /*TODO*/ },
                    icon = {
                        if (item.icon is ImageVector) {
                            Image(
                                painter = rememberVectorPainter(image = item.icon),
                                contentDescription = item.descriptor
                            )
                        }
                        else {
                            Icon(
                                imageVector = item.icon as ImageVector,
                                contentDescription = item.descriptor,
                                modifier = Modifier.size(32.dp)
                            )
                        }
                    }
                )
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}


