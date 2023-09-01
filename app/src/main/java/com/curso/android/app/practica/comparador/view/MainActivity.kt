package com.curso.android.app.practica.comparador.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.curso.android.app.practica.comparador.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.comparador.observe(this){
            binding.resultado.text = it.resultado
        }

        binding.compare.setOnClickListener{
            mainViewModel.comparateTexts(binding.text1.text.toString(), binding.text2.text.toString())
        }
    }
}