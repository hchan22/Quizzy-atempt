package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

/**
 * Created by helenchan on 9/28/16.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button start;
    EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.submit_btn);
        editText = (EditText) findViewById(R.id.name_edit_text);
        start.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Log.d("MainActivity", "on click was hit");
        Intent intent = new Intent(MainActivity.this, QuizActivity.class);
        String name = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, name);
        startActivity(intent);
    }
}
