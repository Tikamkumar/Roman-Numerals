package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tikamkumar.romannumbers.databinding.ActivityEightHundredBinding

class EightHundred : AppCompatActivity() {

    private lateinit var binding: ActivityEightHundredBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEightHundredBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Animation All Buttons when Click Range 701 to 800 Button of MainActivity
        animation(binding.seventyOne)
        animation(binding.seventyTwo)
        animation(binding.seventyThree)
        animation(binding.seventyFour)
        animation(binding.seventyFive)
        animation(binding.seventySix)
        animation(binding.seventySeven)
        animation(binding.seventyEight)
        animation(binding.seventyNine)
        animation(binding.eighty)

// Go to BlackBoard Activity And With Take Upper Title , Math Numbers and Roman Numbers
// According to Click Button
        binding.seventyOne.setOnClickListener {
            shrink(binding.seventyOne)
            sendData(
                getString(R.string.seventyonetitle),
                getString(R.string.SeventyOne),
                getString(R.string.seventyone)
            )
        }

        binding.seventyTwo.setOnClickListener {
            shrink(binding.seventyTwo)
            sendData(
                getString(R.string.seventytwotitle),
                getString(R.string.SeventyTwo),
                getString(R.string.seventytwo)
            )
        }

        binding.seventyThree.setOnClickListener {
            shrink(binding.seventyThree)
            sendData(
                getString(R.string.seventythreetitle),
                getString(R.string.SeventyThree),
                getString(R.string.seventythree)
            )
        }

        binding.seventyFour.setOnClickListener {
            shrink(binding.seventyFour)
            sendData(
                getString(R.string.seventyfourtitle),
                getString(R.string.SeventyFour),
                getString(R.string.seventyfour)
            )
        }

        binding.seventyFive.setOnClickListener {
            shrink(binding.seventyFive)
            sendData(
                getString(R.string.seventyfivetitle),
                getString(R.string.SeventyFive),
                getString(R.string.seventyfive)
            )
        }

        binding.seventySix.setOnClickListener {
            shrink(binding.seventySix)
            sendData(
                getString(R.string.seventysixtitle),
                getString(R.string.SeventySix),
                getString(R.string.seventysix)
            )
        }

        binding.seventySeven.setOnClickListener {
            shrink(binding.seventySeven)
            sendData(
                getString(R.string.seventyseventitle),
                getString(R.string.SeventySeven),
                getString(R.string.seventyseven)
            )
        }

        binding.seventyEight.setOnClickListener {
            shrink(binding.seventyEight)
            sendData(
                getString(R.string.seventyeighttitle),
                getString(R.string.SeventyEight),
                getString(R.string.seventyeight)
            )
        }

        binding.seventyNine.setOnClickListener {
            shrink(binding.seventyNine)
            sendData(
                getString(R.string.seventyninetitle),
                getString(R.string.SeventyNine),
                getString(R.string.seventynin)
            )
        }

        binding.eighty.setOnClickListener {
            shrink(binding.eighty)
            sendData(
                getString(R.string.eightytitle),
                getString(R.string.Eighty),
                getString(R.string.eighty)
            )
        }

        binding.back.setOnClickListener {
            finish()
        }
    }

    private fun sendData(title: String, mathNum: String, romanNum: String) {
        val intent = Intent(this@EightHundred, Blackboard::class.java)
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