package com.example.task2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
/*import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier*/

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
        val resultBlock = findViewById<TextView>(R.id.TextResult)
        var resultNum: Float?
        val num1Block = findViewById<EditText>(R.id.Num1)
        val num2Block = findViewById<EditText>(R.id.Num2)
        val buttonPlus = findViewById<Button>(R.id.buttonPlus)
        val buttonMinus = findViewById<Button>(R.id.buttonMinus)
        val buttonMulti = findViewById<Button>(R.id.buttonMulti)
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)
        buttonPlus.setOnClickListener {
            try {
                val num1Value = num1Block.text.toString().toFloat()
                val num2Value = num2Block.text.toString().toFloat()
                resultNum = num1Value + num2Value
                resultBlock.text = resultNum.toString()
            } catch (e: NumberFormatException) {
                // Handle the case where the input is not a valid integer
                resultBlock.text = getString(R.string.invalid_input)
            }
        }
        buttonMinus.setOnClickListener {
            try {
                val num1Value = num1Block.text.toString().toFloat()
                val num2Value = num2Block.text.toString().toFloat()
                resultNum = num1Value - num2Value
                resultBlock.text = resultNum.toString()
            } catch (e: NumberFormatException) {
                // Handle the case where the input is not a valid integer
                resultBlock.text = getString(R.string.invalid_input)
            }
        }
        buttonMulti.setOnClickListener {
            try {
                val num1Value = num1Block.text.toString().toFloat()
                val num2Value = num2Block.text.toString().toFloat()
                resultNum = num1Value * num2Value
                resultBlock.text = resultNum.toString()
            } catch (e: NumberFormatException) {
                // Handle the case where the input is not a valid integer
                resultBlock.text = getString(R.string.invalid_input)
            }
        }
        buttonDivide.setOnClickListener {
            try {
                val num1Value = num1Block.text.toString().toFloat()
                val num2Value = num2Block.text.toString().toFloat()
                resultNum = num1Value / num2Value
                resultBlock.text = resultNum.toString()
            } catch (e: NumberFormatException) {
                // Handle the case where the input is not a valid integer
                resultBlock.text = getString(R.string.invalid_input)
            }
        }

}
}