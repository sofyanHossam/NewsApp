package com.example.newsapp;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class E_F_Adapter extends FragmentStateAdapter {
    public E_F_Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new UsaNews();
            default:
                return new EgNews();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
