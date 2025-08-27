package com.example.quizapp.ui

import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R
import com.example.quizapp.model.Questions
import com.example.quizapp.utils.Constansts

class QuestionActivity : AppCompatActivity() {
    private lateinit var progressBar : ProgressBar
    private lateinit var textViewProgress: TextView
    private lateinit var textViewQuestion: TextView
    private lateinit var textViewOptionOne: TextView
    private lateinit var textViewOptionTwo: TextView
    private lateinit var textViewOptionThree: TextView
    private lateinit var textViewOptionFour: TextView

    private val currentPosition = 1
    private lateinit var questionList: MutableList<Questions>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question)
        progressBar = findViewById(R.id.progressBar)
        textViewProgress = findViewById(R.id.progressTextView)
        textViewQuestion = findViewById(R.id.qyestionTextView)
        textViewOptionOne = findViewById(R.id.optionOne)
        textViewOptionTwo = findViewById(R.id.optionTwo)
        textViewOptionThree = findViewById(R.id.optionThree)
        textViewOptionFour = findViewById(R.id.optionFour)


        questionList = Constansts.getQuestions()
        setQuestions()
    }


    private fun setQuestions(){
        val questions = questionList[currentPosition-1]
        progressBar.progress = currentPosition
        textViewProgress.text = "$currentPosition/${progressBar.max}"
        textViewQuestion.text = questions.question
        textViewOptionOne.text = questions.optionOne
        textViewOptionTwo.text = questions.optionTwo
        textViewOptionThree.text = questions.optionThree
        textViewOptionFour.text = questions.optionFour
    }
}