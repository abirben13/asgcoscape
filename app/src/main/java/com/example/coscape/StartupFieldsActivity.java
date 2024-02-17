package com.example.coscape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StartupFieldsActivity extends AppCompatActivity {

    private TextView moreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup_fields);

        moreTextView = findViewById(R.id.moreTextView);

        moreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartupFieldsActivity.this, AllFieldsActivity.class);
                startActivity(intent);
            }
        });
