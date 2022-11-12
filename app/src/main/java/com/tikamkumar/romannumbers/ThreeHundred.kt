package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tikamkumar.romannumbers.databinding.ActivityThreeHundredBinding

class ThreeHundred : AppCompatActivity() {

    private lateinit var binding: ActivityThreeHundredBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThreeHundredBinding.inflate(layoutInflater)
        setContentView(binding.root)

// Animation All Buttons when Click Range 201 to 300 Button of MainActivity
        animation(binding.twentyOne)
        animation(binding.twentyTwo)
        animation(binding.twentyThree)
        animation(binding.twentyFour)
        animation(binding.twentyFive)
        animation(binding.twentySix)
        animation(binding.twentySeven)
        animation(binding.twentyEight)
        animation(binding.twentyNine)
        animation(binding.thirty)


// Go to BlackBoard Activity And With Take Upper Title , Math Numbers and Roman Numbers
// According to Click Button
        binding.twentyOne.setOnClickListener {
            sendData(
                getString(R.string.twentyonetitle),
                getString(R.string.TwentyOne),
                getString(R.string.twentyone)
            )
            shrink(binding.twentyOne)
        }

        binding.twentyTwo.setOnClickListener {
            sendData(
                getString(R.string.twentytwotitle),
                getString(R.string.TwentyTwo),
                getString(R.string.twentytwo)
            )
            shrink(binding.twentyTwo)
        }

        binding.twentyThree.setOnClickListener {
            sendData(
                getString(R.string.twentythreetitle),
                getString(R.string.TwentyThree),
                getString(R.string.twentythree)
            )
            shrink(binding.twentyThree)
        }

        binding.twentyFour.setOnClickListener {
            sendData(
                getString(R.string.twentyfourtitle),
                getString(R.string.TwentyFour),
                getString(R.string.twentyfour)
            )
            shrink(binding.twentyFour)
        }

        binding.twentyFive.setOnClickListener {
            sendData(
                getString(R.string.twentyfivetitle),
                getString(R.string.TwentyFive),
                getString(R.string.twentyfive)
            )
            shrink(binding.twentyFive)
        }

        binding.twentySix.setOnClickListener {
            sendData(
                getString(R.string.twentysixtitle),
                getString(R.string.TwentySix),
                getString(R.string.twentysix)
            )
            shrink(binding.twentySix)
        }

        binding.twentySeven.setOnClickListener {
            sendData(
                getString(R.string.twentyseventitle),
                getString(R.string.TwentySeven),
                getString(R.string.twentyseven)
            )
            shrink(binding.twentySeven)
        }

        binding.twentyEight.setOnClickListener {
            sendData(
                getString(R.string.twentyeighttitle),
                getString(R.string.TwentyEight),
                getString(R.string.twentyeight)
            )
            shrink(binding.twentyEight)
        }

        binding.twentyNine.setOnClickListener {
            sendData(
                getString(R.string.twentyninetitle),
                getString(R.string.TwentyNine),
                getString(R.string.twentynin)
            )
            shrink(binding.twentyNine)
        }

        binding.thirty.setOnClickListener {
            sendData(
                getString(R.string.thirtytitle),
                getString(R.string.Thirty),
                getString(R.string.thirty)
            )
            shrink(binding.thirty)
        }

        binding.back.setOnClickListener {
            finish()
            shrink(binding.back)
        }
    }

    private fun sendData(title: String, mathNum: String, romanNum: String) {
        val intent = Intent(this@ThreeHundred, Blackboard::class.java)
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