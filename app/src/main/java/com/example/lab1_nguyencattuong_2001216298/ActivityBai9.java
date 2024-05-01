package com.example.lab1_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityBai9 extends AppCompatActivity {
Button btnTong,btnHieu,btnTich,btnThuong,btnUCLN,btnThoat;
EditText txtNoA,txtNoB;
TextView tvTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai9);
        addControl();
        addEvent();
    }
    void addControl()
    {
        btnTong = (Button) findViewById(R.id.btnTong);
        btnHieu = (Button) findViewById(R.id.btnHieu);
        btnTich = (Button) findViewById(R.id.btnTich);
        btnUCLN = (Button) findViewById(R.id.btnUCLN);
        btnThuong = (Button) findViewById(R.id.btnThuong);
        txtNoA = (EditText) findViewById(R.id.txtNoA);
        txtNoB = (EditText) findViewById(R.id.txtNoB);
        tvTinh = (TextView) findViewById(R.id.tvTinh);
        btnThoat = (Button) findViewById(R.id.btnThoat);
    }

    void addEvent()
    {
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(txtNoA.getText().toString());
                int b = Integer.parseInt(txtNoB.getText().toString());
                tvTinh.setText(String.valueOf(a+b));
            }
        });

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(txtNoA.getText().toString());
                int b = Integer.parseInt(txtNoB.getText().toString());
                tvTinh.setText(String.valueOf(a-b));
            }
        });

        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(txtNoA.getText().toString());
                int b = Integer.parseInt(txtNoB.getText().toString());
                tvTinh.setText(String.valueOf(a*b));
            }
        });

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(txtNoA.getText().toString());
                Double b = Double.parseDouble(txtNoB.getText().toString());
                tvTinh.setText(String.valueOf(a/b));
            }
        });

        btnUCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(txtNoA.getText().toString());
                int b = Integer.parseInt(txtNoB.getText().toString());
                tvTinh.setText(String.valueOf(UCLN(a,b)));
            }
        });
btnThoat.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),ActivityBai9.class);
        startActivity(intent);

        Intent InThoat = new Intent(Intent.ACTION_MAIN);
        InThoat.addCategory(Intent.CATEGORY_HOME);
        startActivity(InThoat);
        finish();
    }
});
    }

    int UCLN (int a, int b)
    {
        while (a*b !=0)
        {
            if (a > b )
            {
                a%=b;
            }
            else
            {
                b%=a;
            }
        }
        return a + b;
    }
}