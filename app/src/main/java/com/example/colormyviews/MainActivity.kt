
package com.android.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

lateinit var boxOneText: TextView
lateinit var boxTwoText: TextView
lateinit var boxThreeText: TextView
lateinit var boxFourText: TextView
lateinit var boxFiveText: TextView
lateinit var redButton: TextView
lateinit var greenButton: TextView
lateinit var yellowButton: TextView
lateinit var rootConstraintLayout : View



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boxOneText = findViewById<TextView>(R.id.box_one_text)
        boxTwoText = findViewById<TextView>(R.id.box_two_text)
        boxThreeText = findViewById<TextView>(R.id.box_three_text)
        boxFourText = findViewById<TextView>(R.id.box_four_text)
        boxFiveText = findViewById<TextView>(R.id.box_five_text)
        redButton = findViewById<TextView>(R.id.red_button)
        greenButton = findViewById<TextView>(R.id.green_button)
        yellowButton = findViewById<TextView>(R.id.yellow_button)
        rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        setListeners()
    }
    private fun setListeners() {
        val clickableViews: List<View> =
            listOf( boxOneText, boxTwoText, boxThreeText,
                    boxFourText, boxFiveText, rootConstraintLayout,
                    redButton, greenButton, yellowButton )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}