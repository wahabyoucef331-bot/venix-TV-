
package com.venix.tv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
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
        "⚽ القنوات الرياضية",
        "📰 الأخبار",
        "🎬 الأفلام",
        "🌍 الوثائقيات",
        "🧸 قنوات الأطفال"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF090909))
            .padding(20.dp)
    ) {
        Text(
            "VÉNIX TV",
            color = Color(0xFFE50914),
            fontSize = 34.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            "عالم المشاهدة بين يديك",
            color = Color.LightGray,
            fontSize = 16.sp
        )

        Spacer(Modifier.height(28.dp))

        Text(
            "اكتشف عالم القنوات",
            color = Color.White,
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(18.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            items(categories) { category ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF202020)
                    )
                ) {
                    Text(
                        category,
                        color = Color.White,
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(22.dp)
                    )
                }
            }
        }
    }
}
