package com.example.lab1_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnBai3,btnBai4,btnbBai5,btnBai6,btnBai7,btnBai8,btnBai9,btnBai10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCoTrol();
        addEvent();
    }
    void addCoTrol()
    {
        btnBai3 = (Button) findViewById(R.id.btnBai3);
        btnBai4 = (Button) findViewById(R.id.btnBai4);
        btnbBai5 = (Button) findViewById(R.id.btnBai5);
        btnBai6 = (Button) findViewById(R.id.btnBai6);
        btnBai7 = (Button) findViewById(R.id.btnBai7);
        btnBai8 = (Button) findViewById(R.id.btnBai8);
        btnBai9 = (Button) findViewById(R.id.btnBai9);
        btnBai10 = (Button) findViewById(R.id.btnBai10);

    }
    void addEvent()
    {
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Mở intent
                Intent intent =  new Intent(getApplicationContext(),Activity2.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Mở trang thành công", Toast.LENGTH_SHORT).show();
            }
        });
        btnBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityBai4.class);
                startActivity(intent);

                // Thông báo
                Toast.makeText(getApplicationContext(), "Mở trang thành công", Toast.LENGTH_SHORT).show();
            }
        });
        btnbBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityBai5.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Mở trang thành công",Toast.LENGTH_SHORT).show();
            }
        });
        btnBai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activity6.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Mở trang thành công ",Toast.LENGTH_SHORT).show();
            }
        });
        btnBai7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityBai7.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Mở trang thành công", Toast.LENGTH_SHORT).show();
            }

        });
        btnBai8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityBai8.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Mở trang thành công", Toast.LENGTH_SHORT).show();
            }
        });

        btnBai9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityBai9.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Mở trang thành công", Toast.LENGTH_SHORT).show();
            }
        });
        btnBai10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityBai10.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Mở trang thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }
}