package com.example.kbase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.example.kbase.fragment.HomeFragment;
import com.example.kbase.fragment.KbaseFragment;
import com.example.kbase.fragment.KsortFragment;
import com.example.kbase.fragment.MbaseFragment;
import com.example.kbase.fragment.SpaceFragment;

public class MainActivity extends Activity implements View.OnClickListener {
    RadioButton radioMain;
    RadioButton radioSort;
    RadioButton radioKBase;
    RadioButton radioMBase;
    RadioButton radioSpace;
    android.app.FragmentManager manager;
    android.app.FragmentTransaction transaction;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        System.out.println("onCreate.................");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.content_layout,new HomeFragment());
        transaction.commit();
        InitView();

    }

    public void InitView() {
        System.out.println("InitView.................");
        radioMain = findViewById(R.id.radio0);
        radioSort = findViewById(R.id.radio1);
        radioKBase = findViewById(R.id.radio2);
        radioMBase = findViewById(R.id.radio3);
        radioSpace = findViewById(R.id.radio4);

        radioMain.setOnClickListener(this);
        radioSort.setOnClickListener(this);
        radioKBase.setOnClickListener(this);
        radioMBase.setOnClickListener(this);
        radioSpace.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        System.out.println("onClick.................");
        transaction =manager.beginTransaction();
        switch (view.getId()){
            case R.id.radio0:
                transaction.replace(R.id.content_layout, new HomeFragment());
                break;
            case R.id.radio1:
               transaction.replace(R.id.content_layout, new KsortFragment());
                break;
            case R.id.radio2:
                transaction.replace(R.id.content_layout, new KbaseFragment());
                break;
            case R.id.radio3:
                transaction.replace(R.id.content_layout, new MbaseFragment());
                break;
            case R.id.radio4:
                transaction.replace(R.id.content_layout, new SpaceFragment());
                break;
        }
        transaction.commit();
    }
}
