package com.tikamkumar.romannumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Blackboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blackboard)

/*Access the  String to intent by One to Thousand*/

        val mathNumber = intent.getStringExtra("mathNum")
        val equal = intent.getStringExtra("Equal")
        val romNum = intent.getStringExtra("romNum")
        val title = intent.getStringExtra("Title")

        /*Access the View Of activity_board.xml*/

        val number: TextView = findViewById(R.id.NumMath)
        val eual: TextView = findViewById(R.id.equal)
        val roman: TextView = findViewById(R.id.RomNm)
        val heading: TextView = findViewById(R.id.title)
        val duster: ImageView = findViewById(R.id.allclear)
        val chock: ImageView = findViewById(R.id.chock)

// To Take Animation in title , Math numbers , equal and Roman Numbers

        animation(heading,400)
        animation(roman)
        animation(eual)
        animation(number)
        animation(duster,400)
        animation(chock,400)

/*The Set String number , equal and roman to intent String*/

        number.text = mathNumber.toString()
        eual.text = equal.toString()
        roman.text = romNum.toString()
        heading.text = title.toString()

/*Clear the blackBoard when  duster touch*/

        duster.setOnClickListener {
            number.text = " "
            eual.text = " "
            roman.text = " "
            heading.text = " "
        }

/* Return the All Text Removing By Duster*/

        chock.setOnClickListener {
            number.text = mathNumber.toString()
            eual.text = equal.toString()
            roman.text = romNum.toString()
            heading.text = title.toString()
        }

        /*Go to last activity*/
val back : ImageView = findViewById(R.id.back)
  back.setOnClickListener {
      finish()
  }
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