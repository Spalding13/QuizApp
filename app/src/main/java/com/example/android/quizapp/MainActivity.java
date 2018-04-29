package com.example.android.quizapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


public void finishquiz(View view) {


        boolean isQuestion1Correct = false;
        boolean isQuestion2Correct = false;
        boolean isQuestion3Correct = false;
        boolean isQuestion4Correct = false;
        boolean isQuestion5Correct = false;
        boolean isQuestion6Correct = false;
        boolean isQuestion7Correct = false;

        RadioButton FirstAnswer = (RadioButton) findViewById(R.id.answer_B);
        boolean hasAnsweredB = FirstAnswer.isChecked();
        RadioButton SecondAnswer = (RadioButton) findViewById(R.id.answer_D);
        boolean hasAnsweredD = SecondAnswer.isChecked();
        RadioButton ThirdAnswer = (RadioButton) findViewById(R.id.answer_E);
        boolean hasAnsweredE = ThirdAnswer.isChecked();
        if (hasAnsweredB == true && hasAnsweredD == false && hasAnsweredE == false) {
            isQuestion1Correct = true;

        } else {
            isQuestion1Correct = false;

        }


        EditText question2Box = (EditText) findViewById(R.id.question2_box);
        String inputQuestion2 = question2Box.getText().toString();
        String AnswerToQuestion2 = "packet";
        if (inputQuestion2.equals(AnswerToQuestion2)) {
            isQuestion2Correct = true;
        } else {
            isQuestion2Correct = false;
        }


        RadioButton FirstBox3 = (RadioButton) findViewById(R.id.answer_maxwell);
        boolean hasAnsweredMaxwell = FirstBox3.isChecked();
        RadioButton SecondBox3 = (RadioButton) findViewById(R.id.answer_bio_savart);
        boolean hasAnsweredBioSav = SecondBox3.isChecked();
        RadioButton ThirdBox3 = (RadioButton) findViewById(R.id.answer_ampere);
        boolean hasAnsweredAmpere = ThirdBox3.isChecked();


        if (hasAnsweredMaxwell == true && hasAnsweredBioSav == false && hasAnsweredAmpere == false) {
            isQuestion3Correct = true;

        } else {
            isQuestion3Correct = false;
        }


        EditText question4Box = (EditText) findViewById(R.id.question4_box);
        String inputQuestion4 = question4Box.getText().toString();
        String AnswerToQuestion4FirstCase = "Amplitude Modulation";
        String AnswerToQuestion4SecondCase = "amplitude modulation";
        String AnswerToQuestion4ThirdCase = "Amplitude modulation";
        String AnswerToQuestion4FourthCase = "amplitude Modulation";

        if (inputQuestion4.equals(AnswerToQuestion4FirstCase) || inputQuestion4.equals(AnswerToQuestion4SecondCase) ||
                inputQuestion4.equals(AnswerToQuestion4ThirdCase) || inputQuestion4.equals(AnswerToQuestion4FourthCase)) {
            isQuestion4Correct = true;
        } else {
            isQuestion4Correct = false;
        }

        RadioButton FirstBox5 = (RadioButton) findViewById(R.id.answer_rocketlauncher);
        boolean hasAnsweredRocketLauncher = FirstBox5.isChecked();
        RadioButton SecondBox5 = (RadioButton) findViewById(R.id.answer_magictee);
        boolean hasAnsweredMagicTee = SecondBox5.isChecked();
        RadioButton ThirdBox5 = (RadioButton) findViewById(R.id.answer_ratrace);
        boolean hasAnsweredRatRace = ThirdBox5.isChecked();


        if (hasAnsweredRatRace == true && hasAnsweredRocketLauncher == false && hasAnsweredMagicTee == false) {
            isQuestion5Correct = true;

        } else {
            isQuestion5Correct = false;
        }


        RadioButton FirstBox6 = (RadioButton) findViewById(R.id.answer_ColoumbLaw);
        boolean hasAnsweredColoumbLaw = FirstBox6.isChecked();
        RadioButton SecondBox6 = (RadioButton) findViewById(R.id.answer_Speed_Of_Light);
        boolean hasAnsweredSpeedOfLight = SecondBox6.isChecked();
        RadioButton ThirdBox6 = (RadioButton) findViewById(R.id.answer_Ampere_law);
        boolean hasAnsweredAmpereLaw = ThirdBox6.isChecked();


        if (hasAnsweredSpeedOfLight == true && hasAnsweredColoumbLaw == false && hasAnsweredAmpereLaw == false) {
            isQuestion6Correct = true;

        } else {
            isQuestion6Correct = false;
        }

        CheckBox FirstBox7 = (CheckBox) findViewById(R.id.answer_7_1);
        boolean hasAnswered7_1 = FirstBox7.isChecked();
        CheckBox SecondBox7 = (CheckBox) findViewById(R.id.answer_7_2);
        boolean hasAnswered7_2 = SecondBox7.isChecked();
        CheckBox ThirdBox7 = (CheckBox) findViewById(R.id.answer_7_3);
        boolean hasAnswered7_3 = ThirdBox7.isChecked();


        if (hasAnswered7_1 == true && hasAnswered7_2 == true && hasAnswered7_3 == true) {
            isQuestion7Correct = true;

        } else {
            isQuestion7Correct = false;
        }

        int ScoreCount = ScoreCounter(isQuestion1Correct, isQuestion2Correct, isQuestion3Correct, isQuestion4Correct, isQuestion5Correct, isQuestion6Correct, isQuestion7Correct);

        String Summary = "";
        Summary = createSummaryText(isQuestion1Correct, isQuestion2Correct, isQuestion3Correct, isQuestion4Correct, isQuestion5Correct, isQuestion6Correct, isQuestion7Correct);
        displaySummary(Summary, ScoreCount);

    }

    private int ScoreCounter(boolean isQuestion1Correct, boolean isQuestion2Correct, boolean isQuestion3Correct,
                             boolean isQuestion4Correct, boolean isQuestion5Correct, boolean isQuestion6Correct, boolean isQuestion7Correct) {
        int Score = 0;
        if (isQuestion1Correct) {
            Score = Score + 1;
        }
        if (isQuestion2Correct) {
            Score = Score + 1;
        }
        if (isQuestion3Correct) {
            Score = Score + 1;
        }
        if (isQuestion4Correct) {
            Score = Score + 1;
        }
        if (isQuestion5Correct) {
            Score = Score + 1;
        }
        if (isQuestion6Correct) {
            Score = Score + 1;
        }
        if (isQuestion7Correct) {
            Score = Score + 1;
        }

        return Score;
    }

    private String createSummaryText(boolean isQuestion1Correct, boolean isQuestion2Correct, boolean isQuestion3Correct,
                                     boolean isQuestion4Correct, boolean isQuestion5Correct, boolean isQuestion6Correct, boolean isQuestion7Correct) {
        String Summary = "Your Summary: " +
                "\nAnswer to question 1 is: " + isQuestion1Correct +
                "\nAnswer to question 2 is: " + isQuestion2Correct +
                "\nAnswer to question 3 is :" + isQuestion3Correct +
                "\nAnswer to question 4 is :" + isQuestion4Correct +
                "\nAnswer to question 5 is :" + isQuestion5Correct +
                "\nAnswer to question 6 is :" + isQuestion6Correct +
                "\nAnswer to question 7 is :" + isQuestion7Correct;
        return Summary;
    }

    public void displaySummary(String Summary, int ScoreCount) {
        TextView ScoreSummaryTextView = (TextView) findViewById(R.id.Summary);
        ScoreSummaryTextView.setText(Summary);
        if (ScoreCount < 3) {
            Toast.makeText(MainActivity.this, "You failed the quiz.\n" + "Your Score is: " + ScoreCount, Toast.LENGTH_SHORT).show();}
            if (ScoreCount > 3) {
                Toast.makeText(MainActivity.this, "You passed the quiz.\n" + "Your Score is: " + ScoreCount, Toast.LENGTH_SHORT).show();
            }
        }


    }




