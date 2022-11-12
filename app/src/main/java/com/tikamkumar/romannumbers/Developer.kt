package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import com.tikamkumar.romannumbers.databinding.ActivityDeveloperBinding

class Developer : AppCompatActivity() {

    private lateinit var binding : ActivityDeveloperBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDeveloperBinding.inflate(layoutInflater)
        setContentView(binding.root)

// When Click the back Button then go to MainActivity
        binding.back.setOnClickListener {
            val intent = Intent(this@Developer, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

// To Take Animation in Guldasta
        animation(binding.guldasta)

// To Take Animation in Developer's Signature
        animation(binding.signature)

// To Take Animation in   My Signature
        animation(binding.Signature, 2000)

        onBackPressedDispatcher.addCallback(this@Developer,object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                val intent = Intent(this@Developer, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        })

    }

    private fun animation(view: View, Duration: Long = 1000) {
        view.alpha = 0f
        view.scaleX = 0f
        view.scaleY = 0f
        view.animate().apply {
            duration = Duration
            alpha(1f)
            scaleX(1f)
            scaleY(1f)
        }
    }
}