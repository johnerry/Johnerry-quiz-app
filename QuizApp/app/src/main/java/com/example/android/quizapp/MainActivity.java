package com.example.android.quizapp;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainActivity extends AppCompatActivity {


//    Declaring all the member variables to be used in this activity only

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mResetTextView;
    private TextView mQuestionNumberView;
    private ImageView mQuestionImageView;
    private Button mButtonChoice1;
    private Button mResetTextButton;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private String mAnswer;

    private int mScore = 0;
    private int mQuestionCount = 0;
    private int mQuestionImageNumber = 0;
    private int mDefaultNumber = 0;
    private int endTest = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Creating an array of number then passing it as a list to be shuffled then back to an object array

        Integer[] arr = new Integer[29];
        for(int i=0;i<arr.length;i++){
            arr[i] = i;
        }
        List myList = Arrays.asList(arr);
        Collections.shuffle(myList);
        final Object[] get = myList.toArray();

        mResetTextButton = findViewById(R.id.reset_button);
        mResetTextView = findViewById(R.id.rest_text);
        mResetTextView.setVisibility(View.INVISIBLE);
        mResetTextButton.setVisibility(View.INVISIBLE);
        mScoreView = findViewById(R.id.score_text);
        mQuestionNumberView = findViewById(R.id.question_number);
        mQuestionImageView = findViewById(R.id.question_image);
        mButtonChoice1 = findViewById(R.id.choice1);
        mButtonChoice2 = findViewById(R.id.choice2);
        mButtonChoice3 = findViewById(R.id.choice3);
        mButtonChoice3.setBackgroundColor(Color.LTGRAY);
        mButtonChoice2.setBackgroundColor(Color.LTGRAY);
        mButtonChoice1.setBackgroundColor(Color.LTGRAY);

//        Lunching the update method at the start of the window
        updateQuestion(get);

//        Start of choice1 button listener
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                This method stop accidental or continous clicks
                disableOtherClick(false);

             if(mQuestionCount < 10){
                 if (mButtonChoice1.getText() == mAnswer) {
                     mScore += 1;
                     mButtonChoice1.setBackgroundColor(Color.GREEN);
                     updateScore(mScore);
                     new Handler().postDelayed(new Runnable() {
                         @Override
                         public void run() {
                             resetButtonColor();
                             disableOtherClick(true);
                             updateQuestion(get);
                         }
                     }, 500L);
                 } else if (mButtonChoice2.getText() == mAnswer) {
                     mButtonChoice1.setBackgroundColor(Color.RED);
                     mButtonChoice2.setBackgroundColor(Color.GREEN);
                     new Handler().postDelayed(new Runnable() {
                         @Override
                         public void run() {
                             resetButtonColor();
                             disableOtherClick(true);
                             updateQuestion(get);
                         }
                     }, 500L);
                 } else {
                     mButtonChoice1.setBackgroundColor(Color.RED);
                     mButtonChoice3.setBackgroundColor(Color.GREEN);
                     new Handler().postDelayed(new Runnable() {
                         @Override
                         public void run() {
                             resetButtonColor();
                             disableOtherClick(true);
                             updateQuestion(get);
                         }
                     }, 500L);
                 }
             }else {
                 mResetTextView.setVisibility(View.VISIBLE);
                 mResetTextButton.setVisibility(View.VISIBLE);
             }

            }
        });

        //        End of choice1 button Listener

        //        Start of choice2 button listener
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disableOtherClick(false);

            if(mQuestionCount < 10 ){

                if (mButtonChoice2.getText() == mAnswer) {
                    mScore += 1;
                    mButtonChoice2.setBackgroundColor(Color.GREEN);
                    updateScore(mScore);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            resetButtonColor();
                            disableOtherClick(true);
                            updateQuestion(get);
                        }
                    }, 500L);
                } else if (mButtonChoice1.getText() == mAnswer) {
                    mButtonChoice2.setBackgroundColor(Color.RED);
                    mButtonChoice1.setBackgroundColor(Color.GREEN);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            resetButtonColor();
                            disableOtherClick(true);
                            updateQuestion(get);
                        }
                    }, 500L);
                } else {
                    mButtonChoice2.setBackgroundColor(Color.RED);
                    mButtonChoice3.setBackgroundColor(Color.GREEN);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            resetButtonColor();
                            disableOtherClick(true);
                            updateQuestion(get);
                        }
                    }, 500L);
                }
            }else {
                mResetTextView.setVisibility(View.VISIBLE);
                mResetTextButton.setVisibility(View.VISIBLE);
            }

            }
        });

        //        End of choice2 button Listener

        //        Start of choice3 button listener
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disableOtherClick(false);

               if(mQuestionCount < 10 ){
                   if (mButtonChoice3.getText() == mAnswer) {
                       mScore += 1;
                       mButtonChoice3.setBackgroundColor(Color.GREEN);
                       updateScore(mScore);
                       new Handler().postDelayed(new Runnable() {
                           @Override
                           public void run() {
                               resetButtonColor();
                               disableOtherClick(true);
                               updateQuestion(get);
                           }
                       }, 500L);
                   } else if (mButtonChoice2.getText() == mAnswer) {
                       mButtonChoice3.setBackgroundColor(Color.RED);
                       mButtonChoice2.setBackgroundColor(Color.GREEN);
                       new Handler().postDelayed(new Runnable() {
                           @Override
                           public void run() {
                               resetButtonColor();
                               disableOtherClick(true);
                               updateQuestion(get);
                           }
                       }, 500L);
                   } else {
                       mButtonChoice3.setBackgroundColor(Color.RED);
                       mButtonChoice1.setBackgroundColor(Color.GREEN);
                       new Handler().postDelayed(new Runnable() {
                           @Override
                           public void run() {
                               resetButtonColor();
                               disableOtherClick(true);
                               updateQuestion(get);
                           }
                       }, 500L);
                   }
               }else {
                   mResetTextView.setVisibility(View.VISIBLE);
                   mResetTextButton.setVisibility(View.VISIBLE);
               }

            }
        });

        //        End of choice3 button Listener

    }

