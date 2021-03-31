package com.example.onlinelearning;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.onlinelearning.fragments.MyGroupFragment;
import com.example.onlinelearning.fragments.MyHobbyFragment;
import com.example.onlinelearning.fragments.MyPhotoFragment;
import com.google.android.material.tabs.TabLayout;


public class fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment);
        SectionPagerAdapter pageradapter = new SectionPagerAdapter(getSupportFragmentManager());

        ViewPager page = (ViewPager) findViewById(R.id.viewpage1);
        page.setAdapter(pageradapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab);
        tabLayout.setupWithViewPager(page);


    }


    public class SectionPagerAdapter extends FragmentPagerAdapter {
        public SectionPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new MyGroupFragment();
                case 1:
                    return new MyHobbyFragment();
                case 2:
                    return new MyPhotoFragment();
            }
            return null;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getResources().getText(R.string.mygroups);
                case 1:
                    return getResources().getText(R.string.myhobby);
                case 2:
                    return getResources().getText(R.string.myphoto);
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


}

