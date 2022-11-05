package com.example.animations_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import com.example.animations_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fade.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            binding.text.startAnimation(animation)
            Handler().postDelayed({
                binding.text.visibility = View.INVISIBLE
            }, 1000)
        }

        binding.slideDown.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            binding.text.startAnimation(animation)
        }
        binding.slideUp.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            binding.text.startAnimation(animation)
        }
        binding.zoom.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            binding.text.startAnimation(animation)
        }
    }
}