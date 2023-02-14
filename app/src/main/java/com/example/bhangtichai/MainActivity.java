package com.example.bhangtichai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.bhangtichai.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    String cur="";
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur=binding.takainp.getText().toString();
                cur+="1";
                binding.takainp.setText(cur);
                calc();
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur=binding.takainp.getText().toString();
                cur+="2";
                binding.takainp.setText(cur);
                calc();
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur=binding.takainp.getText().toString();
                cur+="3";
                binding.takainp.setText(cur);
                calc();
            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur=binding.takainp.getText().toString();
                cur+="4";
                binding.takainp.setText(cur);
                calc();
            }
        });
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur=binding.takainp.getText().toString();
                cur+="5";
                binding.takainp.setText(cur);
                calc();
            }
        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur=binding.takainp.getText().toString();
                cur+="6";
                binding.takainp.setText(cur);
                calc();
            }
        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur=binding.takainp.getText().toString();
                cur+="7";
                binding.takainp.setText(cur);
                calc();
            }
        });
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur=binding.takainp.getText().toString();
                cur+="8";
                binding.takainp.setText(cur);
                calc();
            }
        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur=binding.takainp.getText().toString();
                cur+="9";
                binding.takainp.setText(cur);
                calc();
            }
        });

    }
    public void calc(){
        int n =Integer.parseInt(binding.takainp.getText().toString());
        binding.textView10.setText(""+(n/500));
        n%=500;
        binding.textView11.setText(""+(n/100));
        n%=100;
        binding.textView12.setText(""+(n/50));
        n%=50;
        binding.textView18.setText(""+(n/20));
        n%=20;
        binding.textView13.setText(""+(n/10));
        n%=10;
        binding.textView17.setText(""+(n/5));
        n%=5;
        binding.textView16.setText(""+(n/2));
        n%=2;
        binding.textView14.setText(""+(n/1));
        n%=1;
    }

}