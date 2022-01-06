package com.example.finalurigamocda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

lateinit var username : EditText
lateinit var password : EditText
lateinit var login : Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.usernameET)
        password = findViewById(R.id.passwordET)
        login = findViewById(R.id.loginBtn)

        login.setOnClickListener {
            if (username.getText().toString().equals("hello") && password.getText().toString().equals("world")){
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)

            }else{
                Toast.makeText(this, "Username or Password is Incorrect", Toast.LENGTH_LONG).show()

            }
        }
    }
}