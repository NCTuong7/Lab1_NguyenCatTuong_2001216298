package com.example.lab1_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityBai8 extends AppCompatActivity {

    Button btnCtoF, btnFtoC,btnCls;
    EditText txtC,txtF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai8);
        addControl();
        addEvnent();
    }
    void addControl()
    {
        btnCtoF = (Button) findViewById(R.id.btnCtoF);
        btnFtoC = (Button) findViewById(R.id.btnFtoC);
        btnCls = (Button)  findViewById(R.id.btnCls);
        txtC = (EditText) findViewById(R.id.txtC);
        txtF = (EditText) findViewById(R.id.txtF);
    }
    void addEvnent()
    {
        btnFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double f = Double.parseDouble(txtF.getText().toString());
                double c = (f - 32) * (5/9);
                txtC.setText(String.valueOf(c));
            }
        });

        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = Double.parseDouble(txtC.getText().toString());
                double f = c * (9/5) + 32;
                txtF.setText(String.valueOf(f));
            }
        });
        btnCls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtF.setText("");
                txtC.setText("");
            }
        });
    }

}