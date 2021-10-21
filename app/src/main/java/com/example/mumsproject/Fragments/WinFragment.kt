package com.example.mumsproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.mumsproject.R
import com.example.mumsproject.contract.navigator


class WinFragment : Fragment() {


    private val random = listOf(" Грандиозно! ",
        " Умница! ",
        " Да ты гений! ",
        " Это фантастика! ",
        " Просто восхитительно! ",
        " Вот это класс! ",
        " Это невероятно " ).random()

    private lateinit var button: Button
    private lateinit var textview: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_win, container, false)

        button = view.findViewById(R.id.winMenu)
        button.setOnClickListener { navigator().goToMenu() }

        textview = view.findViewById(R.id.random_quate)

        changeQuate()

        return view
    }

    private fun changeQuate() {
        textview.text = random
    }

}