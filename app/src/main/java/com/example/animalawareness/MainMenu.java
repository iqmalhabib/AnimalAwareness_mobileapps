package com.example.animalawareness;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {
    Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(view -> {
            // Start a new activity or perform any desired action for Button 1
            Intent intent = new Intent(MainMenu.this, AnimalSoundActivity.class);
            startActivity(intent);
        });

        button2.setOnClickListener(view -> {
            // Start a new activity or perform any desired action for Button 2
            Intent intent = new Intent(MainMenu.this, AnimalInfoActivity.class);
            Toast.makeText(MainMenu.this,"clicked",Toast.LENGTH_LONG).show();
            startActivity(intent);
        });

        button3.setOnClickListener(view -> {
            // Start a new activity or perform any desired action for Button 3
            Intent intent = new Intent(MainMenu.this, QuizzesActivity.class);
            startActivity(intent);
        });
    }
}

