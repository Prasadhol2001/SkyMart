package com.example.amazoncloneapplication.MenuFiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.amazoncloneapplication.HomeActivity;
import com.example.amazoncloneapplication.R;

public class BaseActivity extends AppCompatActivity {

    RadioGroup radioGroup1;
    RadioButton home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        radioGroup1 = findViewById(R.id.radioGroup1);
        home = findViewById(R.id.bottom_home);

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Intent in;

                switch (i){
                    case R.id.bottom_home:
                        in = new Intent(getBaseContext(), HomeActivity.class);
                        startActivity(in);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.bottom_addproduct:
                        in = new Intent(getBaseContext(), AddProductActivity.class);
                        startActivity(in);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.bottom_search:
                        in = new Intent(getBaseContext(), SearchActivity.class);
                        startActivity(in);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.bottom_cart:
                        in = new Intent(getBaseContext(), CartActivity.class);
                        startActivity(in);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.bottom_Profile:
                        in = new Intent(getBaseContext(), ProfileActivity.class);
                        startActivity(in);
                        overridePendingTransition(0,0);
                        break;

                    default:
                        break;
                }
            }
        });
    }
}