package com.example.animalawareness;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import com.example.animalawareness.MainMenu; // Replace with your actual package name and MainMenu class
import androidx.appcompat.app.AppCompatActivity;

public class AnimalSoundActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animalsound);

        ImageButton homeButton = findViewById(R.id.image_btn);
        ImageButton imageButton1 = findViewById(R.id.image_btn1);
        ImageButton imageButton2 = findViewById(R.id.image_btn2);
        ImageButton imageButton3 = findViewById(R.id.image_btn3);
        ImageButton imageButton4 = findViewById(R.id.image_btn4);
        ImageButton imageButton5 = findViewById(R.id.image_btn5);
        ImageButton imageButton6 = findViewById(R.id.image_btn6);

        // Set click listener for the home button
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(AnimalSoundActivity.this, MainMenu.class);
            startActivity(intent);
            finish();
        });


        // Set click listener for the image buttons
        imageButton1.setOnClickListener(v -> {
            if (mediaPlayer != null) {
                mediaPlayer.release(); // Release any previously playing sound
            }
            mediaPlayer = MediaPlayer.create(AnimalSoundActivity.this, R.raw.lionsound);
            mediaPlayer.start();
        });

        imageButton2.setOnClickListener(v -> {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            mediaPlayer = MediaPlayer.create(AnimalSoundActivity.this, R.raw.dogsound);
            mediaPlayer.start();
        });

        imageButton3.setOnClickListener(v -> {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            mediaPlayer = MediaPlayer.create(AnimalSoundActivity.this, R.raw.elephantsound);
            mediaPlayer.start();
        });

        imageButton4.setOnClickListener(v -> {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            mediaPlayer = MediaPlayer.create(AnimalSoundActivity.this, R.raw.cobrasound);
            mediaPlayer.start();
        });

        imageButton5.setOnClickListener(v -> {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            mediaPlayer = MediaPlayer.create(AnimalSoundActivity.this, R.raw.birdsound);
            mediaPlayer.start();
        });
        imageButton6.setOnClickListener(v -> {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            mediaPlayer = MediaPlayer.create(AnimalSoundActivity.this, R.raw.catsound);
            mediaPlayer.start();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release the MediaPlayer resources if needed
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}

