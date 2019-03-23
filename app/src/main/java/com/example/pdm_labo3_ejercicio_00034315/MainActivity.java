package com.example.pdm_labo3_ejercicio_00034315;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.pdm_labo3_ejercicio_00034315.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    EditText mUser, mPassword, mEmail, mGender;
    Button mButton_Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser=findViewById(R.id.Et_user);
        mPassword=findViewById(R.id.Et_password);
        mEmail=findViewById(R.id.Et_email);
        mGender=findViewById(R.id.Et_gender);
        mButton_Send=findViewById(R.id.btn_send);




        mButton_Send.setOnClickListener(v->{
            String text1=mUser.getText().toString();
            String text2=mPassword.getText().toString();
            String text3=mEmail.getText().toString();
            String text4=mGender.getText().toString();
            Intent mIntent=new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstant.USER_KEY, text1);
            mIntent.putExtra(AppConstant.PASS_KEY, text2);
            mIntent.putExtra(AppConstant.EMAIL_KEY, text3);
            mIntent.putExtra(AppConstant.GEN_KEY, text4);
            startActivity(mIntent);

        });

    }

}
