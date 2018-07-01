package com.example.t.medikapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int scorePointer = 0;
    int grading1 = 25;
    int grading2 = 25;
    int checkbox1 = 12;
    int checkbox2 = 13;
    int ans1 = 25;
    String answer1 = "mammalia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox ko = findViewById(R.id.ko);
        ko.setOnClickListener(this);

        CheckBox sh = findViewById(R.id.sh);
        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorePointer = scorePointer + checkbox1;
            }
        });

        CheckBox op = findViewById(R.id.op);
        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorePointer = scorePointer + 0;
            }
        });
    }

    /**
     * Question 2 radio button selection
     */
    public void zooFa(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.arist:
                if (checked) {
                    scorePointer = scorePointer + grading1;
                }
                // correct answer is Aristotle

                else

                break;
            case R.id.darwin:
                if (checked){}
                    // wrong answer is Darwin
                    else
                    break;
        }
    }

    /**
     * Question 3 radio button selection
     */

    public void zooFa2(View view) {
        // Is the button now checked?
        boolean checked2 = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.mh:
                if (checked2) {
                    scorePointer = scorePointer + grading2;
                }
                // correct answer is myogenic
                break;
            case R.id.nh:
                if (checked2)
                    // wrong answer is neuro heart
                    break;

            case R.id.ph:
                if (checked2)
                    // wrong answer is pulsating heart

                    break;

            case R.id.ah:
                if (checked2)
                    // wrong answer is ampullary heart
                    break;
        }
        /**
         * Question 1 text input answer
         */

        EditText question1 = (EditText) findViewById(R.id.q1);
        String CorrectQ1 = question1.getText().toString();
        if ((CorrectQ1.equalsIgnoreCase(answer1))) {
            // add 25% to score
            scorePointer = scorePointer + ans1;
        }
    }


    public void submit(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Congratulations you have " + scorePointer + "%";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ko) {
            scorePointer = scorePointer + checkbox2;
        } else {
        }

    }
}