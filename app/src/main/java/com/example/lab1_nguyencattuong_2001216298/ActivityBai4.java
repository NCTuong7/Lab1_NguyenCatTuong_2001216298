package com.example.lab1_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityBai4 extends AppCompatActivity {
Button btnTinh;
EditText txtSoA, txtSoB;
TextView tvKQ,tvkq4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        addConTrol();
        addEvent();
    }
    void addConTrol()
    {
        btnTinh = (Button) findViewById(R.id.btnTinh);
        txtSoA = (EditText)  findViewById(R.id.txtSoA);
        txtSoB = (EditText) findViewById(R.id.txtSoB);
        tvKQ = (TextView) findViewById(R.id.tvKQ);
        tvkq4 = (TextView) findViewById(R.id.tvkq4);
    }
    void addEvent()
    {
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(txtSoA.getText().toString());
                int b = Integer.parseInt(txtSoB.getText().toString());
                tvkq4.setText(" " + String.valueOf(timUocChung(a,b)));
            }
        });
    }
    int timUocChung(int a, int b)
    {
        while (a!=b)
        {
            if(a > b)
            {
                a = a -b;
            }
            else
            {
                a = b - a;

            }
        }
        return a;
    }


}