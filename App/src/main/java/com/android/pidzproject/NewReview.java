package com.android.pidzproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class NewReview extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_review);

        editText=findViewById(R.id.ed_newRev);
    }

    public void funcGoBack(View view) {
        finish();
    }


    public void funcFaceScan(View view) {
        startActivity(new Intent(this, FaceScan.class));
    }

    public void funcNewRev(View view) {
        editText.requestFocus();

        InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInputFromWindow(editText.getApplicationWindowToken(),
                InputMethodManager.SHOW_FORCED, 0);
    }
}