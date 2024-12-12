package com.example.task2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.task2.ui.theme.Task2Theme

class Calculator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_layout)
        /*enableEdgeToEdge()
        setContent {
            Task2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }*/
        val Result = findViewById<TextView>(R.id.TextResult)
        var ResultNum: Int? = null
        val Num1Block = findViewById<EditText>(R.id.Num1)
        val Num2Block = findViewById<EditText>(R.id.Num2)
        val buttonPlus = findViewById<Button>(R.id.buttonPlus)

        buttonPlus.setOnClickListener {
            try {
                val Num1Value = Num1Block.text.toString().toInt()
                val Num2Value = Num2Block.text.toString().toInt()
                ResultNum = Num1Value + Num2Value
                Result.text = ResultNum.toString()
            } catch (e: NumberFormatException) {
                // Handle the case where the input is not a valid integer
                Result.text = "Invalid input"
            }
        }

}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Task2Theme {
        Greeting("Android")
    }
}*/
}