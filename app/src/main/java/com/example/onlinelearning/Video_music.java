package com.example.onlinelearning;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Video_music extends AppCompatActivity {


//    VideoView video;
//    String video_url="https://www.youtube.com/watch?v=Bx8Fo7WRpXg";
//    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_layout_music);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);



//        String videoPath = "android.resource://" + getPackageName() + "/" R.drawable );

//        video = (VideoView)findViewById(R.id.videoView);
//        pd = new ProgressDialog(Video_music.this);
//        pd.setMessage("Wait please");
//        pd.show();
//        Uri uri = Uri.parse(video_url);
//        video.setVideoURI(uri);
//        video.start();
//        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mediaPlayer) {
//                pd.dismiss();
//            }
//        });
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(
//                WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        setContentView(R.layout.video_layout_music);
//
//        Intent i=getIntent();
//
//        String url=i.getStringExtra("https://www.youtube.com/watch?v=Bx8Fo7WRpXg");
//
//        VideoView video = findViewById(R.id.videoView);
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(video);
//        video.setMediaController(mediaController);
//        video.setVideoPath(url);
//        video.start();


    }
}

