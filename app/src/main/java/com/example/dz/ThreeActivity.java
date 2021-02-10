package com.example.dz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        ImageView img_friend = (ImageView) findViewById(R.id.imageView10);
        img_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThreeActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        ImageView img_exit = (ImageView) findViewById(R.id.imageView4);
        img_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThreeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}