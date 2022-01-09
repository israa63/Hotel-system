package com.example.hotelsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Roomlist(View view)
    {
         Intent intent = new Intent(this,HomeActivity.class);
         startActivity(intent);
    }
    public void exitOnClick(View view)
    {
        finish();
    }

    public void location(View view) {
        Intent intent = new Intent(this,FindLocation.class);
        startActivity(intent);
    }

}