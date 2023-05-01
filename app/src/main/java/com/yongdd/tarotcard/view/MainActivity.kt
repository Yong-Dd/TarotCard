package com.yongdd.tarotcard.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.yongdd.tarotcard.databinding.ActivityMainBinding
import com.yongdd.tarotcard.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    private lateinit var vm : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViewModel()
    }

    private fun setViewModel() {
        vm = ViewModelProvider(this)[MainViewModel::class.java]
        binding.vm = vm
        binding.lifecycleOwner = this
    }
}