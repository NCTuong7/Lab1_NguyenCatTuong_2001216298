package com.example.lab1_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityBai5 extends AppCompatActivity {
EditText txtA,txtB;
Button btnGiai;
TextView tvkq5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);
        addControl();
        addEvent();
    }
    void addControl()
    {
        txtA = (EditText) findViewById(R.id.txtA);
        txtB = (EditText) findViewById(R.id.txtB);
        btnGiai = (Button)  findViewById(R.id.btnGiai);
        tvkq5 = (TextView)  findViewById(R.id.tvkq5);
    }
    void addEvent()
    {
        txtA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int a = Integer.parseInt(txtA.getText().toString());
                int b = Integer.parseInt(txtB.getText().toString());
                giaiPTB1(a,b);
            }
        });

    }
    void giaiPTB1(int a, int b)
    {
        double kq;
        if (a == 0 && b==0)
        {
                tvkq5.setText("Phương trình vô số nghiệm");
        }
        else if (a == 0 && b != 0 )
        {
            tvkq5.setText("Phương trình vô nghiệm");
        }
        else
        {
             kq = -b/(double)a;
            tvkq5.setText("Phương trình có nghiệm x =  " + String.valueOf((kq)));
        }
    }



}