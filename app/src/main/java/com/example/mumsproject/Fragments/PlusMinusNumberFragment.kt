package com.example.mumsproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.mumsproject.Question
import com.example.mumsproject.R
import com.example.mumsproject.contract.navigator
import kotlin.random.Random


class PlusMinusNumberFragment : Fragment() {
    private val random =  listOf(1,2,3,4,5,6,7,8,9,10).shuffled()


    val questions = listOf(
        Question("${random[0]}" + " - " + "${random[0]} =", random[0]-random[0]),
        Question("${random[1]}" + " - " + "${random[1]} =", random[1]-random[1]),
        Question("${random[2]}" + " - " + "${random[2]} =", random[2]-random[2]),
        Question("${random[3]}" + " - " + "${random[3]} =", random[3]-random[3]),
        Question("${random[4]}" + " - " + "${random[4]} =", random[4]-random[4]),
        Question("${random[5]}" + " - " + "${random[5]} =", random[5]-random[5]),
        Question("${random[6]}" + " - " + "${random[6]} =", random[6]-random[6]),
        Question("${random[7]}" + " - " + "${random[7]} =", random[7]-random[7]),
        Question("${random[8]}" + " - " + "${random[8]} =", random[8]-random[8]),
        Question("${random[9]}" + " - " + "${random[9]} =", random[9]-random[9]),
        Question(" ", 1)
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

    private lateinit var image1: ImageView
    private lateinit var image2: ImageView
    private lateinit var image3: ImageView
    private lateinit var image4: ImageView
    private lateinit var image5: ImageView
    private lateinit var image6: ImageView
    private lateinit var image7: ImageView
    private lateinit var image8: ImageView
    private lateinit var image9: ImageView
    private lateinit var image10: ImageView

    private lateinit var firstQuestion: TextView
    private lateinit var count: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_plus_minus_number, container, false)

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

        image1 = view.findViewById(R.id.aplle1) as ImageView
        image2 = view.findViewById(R.id.aplle2) as ImageView
        image3 = view.findViewById(R.id.aplle3) as ImageView
        image4 = view.findViewById(R.id.aplle4) as ImageView
        image5 = view.findViewById(R.id.aplle5) as ImageView
        image6 = view.findViewById(R.id.aplle6) as ImageView
        image7 = view.findViewById(R.id.aplle7) as ImageView
        image8 = view.findViewById(R.id.aplle8) as ImageView
        image9 = view.findViewById(R.id.aplle9) as ImageView
        image10 = view.findViewById(R.id.aplle10) as ImageView


        updateQuestionUI()


        return view
    }

    private fun updateCounting(){
        count.text = " $currentIndex / 10 "
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

        if(currentIndex == 10){
            navigator().showCongratulationsScreen()
        }
        if(currentIndex == 1){
            image1.visibility = View.VISIBLE
        }
        if(currentIndex == 2){
            image2.visibility =  View.VISIBLE
        }
        if(currentIndex == 3){
            image3.visibility = View.VISIBLE
        }
        if(currentIndex == 4){
            image4.visibility =  View.VISIBLE
        }
        if(currentIndex == 5){
            image5.visibility =  View.VISIBLE
        }
        if(currentIndex == 6){
            image6.visibility =  View.VISIBLE
        }
        if(currentIndex == 7){
            image7.visibility =  View.VISIBLE
        }
        if(currentIndex == 8){
            image8.visibility =  View.VISIBLE
        }
        if(currentIndex == 9){
            image9.visibility =  View.VISIBLE
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