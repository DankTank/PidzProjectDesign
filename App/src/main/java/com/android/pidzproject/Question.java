package com.android.pidzproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Question extends AppCompatActivity implements View.OnClickListener {

    TextView quesCounter, quesDesc;
    int counter = 1;
    LinearLayout green, yellow, red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        quesCounter = findViewById(R.id.ques_counter);
        quesDesc = findViewById(R.id.ques_desc);
        green = findViewById(R.id.layout_green);
        yellow = findViewById(R.id.layout_yellow);
        red = findViewById(R.id.layout_red);

        green.setOnClickListener(this);
        yellow.setOnClickListener(this);
        red.setOnClickListener(this);
    }

    public void funcGoBack(View view) {
        finish();
    }


    public void funcQuesContinue(View view) {
        switch (counter) {
            case 1: {
                quesCounter.setText("QUESTION 2/5");
                quesDesc.setText(getString(R.string.ques_2));
                counter = counter + 1;
                resetEmojiSelection();
            }
            break;

            case 2: {
                quesCounter.setText("QUESTION 3/5");
                quesDesc.setText(getString(R.string.ques_3));
                counter = counter + 1;
                resetEmojiSelection();
            }
            break;

            case 3: {
                quesCounter.setText("QUESTION 4/5");
                quesDesc.setText(getString(R.string.ques_4));
                counter = counter + 1;
                resetEmojiSelection();
            }
            break;

            case 4: {
                quesCounter.setText("QUESTION 5/5");
                quesDesc.setText(getString(R.string.ques_5));
                counter = counter + 1;
                resetEmojiSelection();
            }
            break;

            case 5:
                startActivity(new Intent(this, CommentReview.class));
                break;

            default:
                break;
        }
    }

    private void resetEmojiSelection() {
        green.setBackground(null);
        yellow.setBackground(null);
        red.setBackground(null);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout_green: {
                green.setBackgroundColor(getResources().getColor(R.color.colorSkyBlue));
                yellow.setBackground(null);
                red.setBackground(null);
            }
            break;

            case R.id.layout_yellow: {
                green.setBackground(null);
                yellow.setBackgroundColor(getResources().getColor(R.color.colorSkyBlue));
                red.setBackground(null);
            }
            break;

            case R.id.layout_red: {
                green.setBackground(null);
                yellow.setBackground(null);
                red.setBackgroundColor(getResources().getColor(R.color.colorSkyBlue));
            }
            break;

        }
    }
}