package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private lateinit var imageViewRollDice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
/*text*/
//        imageViewRollDice = findViewById(R.id.iV_roll_dice_text)
/*button roll dice*/
        val btnRollDice: Button = findViewById(R.id.btn_roll_dice)

        binding.btnRollDice.setOnClickListener{
            rollDice()
        }

    }

    private fun rollDice() {
        val numberRolled = Random.nextInt(6) + 1

        val drawableResource = when (numberRolled) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_3
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        binding.iVRollDiceText.setImageResource(drawableResource)
    }

    fun btnPlayerProfile(view: View) {

        startActivity(
            Intent(
                this
                , Profile::class.java
            )
        )
    }
}
