package com.example.lab1_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityBai10_b extends AppCompatActivity {
Button btnHaveAcc,btnCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai10_b);
        addConTrol();
        addEvent();

    }
    void  addConTrol()
    {
        btnHaveAcc = (Button) findViewById(R.id.btnHaveAcc);
        btnCreate = (Button) findViewById(R.id.btnCreate);
    }
    void addEvent()
    {
        btnHaveAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityBai10.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Mở trang đăng nhập", Toast.LENGTH_SHORT).show();
            }
        });
    }
}