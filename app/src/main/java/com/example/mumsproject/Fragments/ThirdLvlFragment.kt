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


class ThirdLvlFragment : Fragment() {

    private lateinit var firstButton: Button
    private lateinit var secondButton: Button
    private lateinit var thridButton: Button
    private lateinit var backButton: ImageButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third_lvl, container, false)
        firstButton = view.findViewById(R.id.first) as Button
        secondButton = view.findViewById(R.id.second) as Button
        thridButton = view.findViewById(R.id.seven) as Button
        backButton = view.findViewById(R.id.back_button) as ImageButton


        firstButton.setOnClickListener { on1LevelPressed() }
        secondButton.setOnClickListener { on2LevellPressed() }
        thridButton.setOnClickListener { on3LevelPressed() }
        backButton.setOnClickListener { onBackPressed() }


        return view
    }

    private fun onBackPressed() {
        navigator().goToMenu()
    }

    private fun on3LevelPressed() {
        navigator().show1234NumberScreen()
    }

    private fun on2LevellPressed() {
        navigator().show34NumberScreen()
    }

    private fun on1LevelPressed() {
        navigator().show12NumberScreen()
    }

}