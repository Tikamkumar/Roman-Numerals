package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tikamkumar.romannumbers.databinding.ActivityHundredBinding

class Hundred : AppCompatActivity() {

    private lateinit var binding: ActivityHundredBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHundredBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Animation All Buttons when Click Range 1 to 100 Button of MainActivity
        animation(binding.one)
        animation(binding.two)
        animation(binding.three)
        animation(binding.four)
        animation(binding.five)
        animation(binding.six)
        animation(binding.seven)
        animation(binding.eight)
        animation(binding.nine)
        animation(binding.ten)

// Go to BlackBoard Activity And take Upper Title , Math Numbers and Roman Numbers

        binding.one.setOnClickListener {
            shrink(binding.one)
            sendData(
                getString(R.string.onetitle),
                getString(R.string.One),
                getString(R.string.OneTen)
            )
        }

        binding.two.setOnClickListener {
            shrink(binding.two)
            sendData(
                getString(R.string.twotitle),
                getString(R.string.Two),
                getString(R.string.EleTwn)
            )
        }

        binding.three.setOnClickListener {
            shrink(binding.three)
            sendData(
                getString(R.string.threetitle),
                getString(R.string.Three),
                getString(R.string.TwnOneToThirty)
            )
        }

        binding.four.setOnClickListener {
            shrink(binding.four)
            sendData(
                getString(R.string.fourtitle),
                getString(R.string.Four),
                getString(R.string.ThrtyOneToFouty)
            )
        }

        binding.five.setOnClickListener {
            shrink(binding.five)
            sendData(
                getString(R.string.fivetitle),
                getString(R.string.Five),
                getString(R.string.FoutyOneToFifty)
            )
        }

        binding.six.setOnClickListener {
            shrink(binding.six)
            sendData(
                getString(R.string.sixtitle),
                getString(R.string.Six),
                getString(R.string.FiftyOneToSixty)
            )
        }

        binding.seven.setOnClickListener {
            shrink(binding.seven)
            sendData(
                getString(R.string.seventitle),
                getString(R.string.Seven),
                getString(R.string.SixtyOneToSevnty)
            )
        }

        binding.eight.setOnClickListener {
            shrink(binding.eight)
            sendData(
                getString(R.string.eighttitle),
                getString(R.string.Eight),
                getString(R.string.SentyOneToEighty)
            )
        }

        binding.nine.setOnClickListener {
            shrink(binding.nine)
            sendData(
                getString(R.string.ninetitle),
                getString(R.string.Nine),
                getString(R.string.EightyOneToNinty)
            )
        }

        binding.ten.setOnClickListener {
            shrink(binding.ten)
            sendData(
                getString(R.string.tentitle),
                getString(R.string.Ten),
                getString(R.string.NintyOneToHundred)
            )
        }

        binding.back.setOnClickListener {
            finish()
            shrink(binding.back)
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

    private fun sendData(title: String, mathNum: String, romanNum: String) {
        val intent = Intent(this@Hundred, Blackboard::class.java)
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
}