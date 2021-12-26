package com.example.worldskillz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

@SuppressWarnings("ALL")
public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public  void  onClick(View view ){
        switch (view.getId()){
            case R.id.RegistrBtn:
                Intent reg = new Intent(this, Register.class);
                startActivity(reg);
                break;
            case R.id.SingInBtn:
                Intent login = new Intent(this, MainScreen.class);
                startActivity(login);
                break;
            case R.id.ProfileBtn:
                Intent profile = new Intent(this, MainScreen.class);
                startActivity(profile);
                break;
        }

    }
}