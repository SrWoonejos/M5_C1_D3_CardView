package com.desafiolatam.desafio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.desafiolatam.desafio3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}