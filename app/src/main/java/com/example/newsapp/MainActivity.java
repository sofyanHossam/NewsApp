package com.example.newsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
ViewPager2 viewPager2;
TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2=(ViewPager2)findViewById(R.id.viewpager);
        viewPager2.setAdapter(new E_F_Adapter(this));

        tabLayout=(TabLayout)findViewById(R.id.tab);
        TabLayoutMediator tabLayoutMediator= new TabLayoutMediator(
                tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {

            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position)
                {
                    case 0: {

                        tab.setText("USA");
                        tab.setIcon(R.drawable.a);
                        break;
                    }
                    case 1: {
                        tab.setText("EGY");
                        tab.setIcon(R.drawable.e);
                        break;
                    }
                }

            }
        }
        );
        tabLayoutMediator.attach();

    }
}