package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.calculate_button)
        val editText = findViewById<EditText>(R.id.cost_of_service)

        // ボタンがクリックされた時の処理
        button.setOnClickListener {
            val enteredText = editText.text.toString()
            Toast.makeText(this, "「$enteredText」", Toast.LENGTH_SHORT).show()
            Log.v("テスト", "これはメッセージです「$enteredText」終わり")
            Log.d("テスト", "これはメッセージです「$enteredText」終わり")
            Log.i("テスト", "これはメッセージです「$enteredText」終わり")
            Log.w("テスト", "これはメッセージです「$enteredText」終わり")
            Log.e("テスト", "これはメッセージです「$enteredText」終わり")
            Log.d("MainActivity", "Button Clicked!")
        }
    }

    override fun onResume() {
        super.onResume()
    }
}