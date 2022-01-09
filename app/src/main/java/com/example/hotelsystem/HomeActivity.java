package com.example.hotelsystem;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void backOnClick(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void BookNow(View view) {
    }
}