package com.example.promcommittee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class ForgotPassword : AppCompatActivity() {
    private lateinit var txtBackToLogin:LinearLayout
    private lateinit var edtResetPassword:EditText
    private lateinit var btnResetPassword: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        txtBackToLogin=findViewById(R.id.txtBackToLogin)
        edtResetPassword=findViewById(R.id.edtResetPassword)
        btnResetPassword=findViewById(R.id.btnResetPassword)

        txtBackToLogin.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}