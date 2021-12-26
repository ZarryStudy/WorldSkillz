package com.example.worldskillz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Photo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
    }
    public  void  onClick(View view){
        switch (view.getId()){
            case R.id.BackTV:
                Intent prof = new Intent(this, Profile.class);
                startActivity(prof);
                break;
        }

    }
}