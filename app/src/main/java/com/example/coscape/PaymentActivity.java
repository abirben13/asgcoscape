package com.example.coscape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {

    private EditText cardNumberEditText;
    private EditText cvvEditText;
    private EditText expiryDateEditText;
    private EditText nameEditText;
    private Button payButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        cardNumberEditText = findViewById(R.id.cardNumberEditText);
        cvvEditText = findViewById(R.id.cvvEditText);
        expiryDateEditText = findViewById(R.id.expiryDateEditText);
        nameEditText = findViewById(R.id.nameEditText);
        payButton = findViewById(R.id.payButton);

        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle payment button click
                // Process the payment
            }
        });
    }
}