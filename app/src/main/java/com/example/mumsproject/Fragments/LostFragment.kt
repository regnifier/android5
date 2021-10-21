package com.example.mumsproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mumsproject.R
import com.example.mumsproject.contract.navigator

class LostFragment : Fragment() {

    private lateinit var button: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lost, container, false)

        button = view.findViewById(R.id.lostMenu)
        button.setOnClickListener { navigator().goToMenu() }

        return view
    }


}