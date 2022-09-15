package com.example.onlinefooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class loginpage : AppCompatActivity() {

    lateinit var mobileNumber: EditText
    lateinit var password : EditText
    lateinit var loginButton: Button
    lateinit var forgot : TextView
    lateinit var donthaveaccount : TextView
    val mobile = "8923142172"
    val pwrd = "harshit"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        mobileNumber = findViewById(R.id.mobileNumber)
        password = findViewById(R.id.password)
        loginButton = findViewById(R.id.button)
        forgot = findViewById(R.id.forgotpage)
        donthaveaccount = findViewById(R.id.donthaveaccount)


        loginButton.setOnClickListener{
            val mobileNumber = mobileNumber.text.toString()
            val password = password.text.toString()
            if ((mobileNumber==mobile) &&(password==pwrd)){
                Toast.makeText(this, "username and password are correct", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "username and password are incorrect", Toast.LENGTH_SHORT).show()
            }
        }
          forgot.setOnClickListener {
              val intent = Intent(this@loginpage,forgotscreen::class.java)
              startActivity(intent)
          }

        donthaveaccount.setOnClickListener {
            val intent = Intent (this@loginpage,register::class.java)
            startActivity(intent)
        }





    }
}