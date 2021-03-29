package com.example.onlinelearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class More extends AppCompatActivity {

    Button button21;
    Button button22;
    Button button23;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more);

        button21 = (Button)findViewById(R.id.button33);
        button22 = (Button)findViewById(R.id.button34);
        button23 = (Button)findViewById(R.id.button35);

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSave_Data();
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMusic();
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAnimation();
            }
        });

    }

    private void openMusic() {
        Intent intent = new Intent(getApplicationContext(), Music.class);
        startActivity(intent);

    }

    private void openSave_Data() {
        Intent intent = new Intent(getApplicationContext(), Save_Data.class);
        startActivity(intent);
    }

    private void openAnimation() {
        Intent intent = new Intent(getApplicationContext(), Animation.class);
        startActivity(intent);
    }
}
