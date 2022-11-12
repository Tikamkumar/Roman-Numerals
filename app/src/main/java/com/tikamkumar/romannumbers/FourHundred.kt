package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tikamkumar.romannumbers.databinding.ActivityFourHundredBinding

class FourHundred : AppCompatActivity() {

    private lateinit var binding: ActivityFourHundredBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFourHundredBinding.inflate(layoutInflater)
        setContentView(binding.root)

// Animation All Buttons when Click Range 301 to 400 Button of MainActivity
        animation(binding.thirtyOne)
        animation(binding.thirtyTwo)
        animation(binding.thirtyThree)
        animation(binding.thirtyFour)
        animation(binding.thirtyFive)
        animation(binding.thirtySix)
        animation(binding.thirtySeven)
        animation(binding.thirtyEight)
        animation(binding.thirtyNine)
        animation(binding.forty)


// Go to BlackBoard Activity And With Take Upper Title , Math Numbers and Roman Numbers
// According to Click Button
        binding.thirtyOne.setOnClickListener {
            shrink(binding.thirtyOne)
            sendData(
                getString(R.string.thirtyonetitle),
                getString(R.string.ThirtyOne),
                getString(R.string.thirtyone)
            )
        }

        binding.thirtyTwo.setOnClickListener {
            shrink(binding.thirtyTwo)
            sendData(
                getString(R.string.thirtytwotitle),
                getString(R.string.ThirtyTwo),
                getString(R.string.thirtytwo)
            )
        }

        binding.thirtyThree.setOnClickListener {
            shrink(binding.thirtyThree)
            sendData(
                getString(R.string.thirtythreetitle),
                getString(R.string.ThirtyThree),
                getString(R.string.thirtythree)
            )
        }

        binding.thirtyFour.setOnClickListener {
            shrink(binding.thirtyFour)
            sendData(
                getString(R.string.thirtyfourtitle),
                getString(R.string.ThirtyFour),
                getString(R.string.thirtyfour)
            )
        }

        binding.thirtyFive.setOnClickListener {
            shrink(binding.thirtyFive)
            sendData(
                getString(R.string.thirtyfivetitle),
                getString(R.string.ThirtyFive),
                getString(R.string.thirtyfive)
            )
        }

        binding.thirtySix.setOnClickListener {
            shrink(binding.thirtySix)
            sendData(
                getString(R.string.thirtysixtitle),
                getString(R.string.ThirtySix),
                getString(R.string.thirtysix)
            )
        }

        binding.thirtySeven.setOnClickListener {
            shrink(binding.thirtySeven)
            sendData(
                getString(R.string.thirtyseventitle),
                getString(R.string.ThirtySeven),
                getString(R.string.thirtyseven)
            )
        }

        binding.thirtyEight.setOnClickListener {
            shrink(binding.thirtyEight)
            sendData(
                getString(R.string.thirtyeighttitle),
                getString(R.string.ThirtyEight),
                getString(R.string.thirtyeight)
            )
        }

        binding.thirtyNine.setOnClickListener {
            shrink(binding.thirtyNine)
            sendData(
                getString(R.string.thirtyninetitle),
                getString(R.string.ThirtyNine),
                getString(R.string.thirtynin)
            )
        }

        binding.forty.setOnClickListener {
            shrink(binding.forty)
            sendData(
                getString(R.string.fourtytitle),
                getString(R.string.Fourty),
                getString(R.string.fourty)
            )
        }

        binding.back.setOnClickListener {
            finish()

        }
    }

    private fun sendData(title: String, mathNum: String, romanNum: String) {
        val intent = Intent(this@FourHundred, Blackboard::class.java)
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