package com.example.promcommittee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var edtLoginEmail:EditText
    private lateinit var edtLoginPassword:EditText
    private lateinit var txtForgotPassword:TextView
    private lateinit var txtSignUp:TextView
    private lateinit var btnSignIn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtLoginEmail=findViewById(R.id.edtLoginEmail)
        edtLoginPassword=findViewById(R.id.edtLoginPassword)
        txtForgotPassword=findViewById(R.id.txtForgotPassword)
        txtSignUp=findViewById(R.id.txtSignUp)
        btnSignIn=findViewById(R.id.btnSignIn)
        txtForgotPassword.setOnClickListener { //Goes to ForgotPassword screen
            var intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }

        btnSignIn.setOnClickListener { //TODO: Create the main screen
            var intent = Intent(this, MyPromPage::class.java)
            startActivity(intent)
        }

        txtSignUp.setOnClickListener { //Goes to Register screen
            var intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

    }

}