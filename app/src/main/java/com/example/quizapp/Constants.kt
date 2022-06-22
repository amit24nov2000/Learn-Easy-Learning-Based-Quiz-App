package com.example.quizapp

object Constants {

    const val USER_NAME : String="user_name"
    const val TOTAL_QUESTION:String ="total_question"
    const val CORRECT_ANSWERS: String="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()

        val que1=Question(
            1,"what country does this flag belong to?",
            R.drawable.flag_of_argentina,
            "Argentina","Australia","India","Armenia",
            1

        )
        questionList.add(que1)

        val que2=Question(
            1,"what country does this flag belong to?",
            R.drawable.flag_of_belgium,
            "Argentina","Australia","belgium","Armenia",
            3

        )
        questionList.add(que2)

        val que3=Question(
            1,"what country does this flag belong to?",
            R.drawable.flag_of_denmark,
            "Argentina","Australia","India","denmark",
            4

        )
        questionList.add(que3)

        val que4=Question(
            1,"what country does this flag belong to?",
            R.drawable.flag_of_fiji,
            "Argentina","Australia","India","fiji",
            4

        )
        questionList.add(que4)

        val que5=Question(
            1,"what country does this flag belong to?",
            R.drawable.flag_of_germany,
            "Argentina","germany","India","Armenia",
            2

        )
        questionList.add(que5)

        val que6=Question(
            1,"what country does this flag belong to?",
            R.drawable.flag_of_india,
            "Argentina","Australia","India","Armenia",
            3

        )
        questionList.add(que6)

        val que7=Question(
            1,"what country does this flag belong to?",
            R.drawable.flag_of_kuwait,
            "Argentina","fiji","India","kuwait",
            4

        )
        questionList.add(que7)

        val que8=Question(
            1,"what country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina","Australia","India","Brazil",
            4

        )

        questionList.add(que8)
        return questionList
    }
}