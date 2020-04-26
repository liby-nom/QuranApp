package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager

class QuranActivity : AppCompatActivity() {
     internal lateinit var viewPager: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quran)

        viewPager = findViewById<View>(R.id.viewpager) as ViewPager
        val adapter = ViewPageAdapter(this)
        viewPager.adapter = adapter


    }
}
