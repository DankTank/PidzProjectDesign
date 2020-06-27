package com.android.pidzproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    public void funcCreateAccount(View view) {
        startActivity(new Intent(this, RegisterScreen.class));
    }


    public void funcSignIn(View view) {
        startActivity(new Intent(this, MenuScreen.class));
    }
}