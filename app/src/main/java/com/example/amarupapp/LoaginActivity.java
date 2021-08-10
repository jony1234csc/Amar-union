package com.example.amarupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoaginActivity extends AppCompatActivity {
    private LinearLayout singuplayout;
    private TextView btnTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loagin);

        singuplayout = findViewById(R.id.singuplayout);
        btnTV = findViewById(R.id.btnTV);


        singuplayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoaginActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

        btnTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoaginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        statusBarColorChange();
    }
    private void statusBarColorChange() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.dashboard_statusbar));
        }
    }

}