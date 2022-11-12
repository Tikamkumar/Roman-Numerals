package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tikamkumar.romannumbers.databinding.ActivityFiveHundredBinding

class FiveHundred : AppCompatActivity() {

    private lateinit var binding: ActivityFiveHundredBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFiveHundredBinding.inflate(layoutInflater)
        setContentView(binding.root)

// Animation All Buttons when Click Range 401 to 500 Button of MainActivity
        animation(binding.fortyOne)
        animation(binding.fortyTwo)
        animation(binding.fortyThree)
        animation(binding.fortyFour)
        animation(binding.fortyFive)
        animation(binding.fortySix)
        animation(binding.fortySeven)
        animation(binding.fortyEight)
        animation(binding.fortyNine)
        animation(binding.fifty)

// Go to BlackBoard Activity And With Take Upper Title , Math Numbers and Roman Numbers
// According to Click Button
        binding.fortyOne.setOnClickListener {
            shrink(binding.fortyOne)
            sendData(
                getString(R.string.fourtyonetitle),
                getString(R.string.FourtyOne),
                getString(R.string.fourtyone)
            )
        }

        binding.fortyTwo.setOnClickListener {
            shrink(binding.fortyTwo)
            sendData(
                getString(R.string.fourtytwotitle),
                getString(R.string.FourtyTwo),
                getString(R.string.fourtytwo)
            )
        }

        binding.fortyThree.setOnClickListener {
            shrink(binding.fortyThree)
            sendData(
                getString(R.string.fourtythreetitle),
                getString(R.string.FourtyThree),
                getString(R.string.fourtythree)
            )
        }

        binding.fortyFour.setOnClickListener {
            shrink(binding.fortyFour)
            sendData(
                getString(R.string.fourtyfourtitle),
                getString(R.string.FourtyFour),
                getString(R.string.fourtyfour)
            )
        }

        binding.fortyFive.setOnClickListener {
            shrink(binding.fortyFive)
            sendData(
                getString(R.string.fourtyfivetitle),
                getString(R.string.FourtyFive),
                getString(R.string.fourtyfive)
            )
        }

        binding.fortySix.setOnClickListener {
            shrink(binding.fortySix)
            sendData(
                getString(R.string.fourtysixtitle),
                getString(R.string.FourtySix),
                getString(R.string.fourtysix)
            )
        }

        binding.fortySeven.setOnClickListener {
            shrink(binding.fortySeven)
            sendData(
                getString(R.string.fourtyseventitle),
                getString(R.string.FourtySeven),
                getString(R.string.fourtyseven)
            )
        }

        binding.fortyEight.setOnClickListener {
            shrink(binding.fortyEight)
            sendData(
                getString(R.string.fourtyeighttitle),
                getString(R.string.FourtyEight),
                getString(R.string.fourtyeight)
            )
        }

        binding.fortyNine.setOnClickListener {
            shrink(binding.fortyNine)
            sendData(
                getString(R.string.fourtyninetitle),
                getString(R.string.FourtyNine),
                getString(R.string.fourtynin)
            )
        }

        binding.fifty.setOnClickListener {
            shrink(binding.fifty)
            sendData(
                getString(R.string.fiftytitle),
                getString(R.string.Fifty),
                getString(R.string.fifty)
            )
        }

        binding.back.setOnClickListener {
            finish()
        }
    }

    private fun sendData(title: String, mathNum: String, romanNum: String) {
        val intent = Intent(this@FiveHundred, Blackboard::class.java)
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
