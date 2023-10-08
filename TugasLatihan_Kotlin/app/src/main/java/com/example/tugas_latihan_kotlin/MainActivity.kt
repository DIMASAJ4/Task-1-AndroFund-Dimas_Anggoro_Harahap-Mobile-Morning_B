package com.example.tugas_latihan_kotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val implicitBtn: Button = findViewById(R.id.btnImplicit)
        implicitBtn.setOnClickListener(this)

        val btnFragment: Button = findViewById(R.id.btn_fragment)
        btnFragment.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnImplicit ->{
                val message = "Hallo, Ini Pesan Untuk mengetes Implicit"
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"
                startActivity(intent)
            }
            R.id.btn_fragment -> {
                val intent = Intent(this@MainActivity, adaActivity2::class.java)
                startActivity(intent)
            }
        }
    }
}