package com.desafiolatam.desafio3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.desafiolatam.desafio3.databinding.ActivityMainBinding

class MainActivity : ChileanAnimalsActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardView1.setOnClickListener(this)
        binding.cardView2.setOnClickListener(this)
        binding.cardView3.setOnClickListener(this)

        // Puedes ocupar este ejemplo para navegar entre activities
       binding.cardView1.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        binding.cardView2.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
        binding.cardView3.setOnClickListener {
            startActivity(Intent(this, FourthActivity::class.java))
        }
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.cardView1 -> {
                startActivity(Intent(this, SecondActivity::class.java))
            }
            R.id.cardView2 -> {
                startActivity(Intent(this, ThirdActivity::class.java))
            }
            R.id.cardView3 -> {
                startActivity(Intent(this, FourthActivity::class.java))
            }
        }
    }
}