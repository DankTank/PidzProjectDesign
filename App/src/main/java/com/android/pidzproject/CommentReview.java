package com.android.pidzproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.pidzproject.R;

public class CommentReview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_review);
    }


    public void funcGoBack(View view) {
        finish();
    }

    public void funcCompReview(View view) {
        startActivity(new Intent(this,FinishReview.class));
    }
}