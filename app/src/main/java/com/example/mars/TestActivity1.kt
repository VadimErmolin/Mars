package com.example.mars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mars.databinding.ActivityTest1Binding

class TestActivity1 : AppCompatActivity() {
    lateinit var binding : ActivityTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra("key")
        binding.textView.text = message

        binding.button.setOnClickListener {
            finish()
        }
    }


}