package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var recorder: AudioRecord? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recorder = AudioRecord()

        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            Log.e("Button", "Clicked")
        }
    }
}