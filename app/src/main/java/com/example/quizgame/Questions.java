package com.example.quizgame;

public class Questions
{
    public String myQuestions [] = {

            "What country has the highest life expectancy?",
            "Where would you be if you were standing on the Spanish Steps?",
            "Which language has the more native speakers: English or Spanish?",
            "What is the most common surname in the United States?",
            "What disease commonly spread on pirate ships?",

};

    private String myChoices [][]={

            {"Hong Kong","China","Japan","Chicago"},
            {"Italy","Spain","Rome","Portuguese"},
            {"English","Spanish","Both","None of the above"},
            {"John","David","Bruce","Smith"},
            {"Measles","Scurvy","Jaundice","chicken pox"},
    };

    private String correctAnswers [] = {"Hong Kong", "Rome","Spanish","Smith","Scurvy"};

    public String getQuestion(int a)
    {
        String question = myQuestions[a];
        return question;
    }

    public String getOption1(int a)
    {
        String option1 = myChoices[a][0];
        return option1;
    }
    public String getOption2(int a)
    {
        String option2 = myChoices[a][1];
        return option2;
    }
    public String getOption3(int a)
    {
        String option3 = myChoices[a][2];
        return option3;
    }
    public String getOption4(int a)
    {
        String option4 = myChoices[a][3];
        return option4;
    }

    public String correctAnswers(int a)
    {
        String answer = correctAnswers[a];
        return answer;
    }




}
