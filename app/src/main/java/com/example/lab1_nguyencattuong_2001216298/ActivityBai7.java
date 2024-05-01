package com.example.lab1_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ActivityBai7 extends AppCompatActivity {
    Button btnBi, btnHex;
    EditText txtDem;
    TextView txtRe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai7);

        addControl();
        addEvent();
    }

    void addControl() {
        btnBi = findViewById(R.id.btnBi);
        btnHex = findViewById(R.id.btnHex);
        txtDem = findViewById(R.id.txtDem);
        txtRe = findViewById(R.id.txtRe);
    }

    void addEvent() {
        btnBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(txtDem.getText().toString());
                long sum = 0;
                do {
                    sum += n % 2;
                    n = n / 2;
                    if (n == 0)
                        break;
                    else
                        sum = sum * 10;
                } while (n > 0);
                txtRe.setText("" + String.valueOf(sum));
            }
        });
        btnHex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n = Integer.parseInt(txtDem.getText().toString());

                txtRe.setText(convertNumber(n,16));
            }
        });
    }

    String convertNumber(int n, int b) {
        final char CHAR_55 = 55;
        if (n < 0 || b < 2 || b > 16) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n;

        while (remainder > 0) {
            if (b > 10) {
                m = remainder % b;
                if (m >= 10) {
                    sb.append((char) (CHAR_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % b);
            }
            remainder = remainder / b;
        }
        return sb.reverse().toString();
    }
}

