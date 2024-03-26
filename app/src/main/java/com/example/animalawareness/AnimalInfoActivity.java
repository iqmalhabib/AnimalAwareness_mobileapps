package com.example.animalawareness;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class AnimalInfoActivity extends AppCompatActivity {

    private ImageSwitcher imageSwitcher;
    private Button previousButton;
    private final int[] imageIds = {R.drawable.lioninfo, R.drawable.doginfo, R.drawable.snakeinfo};
    private int currentPosition = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animalinfo);

        ImageButton homeButton = findViewById(R.id.image_btn);
        imageSwitcher = findViewById(R.id.image_switcher);
        previousButton = findViewById(R.id.button_previous);
        Button nextButton = findViewById(R.id.button_next);

        // Set initial image
        imageSwitcher.setImageResource(imageIds[currentPosition]);

        // Set up ImageSwitcher animations
        imageSwitcher.setInAnimation(this, android.R.anim.slide_in_left);
        imageSwitcher.setOutAnimation(this, android.R.anim.slide_out_right);

        previousButton.setOnClickListener(v -> {
            if (currentPosition > 0) {
                currentPosition--;
                imageSwitcher.setImageResource(imageIds[currentPosition]);
            }
        });
        // Set click listener for the home button
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(AnimalInfoActivity.this, MainMenu.class);
            startActivity(intent);
            finish();
        });

        nextButton.setOnClickListener(v -> {
            if (currentPosition < imageIds.length - 1) {
                currentPosition++;
                imageSwitcher.setImageResource(imageIds[currentPosition]);
            }
        });
    }
}

