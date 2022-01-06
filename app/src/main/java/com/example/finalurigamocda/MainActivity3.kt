package com.example.finalurigamocda


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val generator = findViewById<Button>(R.id.GeneratorButton)
        val result = findViewById<TextView>(R.id.ResultTextView)
        val seekBar = findViewById<SeekBar>(R.id.SeekBar)
        val back = findViewById<Button>(R.id.backBtn)

        generator.setOnClickListener {
            val rand = Random().nextInt(seekBar.progress)
            result.text=rand.toString()
        }
        back.setOnClickListener {
            val intent3 = Intent(this,MainActivity::class.java)
            finish()
            startActivity(intent3)
        }
    }
}



