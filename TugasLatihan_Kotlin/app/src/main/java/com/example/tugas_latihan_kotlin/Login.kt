package com.example.tugas_latihan_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity(), View.OnClickListener {

//    private lateinit var etUsername: EditText
//    private lateinit var  etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        etUsername = findViewById(R.id.TextUname)
//        etPassword = findViewById(R.id.TextPW)

//        val bundle = intent.extras
//        if (bundle != null){
//            etUsername.setText(bundle.getString("username"))
//            etPassword.setText(bundle.getString("password"))
//        }

        val btnRegist: Button = findViewById(R.id.btn_login)
        btnRegist.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_login -> {
                val intent = Intent(this@Login, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}