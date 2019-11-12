package com.example.breedsearcherhomework3.Activity;



import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.breedsearcherhomework3.Fragments.BreedSearchFragment;
import com.example.breedsearcherhomework3.Fragments.FavouriteBreedFragment;
import com.example.breedsearcherhomework3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Fragment searchFragment = new BreedSearchFragment();
        final Fragment favFragment = new FavouriteBreedFragment();
        swapFragment(searchFragment);

        Button searchButton = findViewById(R.id.searchButton);
        Button favButton = findViewById(R.id.favBreed);

        searchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                swapFragment(searchFragment);
            }
        });

        favButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                swapFragment(favFragment);
            }
        });


    }

    private void swapFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_slot, fragment);
        fragmentTransaction.commit();
    }
}
