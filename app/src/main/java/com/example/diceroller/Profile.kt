package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {


    private val name: UserProfile = UserProfile(name = "ABed loo")

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile)

        binding.userProfile = name

    }
}
