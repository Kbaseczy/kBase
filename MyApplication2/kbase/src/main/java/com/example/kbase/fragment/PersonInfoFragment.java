package com.example.kbase.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.kbase.R;

public class PersonInfoFragment extends Fragment {
    ImageButton back;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        manager = getFragmentManager();
        transaction = manager.beginTransaction();

        View view = inflater.inflate(R.layout.fragment_person_info, container, false);
        back = view.findViewById(R.id.imageButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transaction.replace(R.id.content_layout,new SpaceFragment()); //replace实现返回上一层效果
                transaction.commit();
            }
        });
        return view;
    }
}
