package com.example.netclan;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.netclan.Fragments.Chat;
import com.example.netclan.Fragments.Contacts;
import com.example.netclan.Fragments.Explore;
import com.example.netclan.Fragments.Groups;
import com.example.netclan.Fragments.Network;
import com.example.netclan.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        changeStatusBarColor(getResources().getColor(R.color.un));

        binding.refine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Refine_Activity.class);
                startActivity(intent);
            }
        });

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_Container, new Explore());
        fragmentTransaction.commit();


        binding.bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (item.getItemId() == R.id.home_view) {
                    fragmentTransaction.replace(R.id.fragment_Container, new Explore());
                    Log.d("MainActivity", "Switching to HomeFragment");
                } else if (item.getItemId() == R.id.network) {
                    fragmentTransaction.replace(R.id.fragment_Container, new Network());
                } else if (item.getItemId() == R.id.chat) {
                    fragmentTransaction.replace(R.id.fragment_Container, new Chat());
                } else if (item.getItemId() == R.id.contacts) {
                    fragmentTransaction.replace(R.id.fragment_Container, new Contacts());
                } else if (item.getItemId() == R.id.groups) {
                    fragmentTransaction.replace(R.id.fragment_Container, new Groups());
                }

                fragmentTransaction.commit();
                return true; // Return true to indicate the item has been selected
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
}