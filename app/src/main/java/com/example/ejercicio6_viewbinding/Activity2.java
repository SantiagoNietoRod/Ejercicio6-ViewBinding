package com.example.ejercicio6_viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.ejercicio6_viewbinding.databinding.Activity2Binding;


public class Activity2 extends AppCompatActivity {

    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        binding = Activity2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.botonActivar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (binding.fragmentContainerView.getVisibility() == View.VISIBLE){
                    binding.fragmentContainerView.setVisibility(View.INVISIBLE);
                    binding.botonActivar.setText("ACTIVAR");
                }else{
                    binding.fragmentContainerView.setVisibility(View.VISIBLE);
                    binding.botonActivar.setText("DESACTIVAR");
                }
            }
        });
    }
}