package com.example.mumsproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.example.mumsproject.R
import com.example.mumsproject.contract.navigator


class SecondLvlFragment : Fragment() {

    private lateinit var firstButton: Button
    private lateinit var secondButton: Button
    private lateinit var thridButton: Button
    private lateinit var sevenButton: Button
    private lateinit var backButton: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second_lvl, container, false)

        firstButton = view.findViewById(R.id.first) as Button
        secondButton = view.findViewById(R.id.second) as Button
        thridButton = view.findViewById(R.id.thrid) as Button
        sevenButton = view.findViewById(R.id.seven) as Button
        backButton = view.findViewById(R.id.back_button) as ImageButton


        firstButton.setOnClickListener { on1LevelPressed() }
        secondButton.setOnClickListener { on2LevellPressed() }
        thridButton.setOnClickListener { on3LevelPressed() }
        sevenButton.setOnClickListener { onFinalLevelPressed() }
        backButton.setOnClickListener { onBackPressed() }

        return view
    }

    private fun onBackPressed() {
        navigator().goToMenu()
    }

    private fun onFinalLevelPressed() {
        navigator().showSecondFinalScreen()
    }

    private fun on3LevelPressed() {
        navigator().showPlusHalfNumberScreen()
    }

    private fun on2LevellPressed() {
        navigator().showPlusNumberScreen()
    }

    private fun on1LevelPressed() {
        navigator().showPlus0Screen()
    }


}