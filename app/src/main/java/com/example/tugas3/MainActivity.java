package com.example.tugas3;

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

   public void spiderman(View view){
       Intent a = new Intent(MainActivity.this,SpiderMan.class);
       startActivity(a);
    }
    public void strange(View view){
        Intent a = new Intent(MainActivity.this,MainActivity.class);
        startActivity(a);
    }
    public void guardian(View view){
        Intent a = new Intent(MainActivity.this,Guardian.class);
        startActivity(a);
    }
    public void avanger(View view){
        Intent a = new Intent(MainActivity.this,Avanger.class);
        startActivity(a);
    }
}