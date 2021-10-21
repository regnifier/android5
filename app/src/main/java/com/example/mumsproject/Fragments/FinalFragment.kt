package com.example.mumsproject.Fragments

import android.os.Bundle
import android.os.CountDownTimer
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


class FinalFragment : Fragment() {



    private val random1 =  listOf(0,1,2,3,4,5,6,7,8,9).shuffled()
    private val random2 =  listOf(1,2,3,4,5,6,7,8,9,10).shuffled()
    private val random3 =  listOf(0,1, 2,3,4,5,6,7, 8).shuffled()
    private val random4 =  listOf(2,3,4,5,6,7,8,9,10).shuffled()
    private val random5 =  listOf(0,1, 2,3,4,5,6,7).shuffled()
    private val random6 =  listOf(3,4,5,6,7,8,9,10).shuffled()
    private val random7 =  listOf(1,2,3,4,5,6,7,8,9,10).shuffled()
    private val random8 =  listOf(1,2,3,4,5,6,7,8,9,10).shuffled()
    private val random9 =  listOf(1,2,3,4,5).shuffled()
    private val random10 =  listOf(2,4,6,8,10).shuffled()
    private val random11 =  listOf(4,5,6,7,8,9,10).shuffled()
    private val random12 =  listOf(4,5,6,7,8,9,10).shuffled()

    val questions = listOf(
        Question("1 + ${random1[0]} = ", 1+random1[0]),
        Question("${random5[0]} + 3 =", random5[0]+3),
        Question("0 + ${random7[0]} = ",0+random7[0]),
        Question("${random8[0]}" + " - " + "${random8[0]} =", random8[0]-random8[0]),
        Question("1 + ${random1[1]} =", 1+random1[1]),
        Question("${random9[0]} + ${random9[0]} =", random9[0]+random9[0]),
        Question("${random1[2]} + 1 =", 1+random1[2]),
        Question("${random6[0]} - 3 =", random6[0]-3),
        Question("${random4[2]} - 2 =", random4[2]-2),
        Question("${random9[1]} + ${random9[1]} =", random9[1]+random9[1]),
        Question("${random2[0]} - 1 =", random2[0]-1),
        Question("${random7[2]} + 0 =", 0+random7[2]),
        Question("${random10[0]} - ${random10[0]/2} =", random10[0]-(random10[0]/2)),
        Question("${random2[1]} - 1 =", random2[1]-1),
        Question("${random11[0]} - ${random11[0]-1} =", 1),
        Question("${random4[0]} - 2 =", random4[0]-2),
        Question("${random6[1]} - 3 =", random6[1]-3),
        Question("${random11[1]} - ${random11[1]-1} =", 1),
        Question("${random2[2]} - 1 =", random2[2]-1),
        Question("0 + ${random7[1]} =", 0+random7[1]),
        Question("${random10[1]} - ${random10[1]/2} =", random10[1]-(random10[1]/2)),
        Question("${random3[0]} + 2 =", random3[0]+2),
        Question("${random6[2]} - 3 =", random6[2]-3),
        Question("${random10[2]} - ${random10[2]/2} =", random10[2]-(random10[2]/2)),
        Question("2 + ${random3[1]} =", random3[1]+2),
        Question("${random11[2]} - ${random11[2]-2} =", 2),
        Question("${random5[1]} + 3 =", random5[1]+3),
        Question("${random12[0]} - ${random12[0]-3} =", 3),
        Question("${random8[1]}" + " - " + "${random8[1]} =", random8[1]-random8[1]),
        Question("${random12[1]} - ${random12[1]-4} =", 4),
        Question("${random3[2]} + 2 =", random3[2]+2),
        Question("3 + ${random5[2]} =", random5[2]+3),
        Question("${random8[2]}" + " - " + "${random8[2]} =", random8[2]-random8[2]),
        Question("${random4[1]} - 2 =", random4[1]-2),
        Question("${random12[2]} - ${random12[2]-3} =", 3),
        Question(" ", 1),

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
    private lateinit var time: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_final, container, false)

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
        time = view.findViewById(R.id.timer)


        updateQuestionUI()

        return view
    }

    private val timer = object : CountDownTimer(100000, 1000) {

        override fun onTick(millisUntilFinished: Long) {
            time.setText("Осталось: " + millisUntilFinished / 1000)
        }

        override fun onFinish() {
            navigator().showLostScreen()
        }
    }


    private fun updateCounting(){
        count.text = " $currentIndex / 35 "
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

    private fun updateQuestionUI(){
        currentIndex++
        currentIndex%questions.size
        val textViewById = currentQuestionText
        firstQuestion.text = textViewById

        if(currentIndex == 35){
            navigator().showCongratulationsScreen()
        }
        if(currentIndex == 1){
            timer.start()
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