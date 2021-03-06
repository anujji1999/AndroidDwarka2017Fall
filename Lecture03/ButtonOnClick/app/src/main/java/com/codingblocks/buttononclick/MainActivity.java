package com.codingblocks.buttononclick;

import android.Manifest;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);

        
        Button button = findViewById(R.id.idBtn);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Button was pressed",Toast.LENGTH_SHORT).show();
    }
}
