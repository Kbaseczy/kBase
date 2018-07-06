package com.example.kbase;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private ImageView backToLogin;
    private EditText passWord;
    private EditText userCount;
    private EditText re_enter;
    private EditText tell;
    private EditText email;
    private Button submit;
    Handler handler=new Handler(){
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case 1:
                    Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                    break;

                default:
                    break;
            }

        };
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        backToLogin = findViewById(R.id.backToLogin);

        userCount = findViewById(R.id.userCount);
        passWord = findViewById(R.id.passWord);
        re_enter = findViewById(R.id.reenter);
        tell = findViewById(R.id.tell);
        email = findViewById(R.id.email);

        submit = findViewById(R.id.submit);


//        backToLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(RegisterActivity.this,LoginActivity.class);
//                startActivity(i);
//            }
//        });
        RegisterOnclickListener registerOnclickListener = new RegisterOnclickListener();

        backToLogin.setOnClickListener(registerOnclickListener);
        submit.setOnClickListener(registerOnclickListener);

    }

    private class RegisterOnclickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            //控件被点击后执行的代码
            if(v.getId() == R.id.backToLogin) { //用户注册的按钮或新用户的文本域被单击
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
            else if(v.getId() == R.id.submit) { //用户登录的按钮被单击
               // final String userCount = userCount.getText().toString().trim();
                final String password = passWord.getText().toString().trim();
//              final String re_enter = re_enter.getText().toString().trim();
              //  final String tell = tell.getText().toString().trim();
              //  final String email = email.getText().toString().trim();
                if (userCount.equals("") || password.equals("")) { //用户名或者密码未填写
                    Toast.makeText(getApplicationContext(), "请将信息填写完全后再注册", Toast.LENGTH_LONG).show();
                } else {
                    final ProgressDialog pd = new ProgressDialog(RegisterActivity.this);

                    /*
                        将用户注册信息添加至数据库，待写
                     */

                    pd.setMessage("正在注册...");
                    pd.show();
                    new Thread() {
                        public void run() {

                            try {
                                Thread.sleep(1000);

                                handler.sendEmptyMessage(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            pd.dismiss();
                        }

                        ;
                    }.start();
                }
            }
        }
    }

}
