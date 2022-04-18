package com.example.newsfeed

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContentActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)
        val tvTitle_cl = findViewById<TextView>(R.id.tvTitle_cl)
        val tvContent_cl = findViewById<TextView>(R.id.tvContent_cl)
        val im_cl = findViewById<ImageView>(R.id.im_cl)
        tvTitle_cl.text = intent.getStringExtra("title")
        tvContent_cl.text = intent.getStringExtra("content")
        im_cl.setImageResource(intent.getIntExtra("image",R.drawable.ponchic))
    }

}