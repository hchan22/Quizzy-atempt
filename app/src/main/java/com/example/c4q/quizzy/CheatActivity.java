package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends QuizActivity {
    private static final int STATUS_CHEATD = 222;

    private Question currentQuestion;
    private Question[] copyofQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = (Button)findViewById(R.id.cheat_button);
        button.setVisibility(View.GONE);
        TextView questionTV = (TextView) findViewById(R.id.question_text_view);
        //implementing intent to return extras
        Intent intent;
        intent = getIntent();
        String myQuestion = intent.getExtras().getString("CURRENT QUESTION");
        boolean myAnswer = intent.getExtras().getBoolean("CURRENT ANSWER");
        int myIndex = intent.getExtras().getInt("CURRENT INDEX");
        currentQuestion = copyofQuestions[myIndex];
//        questionTV.setText(myQuestion + " : " + myAnswer);
        questionTV.setText(""+ currentQuestion.isAnswerTrue());
        questionTV.append("" + myAnswer);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
