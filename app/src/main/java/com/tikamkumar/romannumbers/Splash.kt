package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.tikamkumar.romannumbers.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

// Go to SplashActivity to MainActivity
        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this@Splash, MainActivity::class.java))
            finish()
        }, 1000)

// To Take Animation in flowers Guldasta
        animation(
            binding.guldasta,
            400
        )

// To Take Animation in Launcher Icon for 900 time duration
        animation(
            binding.image,
            900
        )


// To Take Animation in Made By Image for 900 time duration
        animation(
            binding.company,
            900
        )
    }

    private fun animation(view: ImageView, Duration: Long) {
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
