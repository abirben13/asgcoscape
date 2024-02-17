package com.example.coscape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StartupDescriptionActivity extends AppCompatActivity {

    private TextView backButton;
    private ImageView profileIcon;
    private ImageView notificationsIcon;
    private ImageView startupImage;
    private TextView startupNameTextView;
    private TextView aboutTextView;
    private TextView contactsTextView;
    private TextView messageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup_description);

        backButton = findViewById(R.id.backButton);
        profileIcon = findViewById(R.id.profileIcon);
        notificationsIcon = findViewById(R.id.notificationsIcon);
        startupImage = findViewById(R.id.startupImage);
        startupNameTextView = findViewById(R.id.startupNameTextView);
        aboutTextView = findViewById(R.id.aboutTextView);
        contactsTextView = findViewById(R.id.contactsTextView);
        messageButton = findViewById(R.id.messageButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        profileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle profile icon click
            }
        });

        notificationsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle notifications icon click
            }
        });

        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle message button click
                Intent intent = new Intent(StartupDescriptionActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });

        // Set the startup's data based on the selected startup
        // Replace with your implementation to retrieve and display the startup's data
        Startup selectedStartup = getSelectedStartup();
        if (selectedStartup != null) {
            startupImage.setImageResource(selectedStartup.getImageResource());
            startupNameTextView.setText(selectedStartup.getName());
            aboutTextView.setText(selectedStartup.getAbout());
            contactsTextView.setText(selectedStartup.getContacts());
        }
    }

    private Startup getSelectedStartup() {
        // Replace with your implementation to get the selected startup from the previous page
        // Return the selected startup object
        return null;
    }
}