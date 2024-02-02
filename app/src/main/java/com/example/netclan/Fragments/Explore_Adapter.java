package com.example.netclan.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class Explore_Adapter extends FragmentPagerAdapter {
    public Explore_Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Personal();
            case 1:
                return new Business();
            case 2:
                return new Merchant();
            default:
                return new Personal();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position==0){
            title = "Personal";
        }
        if (position==1){
            title = "Business";
        }
        if (position==2){
            title = "Merchant";
        }
        return title;
    }

}
