package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.toDrawable
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quran.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quran.setOnClickListener {
            val intent = Intent(this, QuranActivity::class.java)
            startActivity(intent)
        }


    }
}
