package com.example.netclan;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.netclan.databinding.ActivityRefineBinding;

public class Refine_Activity extends AppCompatActivity {


    ActivityRefineBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRefineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        changeStatusBarColor(getResources().getColor(R.color.un));


        binding.seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                binding.progressTextView.setText(String.valueOf(progress) + " Km");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        binding.backrefined.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Refine_Activity.this,MainActivity.class);
                startActivity(intent);

            }
        });

        setupClickListener(binding.cofee, R.drawable.background, R.drawable.background_two, "#0E1529");
        setupClickListener(binding.business, R.drawable.background, R.drawable.background_two, "#0E1529");
        setupClickListener(binding.hobbies, R.drawable.background, R.drawable.background_two, "#0E1529");
        setupClickListener(binding.friendship, R.drawable.background, R.drawable.background_two, "#0E1529");
        setupClickListener(binding.movies, R.drawable.background, R.drawable.background_two, "#0E1529");
        setupClickListener(binding.dinning, R.drawable.background, R.drawable.background_two, "#0E1529");
        setupClickListener(binding.dating, R.drawable.background, R.drawable.background_two, "#0E1529");
        setupClickListener(binding.matrimony, R.drawable.background, R.drawable.background_two, "#0E1529");

    binding.saveExplore.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Refine_Activity.this, MainActivity.class);
            startActivity(intent);
        }
    });

    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void changeStatusBarColor(int color) {
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(color);
    }
    private void setupClickListener(final TextView textView, final int normalBackground, final int clickedBackground, final String textColor) {
        final boolean[] isClicked = {false};
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClicked[0] = !isClicked[0];
                if (isClicked[0]) {
                    textView.setBackgroundResource(clickedBackground);
                    textView.setTextColor(Color.parseColor("#FFFFFF"));
                } else {
                    textView.setBackgroundResource(normalBackground);
                    textView.setTextColor(Color.parseColor(textColor));
                }
            }
        });
    }
}