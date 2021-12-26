package com.example.worldskillz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
    public  void  onClick(View view){
        switch (view.getId()){
            case R.id.ProfileImg:
                Intent profile = new Intent(this, Profile.class);
                startActivity(profile);
                break;
            case R.id.imgPers:
                Intent prof = new Intent(this, Profile.class);
                startActivity(prof);
                break;
            case R.id.imgMus:
                Intent mus = new Intent(this, Listen.class);
                startActivity(mus);
                break;
            case R.id.MenuImg:
                Intent menu = new Intent(this, Menu.class);
                startActivity(menu);
                break;

        }

    }
}