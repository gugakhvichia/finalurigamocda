package com.example.finalurigamocda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var randomiserbtn: Button
lateinit var logoutbtn : Button
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        randomiserbtn=findViewById(R.id.randomiserBtn)
        logoutbtn=findViewById(R.id.logoutBtn)

        randomiserbtn.setOnClickListener {
            val intent2 = Intent(this,MainActivity3::class.java)
            finish()
            startActivity(intent2)
        }
        logoutbtn.setOnClickListener {
            val intent4 = Intent(this,MainActivity::class.java)
            finish()
            startActivity(intent4)
        }
    }
}