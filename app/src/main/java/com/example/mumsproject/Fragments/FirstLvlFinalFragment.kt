package com.example.mumsproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.mumsproject.Question
import com.example.mumsproject.R
import com.example.mumsproject.contract.navigator
import kotlin.random.Random


class FirstLvlFinalFragment : Fragment() {

    val random1 =  listOf(0,1,2,3,4,5,6,7,8,9).shuffled()
    val random2 =  listOf(1,2,3,4,5,6,7,8,9,10).shuffled()
    val random3 =  listOf(0,1, 2,3,4,5,6,7, 8).shuffled()
    val random4 =  listOf(2,3,4,5,6,7,8,9,10).shuffled()
    val random5 =  listOf(0,1, 2,3,4,5,6,7).shuffled()
    val random6 =  listOf(3,4,5,6,7,8,9,10).shuffled()


    val questions = listOf(
        Question("1 + ${random1[0]} = ", 1+random1[0]),
        Question("${random2[0]} - 1 =", random2[0]-1),
        Question("1 + ${random1[1]} = ", 1+random1[1]),
        Question("${random2[1]} - 1 =", random2[1]-1),
        Question("${random3[0]} + 2 =", random3[0]+2),
        Question("${random4[0]} - 2 =", random4[0]-2),
        Question("${random3[1]} + 2 =", random3[1]+2),
        Question("${random4[1]} - 2 =", random4[1]-2),
        Question("${random5[0]} + 3 =", random5[0]+3),
        Question("${random6[0]} - 3 =", random6[0]-3),
        Question(" ", random6[1]-3),
    )

    var currentIndex = -1

    val currentQuestionAnswer: Int
        get() = questions[currentIndex].answer

    val currentQuestionText: String
        get() = questions[currentIndex].text


    private lateinit var button0: Button
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var button10: Button

    private lateinit var firstQuestion: TextView
    private lateinit var count: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_first_lvl_final, container, false)

        button0 = view.findViewById(R.id.answer0) as Button
        button0.setOnClickListener { zeroButton() }

        button1 = view.findViewById(R.id.answer1) as Button
        button1.setOnClickListener { firstButton() }

        button2 = view.findViewById(R.id.answer2) as Button
        button2.setOnClickListener { secondButton() }

        button3 = view.findViewById(R.id.answer3) as Button
        button3.setOnClickListener { thridButton() }

        button4 = view.findViewById(R.id.answer4) as Button
        button4.setOnClickListener { forthButton() }

        button5 = view.findViewById(R.id.answer5) as Button
        button5.setOnClickListener { fifthButton() }

        button6 = view.findViewById(R.id.answer6) as Button
        button6.setOnClickListener { sixButton() }

        button7 = view.findViewById(R.id.answer7) as Button
        button7.setOnClickListener { sevenButton() }

        button8 = view.findViewById(R.id.answer8) as Button
        button8.setOnClickListener { eightButton() }

        button9 = view.findViewById(R.id.answer9) as Button
        button9.setOnClickListener { nineButton() }

        button10 = view.findViewById(R.id.answer10) as Button
        button10.setOnClickListener { tenButton() }

        firstQuestion = view.findViewById(R.id.first_lvl_question)
        count = view.findViewById(R.id.counting)


        updateQuestionUI()

        return view
    }

    private fun checkAnswer(userAnswer: Int) {
        val correctAnswer = currentQuestionAnswer

        if (userAnswer == correctAnswer) {
            updateQuestionUI()
            updateCounting()
        }
        else{
            navigator().showLostScreen()
        }
    }

    private fun updateCounting(){
        count.text = " $currentIndex / 10 "
    }

    private fun updateQuestionUI(){
        currentIndex++
        currentIndex%questions.size
        val textViewById = currentQuestionText
        firstQuestion.text = textViewById

        if(currentIndex == 10){
            navigator().showCongratulationsScreen()
        }

    }

    private fun zeroButton() {
        checkAnswer(0)
    }

    private fun firstButton(){
        checkAnswer(1)
    }
    private fun secondButton(){
        checkAnswer(2)
    }
    private fun thridButton(){
        checkAnswer(3)
    }
    private fun forthButton(){
        checkAnswer(4)
    }
    private fun fifthButton(){
        checkAnswer(5)
    }
    private fun sixButton(){
        checkAnswer(6)
    }
    private fun sevenButton(){
        checkAnswer(7)
    }

    private fun eightButton(){
        checkAnswer(8)
    }
    private fun nineButton(){
        checkAnswer(9)
    }
    private fun tenButton(){
        checkAnswer(10)
    }
}