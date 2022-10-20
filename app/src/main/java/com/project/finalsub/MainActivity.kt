package com.project.finalsub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.finalsub.ui.theme.FinalsubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinalsubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    firstrow(name ="CSVTU NOTES" )
                }
            }
        }
    }
}
@Composable
fun firstrow(name: String){
    Column(modifier = Modifier.fillMaxSize(),


        horizontalAlignment = Alignment.CenterHorizontally) {

        Greeting(name = " CSVTU NOTES")
        SimpleImage()
        SimpleButton("civil")
        SimpleButton("computer science")
        SimpleButton("eletrical")
        SimpleButton("mechincal")
        SimpleButton("ET&T")
    }

}
@Composable
fun Greeting(name: String) {
    Text(text = "$name!",fontSize = 30.sp, color = Color.Blue, fontWeight = FontWeight.Bold)
}
@Composable
fun SimpleButton(branch:String) {
    Button(
        onClick = {
            //your onclick code
        },
        border = BorderStroke(1.dp, Color.Red),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)
    ) {
        Text(text = branch, color = Color.DarkGray)
    }
}
@Composable
fun SimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.csvtu),
        contentDescription = "Andy Rubin",
        modifier = Modifier.fillMaxWidth()
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FinalsubTheme {

    }
}