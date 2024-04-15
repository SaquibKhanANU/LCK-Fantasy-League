package com.example.lckfantasyapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ChooseSeasonSection() {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp).height(35.dp),
        horizontalArrangement = Arrangement.Center
    )
    {
        ElevatedButton (
            onClick = { },
            contentPadding = PaddingValues(),
            modifier = Modifier
                .defaultMinSize(minWidth = 80.dp)
        )
        {
            Text("Summer")
        }
        Spacer(modifier = Modifier.width(30.dp))
        ElevatedButton (onClick = { },
            contentPadding = PaddingValues(),
            modifier = Modifier
                .defaultMinSize(minWidth = 80.dp))
        {
            Text("Spring")
        }
        Spacer(modifier = Modifier.width(30.dp))
        ElevatedButton (onClick = { },
            contentPadding = PaddingValues(),
            modifier = Modifier
                .defaultMinSize(minWidth = 80.dp))
        {
            Text("Ladder")
        }
    }
}
