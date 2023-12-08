package com.lilopuji.lintasgenerasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisalisasi komponen, membuat instansi baru
        var ed_tanggal_lahir = findViewById<EditText>(R.id.ed_tanggal_lahir)
        var btn_submit = findViewById<Button>(R.id.btn_submit)
        var tv_hasil = findViewById<TextView>(R.id.tv_hasil)

        btn_submit.setOnClickListener(){
            val input = ed_tanggal_lahir.text.toString()
            val hasil = when(input.toInt()){
                in 1924..1943 -> "Baby boomers"
                in 1965..1980 -> "X"
                in 1981..1995 -> "Millenial"
                in 1996..2010 -> "Z"
                else -> "Hilang"
            }
            tv_hasil.text = "Kamu Masuk ke Generasi $hasil"
        }
    }
}