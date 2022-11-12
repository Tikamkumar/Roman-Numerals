package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tikamkumar.romannumbers.databinding.ActivityNineHundredBinding

class NineHundred : AppCompatActivity() {

    private lateinit var binding: ActivityNineHundredBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNineHundredBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Animation All Buttons when Click Range 801 to 900 Button of MainActivity
        animation(binding.eightyOne)
        animation(binding.eightyTwo)
        animation(binding.eightyThree)
        animation(binding.eightyFour)
        animation(binding.eightyFive)
        animation(binding.eightySix)
        animation(binding.eightySeven)
        animation(binding.eightyEight)
        animation(binding.eightyNine)
        animation(binding.ninety)

// Go to BlackBoard Activity And With Take Upper Title , Math Numbers and Roman Numbers
// According to Click Button
        binding.eightyOne.setOnClickListener {
            shrink(binding.eightyOne)
            sendData(
                getString(R.string.eightyonetitle),
                getString(R.string.EightyOne),
                getString(R.string.eightyone)
            )
        }

        binding.eightyTwo.setOnClickListener {
            shrink(binding.eightyTwo)
            sendData(
                getString(R.string.eightytwotitle),
                getString(R.string.EightyTwo),
                getString(R.string.eightytwo)
            )
        }

        binding.eightyThree.setOnClickListener {
            shrink(binding.eightyThree)
            sendData(
                getString(R.string.eightythreetitle),
                getString(R.string.EightyThree),
                getString(R.string.eightythree)
            )
        }

        binding.eightyFour.setOnClickListener {
            shrink(binding.eightyFour)
            sendData(
                getString(R.string.eightyfourtitle),
                getString(R.string.EightyFour),
                getString(R.string.eightyfour)
            )
        }

        binding.eightyFive.setOnClickListener {
            shrink(binding.eightyFive)
            sendData(
                getString(R.string.eightyfivetitle),
                getString(R.string.EightyFive),
                getString(R.string.eightyfive)
            )
        }

        binding.eightySix.setOnClickListener {
            shrink(binding.eightySix)
            sendData(
                getString(R.string.eightysixtitle),
                getString(R.string.EightySix),
                getString(R.string.eightysix)
            )
        }

        binding.eightySeven.setOnClickListener {
            shrink(binding.eightySeven)
            sendData(
                getString(R.string.eightyseventitle),
                getString(R.string.EightySeven),
                getString(R.string.eightyseven)
            )
        }

        binding.eightyEight.setOnClickListener {
            shrink(binding.eightyEight)
            sendData(
                getString(R.string.eightyeighttitle),
                getString(R.string.EightyEight),
                getString(R.string.eightyeight)
            )
        }

        binding.eightyNine.setOnClickListener {
            shrink(binding.eightyNine)
            sendData(
                getString(R.string.eightyninetitle),
                getString(R.string.EightyNine),
                getString(R.string.eightynin)
            )
        }

        binding.ninety.setOnClickListener {
            shrink(binding.ninety)
            sendData(
                getString(R.string.nintytitle),
                getString(R.string.Ninty),
                getString(R.string.ninty)
            )
        }


        binding.back.setOnClickListener {
            finish()
        }
    }

    private fun sendData(title: String, mathNum: String, romanNum: String) {
        val intent = Intent(this@NineHundred, Blackboard::class.java)
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