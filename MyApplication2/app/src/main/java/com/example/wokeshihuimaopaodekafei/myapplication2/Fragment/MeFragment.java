package com.example.wokeshihuimaopaodekafei.myapplication2.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.wokeshihuimaopaodekafei.myapplication2.R;

public class MeFragment extends Fragment {
    ImageView info,exit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mefragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        info=(ImageView)getActivity().findViewById(R.id.info);
        exit=(ImageView)getActivity().findViewById(R.id.exit);

        info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
    }
}