package com.example.mumsproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.example.mumsproject.R
import com.example.mumsproject.contract.navigator
import kotlin.random.Random


class FirstLvlFragment : Fragment() {



    private val random = List(10){ Random.nextInt(1,10)}

    private lateinit var firstButton: Button
    private lateinit var secondButton: Button
    private lateinit var thridButton: Button
    private lateinit var forthButton: Button
    private lateinit var fifthButton: Button
    private lateinit var sixButton: Button
    private lateinit var sevenButton: Button
    private lateinit var backButton: ImageButton
    private lateinit var minds: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_lvl, container, false)

        firstButton = view.findViewById(R.id.first) as Button
        secondButton = view.findViewById(R.id.second) as Button
        thridButton = view.findViewById(R.id.thrid) as Button
        forthButton = view.findViewById(R.id.forth) as Button
        fifthButton = view.findViewById(R.id.fifth) as Button
        sixButton = view.findViewById(R.id.six) as Button
        sevenButton = view.findViewById(R.id.seven) as Button
        backButton = view.findViewById(R.id.back_button) as ImageButton



        firstButton.setOnClickListener { onPlusButtonPressed() }
        secondButton.setOnClickListener { onMinusOneButtonPressed() }
        thridButton.setOnClickListener { onPlusTwoButtonPressed() }
        forthButton.setOnClickListener { onMinusTwoButtonPressed() }
        fifthButton.setOnClickListener { onPlusThreeButtonPressed() }
        sixButton.setOnClickListener { onMinusThreeButtonPressed() }
        sevenButton.setOnClickListener { onFirstFinalLvlPressed() }
        backButton.setOnClickListener { onBackPressed() }






        return view
    }





    private fun onBackPressed() {
        navigator().goToMenu()
    }

    private fun onFirstFinalLvlPressed() {
        navigator().showFirstFinalScreen()
    }

    private fun onMinusThreeButtonPressed() {
        navigator().showMinus3Screen()
    }

    private fun onPlusThreeButtonPressed() {
        navigator().showPlus3Screen()
    }

    private fun onMinusTwoButtonPressed() {
        navigator().showMinus2Screen()
    }

    private fun onPlusTwoButtonPressed() {
        navigator().showPlus2Screen()
    }

    private fun onMinusOneButtonPressed() {
        navigator().showMinus1Screen()
    }

    private fun onPlusButtonPressed(){
        navigator().showMainScreen()
    }



}