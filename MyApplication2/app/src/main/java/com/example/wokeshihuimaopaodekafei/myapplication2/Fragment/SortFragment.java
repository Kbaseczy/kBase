package com.example.wokeshihuimaopaodekafei.myapplication2.Fragment;

//import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wokeshihuimaopaodekafei.myapplication2.NetActivity;
import com.example.wokeshihuimaopaodekafei.myapplication2.R;
//import com.example.wokeshihuimaopaodekafei.myapplication2.ShopList;

public class SortFragment extends Fragment {

    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.sortfragment, container, false);
        button=(Button)view.findViewById(R.id.button_to_net);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), NetActivity.class);
                startActivity(intent);
            }
        });



        return view;
    }
}
