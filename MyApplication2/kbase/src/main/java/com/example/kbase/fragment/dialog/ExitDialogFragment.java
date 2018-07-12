package com.example.kbase.fragment.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.kbase.LoginActivity;
import com.example.kbase.R;

public class ExitDialogFragment extends DialogFragment implements View.OnClickListener{
    private Button exit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view= LayoutInflater.from(getActivity()).inflate(R.layout.dialogfragment_exit,null);
        exit = view.findViewById(R.id.exit_dialog);
//        cancel = view.findViewById(R.id.neglect_dialog);
        exit.setOnClickListener(this);
//        cancel.setOnClickListener(this);
        builder.setView(view);
        return builder.create();
    }

    @Override
    public void onClick(View view) {
            switch(view.getId()){
                case R.id.exit_dialog:
                    getActivity().finish(); // 这里只退出当前的Activity --> Fragment所在的Activity-MainActivity
                    new LoginActivity().finish();// 退出LoginActivity
                    android.widget.Toast.makeText(getActivity(), "Logout Successful.", Toast.LENGTH_SHORT).show();
                    break;
//                case R.id.neglect_dialog:
//                    new ExitDialogFragment().onStop();
            }
    }

}
