package com.example.hotelsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class FindLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_location);
    }


    public void gps_onClick(View view) {

    }

  //  @Override
   // public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    //
   // }

    private void updateGPS() {

    }

    private void updateUI(Location location) {

    }

    public void sw_updates_onclick(View view) {

    }

    private void startLocationUpdates() {


    }

    private void stopLocationUpdates(){

    }

    public void back(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void random_Meal(View view) {
        //Intent intent=new Intent(this,MainActivity4.class);
       // startActivity(intent);
    }
}