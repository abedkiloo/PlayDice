package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var textRollDice: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*text*/
        textRollDice = findViewById(R.id.tv_roll_dice_text)
/*button roll dice*/
        val btnRollDice: Button = findViewById(R.id.btn_roll_dice)
        btnRollDice.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val numberRolled = Random.nextInt(6) + 1
        textRollDice?.text = numberRolled.toString()

    }
}
