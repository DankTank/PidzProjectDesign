package com.android.pidzproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FaceScan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_scan);
    }

    public void funcGoBack(View view) {
        finish();
    }

    public void funcGotoQues(View view) {
        startActivity(new Intent(this, Question.class));
    }
}