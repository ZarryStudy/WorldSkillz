package com.example.worldskillz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    @SuppressLint("NonConstantResourceId")
    public  void  onClick(View view){
        switch (view.getId()){
            case R.id.img1:
                Intent img = new Intent(this, Photo.class);
                startActivity(img);
                break;
            case R.id.img2:
                Intent img2 = new Intent(this, Photo.class);
                startActivity(img2);
                break;
            case R.id.img3:
                Intent img3 = new Intent(this, Photo.class);
                startActivity(img3);
                break;
            case R.id.img4:
                Intent img4 = new Intent(this, Photo.class);
                startActivity(img4);
                break;
            case R.id.imgMus:
                Intent list = new Intent(this, Listen.class);
                startActivity(list);
                break;
            case R.id.MainTV:
                Intent main = new Intent(this, MainScreen.class);
                startActivity(main);
                break;
            case R.id.ExitTv:
                Intent prof = new Intent(this, Profile.class);
                startActivity(prof);
                break;

        }

    }
}