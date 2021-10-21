package com.example.mumsproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mumsproject.R
import com.example.mumsproject.contract.navigator

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class LevelsFragment : Fragment() {



    private lateinit var level1Button: Button
    private lateinit var level2Button: Button
    private lateinit var level3Button: Button
    private lateinit var level4Button: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_levels, container, false)

        level1Button = view.findViewById(R.id.lvl1) as Button
        level2Button = view.findViewById(R.id.lvl2) as Button
        level3Button = view.findViewById(R.id.lvl3) as Button
        level4Button = view.findViewById(R.id.lvl4) as Button

        level1Button.setOnClickListener { on1LevelPressed() }
        level2Button.setOnClickListener { on2LevellPressed() }
        level3Button.setOnClickListener { on3LevelPressed() }
        level4Button.setOnClickListener { onFinalLevelPressed() }

        return view
    }

    private fun onFinalLevelPressed() {
        navigator().showFinalScreen()
    }

    private fun on3LevelPressed() {
        navigator().showThridLvl()
    }

    private fun on2LevellPressed() {
        navigator().showSecondLvl()
    }

    private fun on1LevelPressed(){
        navigator().showFirstLvl()
    }



}