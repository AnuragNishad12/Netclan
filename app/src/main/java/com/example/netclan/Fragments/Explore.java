package com.example.netclan.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.netclan.R;
import com.example.netclan.databinding.FragmentExploreBinding;


public class Explore extends Fragment {


    public Explore() {

    }
    FragmentExploreBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        binding = FragmentExploreBinding.inflate(inflater,container,false);

        binding.viewPager.setAdapter(new Explore_Adapter(getChildFragmentManager()));
        binding.tabLayout.setupWithViewPager(binding.viewPager);


        return binding.getRoot();
    }
}