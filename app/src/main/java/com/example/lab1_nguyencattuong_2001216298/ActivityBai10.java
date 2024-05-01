package com.example.lab1_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityBai10 extends AppCompatActivity {
Button btnNewAcc,btnLogin;
EditText txtName,txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai10);
        addControl();
        addEvent();
    }
    void addControl()
    {
        btnNewAcc = (Button) findViewById(R.id.btnNewAcc);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        txtName = (EditText) findViewById(R.id.txtName);
        txtPass = (EditText) findViewById(R.id.txtPass);
    }
    void addEvent()
    {

        btnNewAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityBai10_b.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Mở trang đăng ký", Toast.LENGTH_SHORT).show();
            }
        });
    }


}