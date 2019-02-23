package com.example.rog.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

        val foodList= arrayListOf("Chinese","Hamburger","Pizza","Pav Bhaji","Burger")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener()
        {
            val random = Random()
            val randomFood= random.nextInt(foodList.count())
            textView.text=foodList[randomFood]
        }
        foodAddBtn.setOnClickListener()
        {
            val newFood= editText.text.toString()
            foodList.add(newFood)
            editText.text.clear()
        }


    }
}
