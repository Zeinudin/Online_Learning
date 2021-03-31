package com.example.onlinelearning.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.onlinelearning.R;


public class MyGroupFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_my_group, container, false);

        ImageView imageview = (ImageView) view.findViewById(R.id.fotka);
        Drawable drawable = ContextCompat.getDrawable(view.getContext(), R.drawable.gggggg);
        imageview.setImageDrawable(drawable);

        return view;
    }


}