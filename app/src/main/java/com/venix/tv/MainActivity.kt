
package com.venix.tv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VenixHome()
        }
    }
}

@Composable
fun VenixHome() {
    val categories = listOf(
        "القنوات الرياضية",
        "الأخبار",
        "الأفلام",
        "الوثائقيات",
        "قنوات الأطفال"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF101010))
            .padding(20.dp)
    ) {
        Text(
            text = "VÉNIX TV",
            color = Color(0xFFE50914),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "عالم المشاهدة بين يديك",
            color = Color.White,
            fontSize = 17.sp,
            modifier = Modifier.padding(top = 8.dp, bottom = 24.dp)
        )

        Text(
            text = "اكتشف القنوات",
            color = Color.White,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(15.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(categories) { category ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF252525)
                    )
                ) {
                    Text(
                        text = category,
                        color = Color.White,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(20.dp)
                    )
                }
            }
        }
    }
}
