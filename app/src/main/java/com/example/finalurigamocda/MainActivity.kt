package com.example.finalurigamocda


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generator = findViewById<Button>(R.id.GeneratorButton)
        val result = findViewById<TextView>(R.id.ResultTextView)
        val seekBar = findViewById<SeekBar>(R.id.SeekBar)

        generator.setOnClickListener {
            val rand = Random().nextInt(seekBar.progress)
            result.text=rand.toString()
        }

    }
}