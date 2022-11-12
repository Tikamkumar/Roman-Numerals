package com.tikamkumar.romannumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tikamkumar.romannumbers.databinding.ActivityThousandBinding

class Thousand : AppCompatActivity() {

    private lateinit var binding: ActivityThousandBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThousandBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Animation All Buttons when Click Range 901 to 1000 Button of MainActivity
        animation(binding.ninetyOne)
        animation(binding.ninetyTwo)
        animation(binding.ninetyThree)
        animation(binding.ninetyFour)
        animation(binding.ninetyFive)
        animation(binding.ninetySix)
        animation(binding.ninetySeven)
        animation(binding.ninetyEight)
        animation(binding.ninetyNine)
        animation(binding.thousand)

// Go to BlackBoard Activity And With Take Upper Title , Math Numbers and Roman Numbers
// According to Click Button
        binding.ninetyOne.setOnClickListener {
            shrink(binding.ninetyOne)
            sendData(
                getString(R.string.nintyonetitle),
                getString(R.string.NintyOne),
                getString(R.string.nintyone)
            )
        }

        binding.ninetyTwo.setOnClickListener {
            shrink(binding.ninetyTwo)
            sendData(
                getString(R.string.nintytwotitle),
                getString(R.string.NintyTwo),
                getString(R.string.nintytwo)
            )
        }

        binding.ninetyThree.setOnClickListener {
            shrink(binding.ninetyThree)
            sendData(
                getString(R.string.nintythreetitle),
                getString(R.string.NintyThree),
                getString(R.string.nintythree)
            )
        }

        binding.ninetyFour.setOnClickListener {
            shrink(binding.ninetyFour)
            sendData(
                getString(R.string.nintyfourtitle),
                getString(R.string.NintyFour),
                getString(R.string.nintyfour)
            )
        }


        binding.ninetyFive.setOnClickListener {
            shrink(binding.ninetyFive)
            sendData(
                getString(R.string.nintyfivetitle),
                getString(R.string.NintyFive),
                getString(R.string.nintyfive)
            )
        }

        binding.ninetySix.setOnClickListener {
            shrink(binding.ninetySix)
            sendData(
                getString(R.string.nintysixtitle),
                getString(R.string.NintySix),
                getString(R.string.nintysix)
            )
        }

        binding.ninetySeven.setOnClickListener {
            shrink(binding.ninetySeven)
            sendData(
                getString(R.string.nintyseventitle),
                getString(R.string.NintySeven),
                getString(R.string.nintyseven)
            )
        }

        binding.ninetyEight.setOnClickListener {
            shrink(binding.ninetyEight)
            sendData(
                getString(R.string.nintyeighttitle),
                getString(R.string.NintyEight),
                getString(R.string.nintyeight)
            )
        }

        binding.ninetyNine.setOnClickListener {
            shrink(binding.ninetyNine)
            sendData(
                getString(R.string.nintyninetitle),
                getString(R.string.NintyNine),
                getString(R.string.nintynin)
            )
        }

        binding.thousand.setOnClickListener {
            shrink(binding.thousand)
            sendData(
                getString(R.string.hundredtitle),
                getString(R.string.Hundred),
                getString(R.string.hundred)
            )
        }

        binding.back.setOnClickListener {
            finish()
        }
    }

    private fun sendData(title: String, mathNum: String, romanNum: String) {
        val intent = Intent(this@Thousand, Blackboard::class.java)
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