//this method update the text and image on the screen
    private void updateQuestion(Object get) {
        if(mQuestionCount < 10){
            Object[] like = (Object[]) get;
            mQuestionImageNumber = (int) like[mDefaultNumber];
            String mQuestionImageFileName = mQuestionLibrary.getQuestionImage(mQuestionImageNumber);
            int resourceID = getResources().getIdentifier(mQuestionImageFileName, "drawable", getPackageName());
            String questionText = "Question " + (mQuestionCount + 1) + "/10";
            mQuestionNumberView.setText(questionText);
            mQuestionImageView.setImageResource(resourceID);
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionImageNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionImageNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionImageNumber));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionImageNumber);


            mQuestionCount++;
            mDefaultNumber++;
        }else {

        }
    }

//    this method reset the button color
    private void resetButtonColor(){
        mButtonChoice3.setBackgroundColor(Color.LTGRAY);
        mButtonChoice2.setBackgroundColor(Color.LTGRAY);
        mButtonChoice1.setBackgroundColor(Color.LTGRAY);
    }

//this method disable accidental clicks

    private void disableOtherClick(boolean yesNO){
        mButtonChoice1.setEnabled(yesNO);
        mButtonChoice2.setEnabled(yesNO);
        mButtonChoice3.setEnabled(yesNO);
    }

//    this method update the score Text
    private void updateScore(int mark) {
      if(mQuestionCount < 10){
          String textSet = "Score: " + mScore;
          mScoreView.setText(textSet);
      }else {

      }
    }

//    this method refreshes the main activity
    public void reset(View view){
        finish();
        overridePendingTransition(0,0);
        startActivity(getIntent());
        overridePendingTransition(0,0);
    }

}


