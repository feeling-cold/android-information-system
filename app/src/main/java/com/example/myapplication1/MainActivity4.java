package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity4 extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    /*private Fragment f1;
    private Fragment f2;
    private Fragment[] f;
    private int lastFragment;
    private BottomNavigationView btv;

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initview();
        replaceFragment(new workragment());
    }

    private void initview() {
        BottomNavigationView btv = findViewById(R.id.bottomNavigationView);
        btv.setOnNavigationItemSelectedListener(this);
        btv.setSelectedItemId(R.id.na_work);
    }

    private void replaceFragment(Fragment f) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction tr = fm.beginTransaction();
        tr.replace(R.id.fragment_empty,f);
        tr.commit();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemid = item.getItemId();
        switch(itemid){
            case R.id.na_work:
                replaceFragment(new workragment());
                return true;

            case R.id.na_user:
                replaceFragment(new userFragment());
                return true;
        }
        return false;
    }
    /*
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.b1:
                System.out.println(1);
                Intent intent = new Intent(this,MainActivity3.class);
                startActivity(intent);
            case R.id.b2:
                Intent intent2 = new Intent(this,MainActivity4.class);
                startActivity(intent2);
            case R.id.b3:
                Intent intent3 = new Intent(this,MainActivity5.class);
                startActivity(intent3);
            case R.id.b4:
                Intent intent4 = new Intent(this,MainActivity6.class);
                startActivity(intent4);


        }
    } */

}