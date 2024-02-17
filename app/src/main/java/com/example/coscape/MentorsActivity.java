package com.example.coscape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MentorsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MentorsAdapter mentorsAdapter;
    private List<Mentor> mentorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentors);

        recyclerView = findViewById(R.id.mentorsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mentorList = new ArrayList<>();
        // Add mentors to the list (replace with your actual mentor data)
        mentorList.add(new Mentor("John Smith", "Marketing", "john@example.com"));
        mentorList.add(new Mentor("Jane Doe", "Finance", "jane@example.com"));
        mentorList.add(new Mentor("David Johnson", "Technology", "david@example.com"));

        mentorsAdapter = new MentorsAdapter(mentorList);
        recyclerView.setAdapter(mentorsAdapter);
    }
}