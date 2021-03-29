package com.example.onlinelearning;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class Animation extends AppCompatActivity {

    ImageView logo, appName, splashImg;
    LottieAnimationView lottieAnimationView;

    Button animation;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation);

//
//        logo.findViewById(R.id.logo);
//        appName.findViewById(R.id.app_name);
//        splashImg.findViewById(R.id.img);
//        lottieAnimationView.findViewById(R.id.lottie);
//
//
//        splashImg.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
//        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
//        appName.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
//        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);

        animation = (Button)findViewById(R.id.animation);

        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.view.animation.Animation animations = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.mixed_anim);

                animation.startAnimation(animations);
            }
        });




    }


}
