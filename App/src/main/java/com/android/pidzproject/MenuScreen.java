package com.android.pidzproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
    }

    public void funcGoBack(View view) {
        finish();
    }

    public void funcWriteNewReview(View view) {
        startActivity(new Intent(this, NewReview.class));
    }
}