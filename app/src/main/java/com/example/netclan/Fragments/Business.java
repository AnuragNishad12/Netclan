package com.example.netclan.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.netclan.R;
import com.example.netclan.databinding.FragmentBusinessBinding;


public class Business extends Fragment {


    public Business() {

    }
   FragmentBusinessBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentBusinessBinding.inflate(inflater,container,false);


        return binding.getRoot();
    }
}