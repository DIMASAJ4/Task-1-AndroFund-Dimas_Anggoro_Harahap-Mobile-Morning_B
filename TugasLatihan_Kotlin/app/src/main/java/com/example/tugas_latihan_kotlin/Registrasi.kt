package com.example.tugas_latihan_kotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Registrasi : AppCompatActivity(), View.OnClickListener {

//    private lateinit var etUsername:EditText
//    private lateinit var etPassword:EditText
//    private lateinit var etKonfirmasiPassword:EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

//        etUsername = findViewById(R.id.Uname)
//        etPassword = findViewById(R.id.Pw)
//        etKonfirmasiPassword = findViewById(R.id.KonfirmasiPw)

        val btnRegist: Button = findViewById(R.id.registrasiBtn)
        btnRegist.setOnClickListener(this)

    }

    override fun onClick(p: View) {
        when(p.id){
            R.id.registrasiBtn -> {
//                val bundle = Bundle()
//                bundle.putString("username",etUsername.text.toString())
//                bundle.putString("password", etPassword.text.toString())

                val start = Intent(this@Registrasi, Login::class.java)
//                intent.putExtras(bundle)
                startActivity(start)
            }
        }
    }
}