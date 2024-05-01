package com.example.lab1_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {

    Button btnThucHien;
    EditText txtDuong;
    TextView txtAm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        addConTrol();
        addEvent();
    }
    void addConTrol()
    {
        txtDuong = findViewById(R.id.txtDuong);
        txtAm = findViewById(R.id.txtAm);
        btnThucHien = findViewById(R.id.btnThucHien);
    }
    void addEvent()
    {
        btnThucHien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String can = "", chi = "";
                int tuoi, nam,namHienTai;
                namHienTai = Integer.parseInt(txtDuong.getText().toString());
                tuoi = namHienTai %12;
                nam = namHienTai %10;
                switch (tuoi)
                {
                    case 0:
                        chi = "Thân";
                        break;
                    case 1:
                        chi = "Dậu";
                                break;
                    case 2:
                        chi = "Tuất";
                        break;
                    case 3:
                        chi = "Hợi";
                        break;
                    case  4:
                        chi = "Tí";
                        break;
                    case 5:
                        chi = "Sửu";
                        break;
                    case 6:
                        chi = "Dần";
                        break;
                    case 7:
                        chi = "Mẹo";
                        break;
                    case 8:
                        chi = "Thìn";
                        break;
                    case 9:
                        chi = "Tỵ";
                        break;
                    case 10:
                        chi = "Ngọ";
                        break;
                    case 11:
                        chi = "Mùi";
                        break;

                }

                switch (nam)
                {
                    case 0:
                        can = "Canh";
                        break;
                    case 1:
                        can = "Tân";
                        break;
                    case 2:
                        can = "Nhâm";
                        break;
                    case 3:
                        can = "Quý";
                        break;
                    case 4:
                        can = "Giáp";
                        break;
                    case 5:
                        can = "Ất";
                        break;
                    case 6:
                        can = "Bính";
                        break;
                    case 7:
                        can = "Đinh";
                        break;
                    case 8:
                        can = "Mậu";
                        break;
                    case 9:
                        can = "Kỷ";
                        break;
                }
String tenNam = can + " " + chi;
                txtAm.setText(tenNam);
            }
        });
    }


}