package com.example.lab1_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    Button btnGui;

    EditText edttxtTo,edttxtTieuDe,txtNoiDung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
       addConTrol();
        addEvent();

    }
    void addConTrol()
    {
        btnGui = (Button) findViewById(R.id.btnGui);
        txtNoiDung = (EditText) findViewById(R.id.txtNoiDung);
        edttxtTieuDe = (EditText) findViewById(R.id.edttxtTieuDe);
        edttxtTo = (EditText) findViewById(R.id.edttxtTo);
    }

    void addEvent()
    {
       txtNoiDung.requestFocus();

    }


}