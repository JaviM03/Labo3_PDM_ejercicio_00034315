package com.example.pdm_labo3_ejercicio_00034315;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pdm_labo3_ejercicio_00034315.utils.AppConstant;

public class NewActivity extends AppCompatActivity {

        TextView mTextView, mTextView2,mTextView3, mTextView4;
        Button mButton_Share;
        EditText mUser, mPassword, mEmail, mGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Intent mIntent=getIntent();
        mTextView =findViewById(R.id.tv_message);
        mTextView2=findViewById(R.id.tv_message2);
        mTextView3=findViewById(R.id.tv_message3);
        mTextView4=findViewById(R.id.tv_message4);
        mButton_Share=findViewById(R.id.btn_share);
        if (mIntent!=null ){
            mTextView.setText(mIntent.getStringExtra(AppConstant.USER_KEY));
            mTextView2.setText(mIntent.getStringExtra(AppConstant.EMAIL_KEY));
            mTextView3.setText(mIntent.getStringExtra(AppConstant.PASS_KEY));
            mTextView4.setText(mIntent.getStringExtra(AppConstant.GEN_KEY));

            mButton_Share.setOnClickListener( v -> {
                String text1=mUser.getText().toString();
                String text2=mPassword.getText().toString();
                String text3=mEmail.getText().toString();
                String text4=mGender.getText().toString();
                Intent mIntent2=new Intent();
                mIntent2.setType("text/plain");
                mIntent2.setAction(Intent.ACTION_SEND);
                mIntent2.putExtra(Intent.EXTRA_TEXT, text1);
                mIntent2.putExtra(Intent.EXTRA_TEXT, text2);
                mIntent2.putExtra(Intent.EXTRA_TEXT, text3);
                mIntent2.putExtra(Intent.EXTRA_TEXT, text4);
                startActivity(mIntent2);

            });
    }


    }


    }
