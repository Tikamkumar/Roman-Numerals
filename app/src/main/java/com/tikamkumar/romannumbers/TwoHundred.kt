package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tikamkumar.romannumbers.databinding.ActivityTwoHundredBinding

class TwoHundred : AppCompatActivity() {

    private lateinit var binding: ActivityTwoHundredBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTwoHundredBinding.inflate(layoutInflater)
        setContentView(binding.root)

 // Animation All Buttons when Click Range 101 to 200 Button of MainActivity
        animation(binding.eleven)
        animation(binding.twelve)
        animation(binding.thirteen)
        animation(binding.fourteen)
        animation(binding.fifteen)
        animation(binding.sixteen)
        animation(binding.seventeen)
        animation(binding.eighteen)
        animation(binding.nineteen)
        animation(binding.twenty)

// Go to BlackBoard Activity And With Take Upper Title , Math Numbers and Roman Numbers
// According to Click Button
        binding.eleven.setOnClickListener {
            sendData(
                getString(R.string.eleventitle),
                getString(R.string.Eleven),
                getString(R.string.eleven)
            )
            shrink(binding.eleven)
        }

        binding.twelve.setOnClickListener {
            sendData(
                getString(R.string.twelvetitle),
                getString(R.string.Twelcve),
                getString(R.string.twelve)
            )
            shrink(binding.twelve)
        }

        binding.thirteen.setOnClickListener {
            sendData(
                getString(R.string.thirteentitle),
                getString(R.string.Thirteen),
                getString(R.string.thirteen)
            )
            shrink(binding.thirteen)
        }

        binding.fourteen.setOnClickListener {
            sendData(
                getString(R.string.fourteentitle),
                getString(R.string.Fourteen),
                getString(R.string.fourteen)
            )
            shrink(binding.fourteen)
        }

        binding.fifteen.setOnClickListener {
            sendData(
                getString(R.string.fifteentitle),
                getString(R.string.Fifteen),
                getString(R.string.fifteen)
            )
            shrink(binding.fifteen)
        }

        binding.sixteen.setOnClickListener {
            sendData(
                getString(R.string.sixteentitle),
                getString(R.string.Sixteen),
                getString(R.string.sixteen)
            )
            shrink(binding.sixteen)
        }

        binding.seventeen.setOnClickListener {
            sendData(
                getString(R.string.seventeentitle),
                getString(R.string.Seventeen),
                getString(R.string.seventeen)
            )
            shrink(binding.seventeen)
        }

        binding.eighteen.setOnClickListener {
            sendData(
                getString(R.string.eighteentitle),
                getString(R.string.Eighteen),
                getString(R.string.eighteen)
            )
            shrink(binding.eighteen)
        }

        binding.nineteen.setOnClickListener {
            sendData(
                getString(R.string.ninteentitle),
                getString(R.string.Ninteen),
                getString(R.string.ninteen)
            )
            shrink(binding.nineteen)
        }

        binding.twenty.setOnClickListener {
            sendData(
                getString(R.string.twentytitle),
                getString(R.string.Twenty),
                getString(R.string.twenty)
            )
            shrink(binding.twenty)
        }

        binding.back.setOnClickListener {
            finish()
            shrink(binding.back)
        }
    }

    private fun sendData(title: String, mathNum: String, romanNum: String) {
        val intent = Intent(this@TwoHundred, Blackboard::class.java)
        intent.putExtra("Title", title)
        intent.putExtra("mathNum", mathNum)
        intent.putExtra("Equal", getString(R.string.equal))
        intent.putExtra("romNum", romanNum)
        startActivity(intent)
    }

    private fun animation(view: View, Duration: Long = 600) {
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

    private fun shrink(view: View,Duration: Long = 100) {
        view.alpha = 0.9f
        view.scaleX = 0.9f
        view.scaleY = 0.9f
        view.animate().apply {
            duration = Duration
            alpha(1f)
            scaleX(1f)
            scaleY(1f)
        }
    }
}