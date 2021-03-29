package com.example.onlinelearning;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Music extends AppCompatActivity {

    private Button music;
    MediaPlayer player;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
//
//        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.id.play);
////        music = (Button)findViewById(R.id.button34);
//
//        music.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openMusic();
//            }
//        });
    }

//    private void openMusic() {
//        Intent intent = new Intent(getApplicationContext(), Music.class);
//        startActivity(intent);
//    }

    public void play(View v) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.oylorumda);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }
    public void pause(View v){
        if (player != null) {
            player.pause();
        }
    }
    public void stop(View v){
        stopPlayer();
    }

//    public void stopPlayer(View v){
//        if (player != null) {
//            player.release();
//            player = null;
//            Toast.makeText(this, "MediaPlayer released", Toast.LENGTH_SHORT);
//        }
//    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
            Toast.makeText(this, "MediaPlayer released", Toast.LENGTH_SHORT);
        }
    }
}
