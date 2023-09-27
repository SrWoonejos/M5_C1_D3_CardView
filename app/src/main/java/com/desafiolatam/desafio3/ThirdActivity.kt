package com.desafiolatam.desafio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.desafiolatam.desafio3.databinding.ActivitySecondBinding
import com.desafiolatam.desafio3.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}