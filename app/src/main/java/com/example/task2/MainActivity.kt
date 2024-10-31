package com.example.task2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//получение TextView по ID
        val mNameEditText = findViewById<EditText>(R.id.tVName)
// получение EditText по ID
        val mHelloTextView = findViewById<TextView>(R.id.tVName)
        val button = findViewById<Button>(R.id.btnHello)
        button.setOnClickListener {
            if (mNameEditText.length() == 0) { //проверка, что имя введено
                mHelloTextView.setText("Здравствуй, NoName!"); } else {
                mHelloTextView.setText("Привет, " + mNameEditText.text);
            }
        }
    }
}
