package com.example.netclan.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.netclan.R;
import com.example.netclan.databinding.FragmentMerchant2Binding;


public class Merchant extends Fragment {



    public Merchant() {

    }

   FragmentMerchant2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMerchant2Binding.inflate(inflater,container,false);



        return binding.getRoot();
    }
}