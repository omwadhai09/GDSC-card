package com.example.nigga

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nigga.ui.theme.NiggaTheme
import com.example.nigga.ui.theme.purple1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NiggaTheme {
                MyScreen()
            }
        }
    }
}

@Composable
fun MyScreen(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(26.dp),
            backgroundColor = purple1,
            elevation = 10.dp,
            shape = RoundedCornerShape(30.dp)
        ){

            Column() {
                MyRow1()
                MyRow2()

            }

        }
    }
}
@Composable
fun MyRow1(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ){

        Text(
            text="Hii Nigga!",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.padding(12.dp))

        Image(painter = painterResource(id = R.drawable.gdsc_logo) ,
            contentDescription ="gdsc logo" )
    }

}
@Composable
fun MyRow2(){
    Row (
        verticalAlignment = Alignment.Bottom


    ){

        Image(painter = painterResource(id = R.drawable.android_logo) ,
            contentDescription ="android logo" )


        Text(
            text="Racist Card\n [MIT-ADT]",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)

        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NiggaTheme {
        MyScreen()
    }
}