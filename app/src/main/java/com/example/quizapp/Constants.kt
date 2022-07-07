package com.example.quizapp

object Constants {

    const val USER_NAME : String="user_name"
    const val TOTAL_QUESTION:String ="total_question"
    const val CORRECT_ANSWERS: String="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()

        val que1=Question(
            1,"Identify the object",
            R.drawable.flag_of_india,
            "ध्वज","स्टिच","पुस्तक","कर्गजम्",
            1

        )
        questionList.add(que1)

        val que2=Question(
            1,"Identify the object",
            R.drawable.book,
            "हेर","स्टिच","पुस्तक","कर्गजम्",
            3

        )
        questionList.add(que2)

        val que3=Question(
            1,"Identify the object",
            R.drawable.apple,
            "सेवफल","स्टिच", "नारङ्ग","कर्गजम्",
            1

        )
        questionList.add(que3)

        val que4=Question(
            1,"Identify the object",
            R.drawable.birds,
            "हेर", "पक्षिणः","पुस्तक","कर्गजम्",
            2

        )
        questionList.add(que4)

        val que5=Question(
            1,"Identify the object",
            R.drawable.bottle,
            "हेर","स्टिच","पुस्तक","कूपी",
            4

        )
        questionList.add(que5)

        val que6=Question(
            1,"Identify the object",
            R.drawable.bulb,
            "हेर","स्टिच","बल्बः","कर्गजम्",
            3

        )
        questionList.add(que6)

        val que7=Question(
            1,"Identify the object",
            R.drawable.chair,
            "आसन्द","स्टिच","पुस्तक","कर्गजम्",
            1

        )
        questionList.add(que7)

        val que8=Question(
            1,"Identify the object",
            R.drawable.clock,
            "हेर","स्टिच","पुस्तक",
                    "घटिका",
            4

        )
        questionList.add(que8)

        val que9=Question(
            1,"Identify the object",
            R.drawable.comb,
            "हेर","स्टिच","कङ्कत","कर्गजम्",
            3

        )
        questionList.add(que9)

        val que10=Question(
            1,"Identify the object",
            R.drawable.crocodile,
            "मीन","मकरः","पुस्तक","कर्गजम्",
            2

        )
        questionList.add(que10)

        val que11=Question(
            1,"Identify the object",
            R.drawable.fish,
            "मीन","मकरः","पुस्तक","कर्गजम्",
            1

        )
        questionList.add(que11)

        val que12=Question(
            1,"Identify the object",
            R.drawable.frog,
            "हेर","मंडूक:","पुस्तक","कर्गजम्",
            2

        )
        questionList.add(que12)

        val que13=Question(
            1,"Identify the object",
            R.drawable.moon,
            "हेर","शशांक","पुस्तक","सूर्य",
            2

        )
        questionList.add(que13)

        val que14=Question(
            1,"Identify the object",
            R.drawable.sun,
            "हेर","स्टिच","सूर्य","कर्गजम्",
            3

        )
        questionList.add(que14)
        return questionList
    }
}