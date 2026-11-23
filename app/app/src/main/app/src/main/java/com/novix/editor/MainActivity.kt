package com.novix.editor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Black = Color(0xFF090909)
private val Gold = Color(0xFFD4AF37)
private val White = Color.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NovixHome()
        }
    }
}

@Composable
fun NovixHome() {
    var selectedTab by remember { mutableStateOf("Home") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Black
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Spacer(modifier = Modifier.height(25.dp))

            Text(
                text = "NOVIX",
                color = Gold,
                fontSize = 36.sp,
                fontWeight = FontWeight.Black
            )

            Text(
                text = "PRO VIDEO EDITOR",
                color = White,
                fontSize = 12.sp,
                letterSpacing = 3.sp
            )

            Spacer(modifier = Modifier.height(35.dp))

            Text(
                text = "Welcome to NOVIX",
                color = White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Create something amazing",
                color = Gold,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = { selectedTab = "New Project" },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Gold
                ),
                shape = RoundedCornerShape(15.dp)
            ) {
                Text(
                    text = "＋  New Project",
                    color = Black,
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(25.dp))

            Text(
                text = "Your Projects",
                color = White,
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(15.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(
                        Color(0xFF1B1B1B),
                        RoundedCornerShape(15.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "No projects yet\nStart your first video!",
                    color = Gold,
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "Home       Projects       Settings",
                color = Gold,
                fontSize = 15.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}
