package com.example.quizapp.utils

import com.example.quizapp.model.Questions

object Constansts{
    fun getQuestions(): MutableList<Questions>{
        val questionss = mutableListOf<Questions>()

        val que1 = Questions(
            1,"What is the capital of Japan?", "Beijing", "Tokyo", "Seoul", "Bangkok",3
        )
        questionss.add(que1)

        val que2 = Questions(
            2, "Which planet is known as the \"Red Planet\"?","Mars", "Venus", "Jupiter", "Saturn",1
        )
        questionss.add(que2)
        val que3 = Questions(
            3, "What is the largest mammal in the world?", "Elephant", "Blue Whale", "Giraffe", "Hippopotamus",2
        )
        questionss.add(que3)
        val que4 = Questions(
            4, "Which country is known as the \"Land of the Rising Sun\"?", "China", "India", "Japan", "South Korea",3
        )
        questionss.add(que4)

        val que5 = Questions(
            5, "What is the largest organ in the human body?", "Liver", "Skin", "Heart", "Brain",2
        )
        questionss.add(que5)
        val que6 = Questions(
            6, "Which gas do plants absorb from the atmosphere?", "Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen",1
        )
        questionss.add(que6)
        val que7 = Questions(
            7, "What is the largest river in the world?", "Nile", "Amazon", "Yangtze", "Mississippi",1
        )
        questionss.add(que7)

        val que8 = Questions(
            8, "Which country is known as the \"Land of the Rising Sun\"?", "China", "India", "Japan", "South Korea",3
        )
        questionss.add(que8)
        val que9 = Questions(
            9, "What is the largest organ in the human body?", "Liver", "Skin", "Heart", "Brain",2
        )
        questionss.add(que9)

        val que10 = Questions(
            10, "Which gas do plants absorb from the atmosphere?", "Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen",1
        )
        questionss.add(que10)

        return questionss
    }
}