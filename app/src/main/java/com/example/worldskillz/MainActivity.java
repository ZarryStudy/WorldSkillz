package com.example.worldskillz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void  onClick(View view ){
        switch (view.getId()){
            case R.id.btnReg:
                Intent reg = new Intent(this, Register.class);
                startActivity(reg);
                break;
            case R.id.btnEnter:
                Intent login = new Intent(this, Login.class);
                startActivity(login);
                break;
        }

    }
}