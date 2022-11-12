package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tikamkumar.romannumbers.databinding.ActivitySixHundredBinding

class SixHundred : AppCompatActivity() {

    private lateinit var binding: ActivitySixHundredBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySixHundredBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Animation All Buttons when Click Range 501 to 600 Button of MainActivity
        animation(binding.fiftyOne)
        animation(binding.fiftyTwo)
        animation(binding.fiftyThree)
        animation(binding.fiftyFour)
        animation(binding.fiftyFive)
        animation(binding.fiftySix)
        animation(binding.fiftySeven)
        animation(binding.fiftyEight)
        animation(binding.fiftyNine)
        animation(binding.sixty)

// Go to BlackBoard Activity And With Take Upper Title , Math Numbers and Roman Numbers
// According to Click Button
        binding.fiftyOne.setOnClickListener {
            shrink(binding.fiftyOne)
            sendData(
                getString(R.string.fiftyonetitle),
                getString(R.string.FiftyOne),
                getString(R.string.fiftyone)
            )
        }

        binding.fiftyTwo.setOnClickListener {
            shrink(binding.fiftyTwo)
            sendData(
                getString(R.string.fiftytwotitle),
                getString(R.string.FiftyTwo),
                getString(R.string.fiftytwo)
            )
        }

        binding.fiftyThree.setOnClickListener {
            shrink(binding.fiftyThree)
            sendData(
                getString(R.string.fiftythreetitle),
                getString(R.string.FiftyThree),
                getString(R.string.fiftythree)
            )
        }

        binding.fiftyFour.setOnClickListener {
            shrink(binding.fiftyFour)
            sendData(
                getString(R.string.fiftyfourtitle),
                getString(R.string.FiftyFour),
                getString(R.string.fiftyfour)
            )
        }

        binding.fiftyFive.setOnClickListener {
            shrink(binding.fiftyFive)
            sendData(
                getString(R.string.fiftyfivetitle),
                getString(R.string.FiftyFive),
                getString(R.string.fiftyfive)
            )
        }

        binding.fiftySix.setOnClickListener {
            shrink(binding.fiftySix)
            sendData(
                getString(R.string.fiftysixtitle),
                getString(R.string.FiftySix),
                getString(R.string.fiftysix)
            )
        }

        binding.fiftySeven.setOnClickListener {
            shrink(binding.fiftySeven)
            sendData(
                getString(R.string.fiftyseventitle),
                getString(R.string.FiftySeven),
                getString(R.string.fiftyseven)
            )
        }

        binding.fiftyEight.setOnClickListener {
            shrink(binding.fiftyEight)
            sendData(
                getString(R.string.fiftyeighttitle),
                getString(R.string.FiftyEight),
                getString(R.string.fiftyeight)
            )
        }

        binding.fiftyNine.setOnClickListener {
            shrink(binding.fiftyNine)
            sendData(
                getString(R.string.fiftyninetitle),
                getString(R.string.FiftyNine),
                getString(R.string.fiftynin)
            )
        }

        binding.sixty.setOnClickListener {
            shrink(binding.sixty)
            sendData(
                getString(R.string.sixtytitle),
                getString(R.string.Sixty),
                getString(R.string.sixty)
            )
        }

        binding.back.setOnClickListener {
            finish()
        }
    }

    private fun sendData(title: String, mathNum: String, romanNum: String) {
        val intent = Intent(this@SixHundred, Blackboard::class.java)
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