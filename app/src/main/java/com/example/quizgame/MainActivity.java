package com.example.quizgame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    Button option1, option2, option3, option4;
    TextView score,questions;

    private Questions myQuestions = new Questions();
    private String myAnswer;
    private int myScore = 0;
    private int myQuestionLength = myQuestions.myQuestions.length;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        option1 = (Button)findViewById(R.id.option1);
        option2 = (Button)findViewById(R.id.option2);
        option3 = (Button)findViewById(R.id.option3);
        option4 = (Button)findViewById(R.id.option4);

        score = (TextView) findViewById(R.id.scores);
        questions = (TextView)findViewById(R.id.questions);

        updateQuestions(r.nextInt(myQuestionLength));

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option1.getText()==myAnswer)
                {
                    myScore++;
                    score.setText("Score: "+myScore);
                    updateQuestions(r.nextInt(myQuestionLength));
                }
                else
                {
                    gameOver();
                }

            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option2.getText()==myAnswer)
                {
                    myScore++;
                    score.setText("Score: "+myScore);
                    updateQuestions(r.nextInt(myQuestionLength));
                }
                else
                {
                    gameOver();
                }

            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option3.getText()==myAnswer)
                {
                    myScore++;
                    score.setText("Score: "+myScore);
                    updateQuestions(r.nextInt(myQuestionLength));
                }
                else
                {
                    gameOver();
                }

            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(option4.getText()==myAnswer)
                {
                    myScore++;
                    score.setText("Score: "+myScore);
                    updateQuestions(r.nextInt(myQuestionLength));
                }
                else
                {
                    gameOver();
                }

            }
        });
    }

    private void updateQuestions(int num)
    {
        questions.setText(myQuestions.getQuestion(num));

        option1.setText(myQuestions.getOption1(num));
        option2.setText(myQuestions.getOption2(num));
        option3.setText(myQuestions.getOption3(num));
        option4.setText(myQuestions.getOption4(num));

        myAnswer = myQuestions.correctAnswers(num);
    }

    public void gameOver()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is"+myScore+"points")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                finish();
                            }
                        }


                )
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        }


                );
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }
}