package com.example.coscape;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        usernameEditText = findViewById(R.id.usernameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        signUpButton = findViewById(R.id.signUpButton);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Perform sign up logic or API request with username, email, and password
                // Replace the code below with your sign up logic
                if (isValidInput(username, email, password)) {
                    // Sign up successful
                    // You can perform actions like storing user data, sending verification email, etc.
                    Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Sign up failed
                    // Show an error message or redirect to a failure page
                }
            }
        });
    }

    private boolean isValidInput(String username, String email, String password) {
        // Add your validation logic here
        // You can check if the input meets your requirements (e.g., minimum length, valid email format, etc.)
        // Return true if the input is valid, otherwise return false
        return true;
    }
}