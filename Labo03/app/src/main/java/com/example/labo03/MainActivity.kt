package com.example.labo03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_five_coin = findViewById(R.id.imageView) as ImageView
        val btn_ten_coin = findViewById(R.id.imageView2) as ImageView
        val btn_quater_coin = findViewById(R.id.imageView3) as ImageView
        val btn_dollar_coin = findViewById(R.id.imageView4) as ImageView
        val txt_result =findViewById(R.id.textView) as TextView

        btn_five_coin.setOnClickListener{
            var result: Double = 0.0
            result += 0.05

            txt_result.text = result.toString()
        }

        btn_ten_coin.setOnClickListener{
            var result: Double = 0.0
            result += 0.10

            txt_result.text = result.toString()
        }

        btn_quater_coin.setOnClickListener{
            var result: Double = 0.0
            result += 0.25

            txt_result.text = result.toString()
        }

        btn_dollar_coin.setOnClickListener{
            var result: Double = 0.0
            result += 1

            txt_result.text = result.toString()

        }
    }
}