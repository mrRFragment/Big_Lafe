package com.example.biglafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        floatingActionButton=findViewById(R.id.fab);
        getSupportFragmentManager().beginTransaction().replace(R.id.linerlayout1,new Home()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.item:
                        getSupportFragmentManager().beginTransaction().replace(R.id.linerlayout1,new Home()).commit();
                    break;
                    case R.id.item2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.linerlayout1,new Search()).commit();
                        break;
                    case R.id.item3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.linerlayout1,new Settings()).commit();
                        break;
                    case R.id.item4:
                        getSupportFragmentManager().beginTransaction().replace(R.id.linerlayout1,new Profel()).commit();
                        break;
                }



                return true;
            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });




    }}







