package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tikamkumar.romannumbers.databinding.ActivitySevenHundredBinding

class SevenHundred : AppCompatActivity() {

    private lateinit var binding: ActivitySevenHundredBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySevenHundredBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Animation All Buttons when Click Range 601 to 700 Button of MainActivity
        animation(binding.sixtyOne)
        animation(binding.sixtyTwo)
        animation(binding.sixtyThree)
        animation(binding.sixtyFour)
        animation(binding.sixtyFive)
        animation(binding.sixtySix)
        animation(binding.sixtySeven)
        animation(binding.sixtyEight)
        animation(binding.sixtyNine)
        animation(binding.seventy)

// Go to BlackBoard Activity And With Take Upper Title , Math Numbers and Roman Numbers
// According to Click Button
        binding.sixtyOne.setOnClickListener {
            shrink(binding.sixtyOne)
            sendData(
                getString(R.string.sixtyonetitle),
                getString(R.string.SixtyOne),
                getString(R.string.sixtyone)
            )
        }

        binding.sixtyTwo.setOnClickListener {
            shrink(binding.sixtyTwo)
            sendData(
                getString(R.string.sixtytwotitle),
                getString(R.string.SixtyTwo),
                getString(R.string.sixtytwo)
            )
        }

        binding.sixtyThree.setOnClickListener {
            shrink(binding.sixtyThree)
            sendData(
                getString(R.string.sixtythreetitle),
                getString(R.string.SixtyThree),
                getString(R.string.sixtythree)
            )
        }

        binding.sixtyFour.setOnClickListener {
            shrink(binding.sixtyFour)
            sendData(
                getString(R.string.sixtyfourtitle),
                getString(R.string.SixtyFour),
                getString(R.string.sixtyfour)
            )
        }

        binding.sixtyFive.setOnClickListener {
            shrink(binding.sixtyFive)
            sendData(
                getString(R.string.sixtyfivetitle),
                getString(R.string.SixtyFive),
                getString(R.string.sixtyfive)
            )
        }

        binding.sixtySix.setOnClickListener {
            shrink(binding.sixtySix)
            sendData(
                getString(R.string.sixtysixtitle),
                getString(R.string.SixtySix),
                getString(R.string.sixtysix)
            )
        }

        binding.sixtySeven.setOnClickListener {
            shrink(binding.sixtySeven)
            sendData(
                getString(R.string.sixtyseventitle),
                getString(R.string.SixtySeven),
                getString(R.string.sixtyseven)
            )
        }

        binding.sixtyEight.setOnClickListener {
            shrink(binding.sixtyEight)
            sendData(
                getString(R.string.sixtyeighttitle),
                getString(R.string.SixtyEight),
                getString(R.string.sixtyeight)
            )
        }

        binding.sixtyNine.setOnClickListener {
            shrink(binding.sixtyNine)
            sendData(
                getString(R.string.sixtyninetitle),
                getString(R.string.SixtyNine),
                getString(R.string.sixtynin)
            )
        }

        binding.seventy.setOnClickListener {
            shrink(binding.seventy)
            sendData(
                getString(R.string.seventytitle),
                getString(R.string.Seventy),
                getString(R.string.seventy)
            )
        }

        binding.back.setOnClickListener {
            finish()
        }
    }

    private fun sendData(title: String, mathNum: String, romanNum: String) {
        val intent = Intent(this@SevenHundred, Blackboard::class.java)
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