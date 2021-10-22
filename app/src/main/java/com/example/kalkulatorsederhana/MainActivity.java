package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText first, second;
    Button Btnplus, Btnminus, Btnmultiply, Btndivide, Btnclean;
    TextView vresult;

    protected float yFirst, ySecond, yResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText) findViewById(R.id.angka_pertama);
        second = (EditText) findViewById(R.id.angka_kedua);
        vresult = (TextView) findViewById(R.id.hasil);

        Btnplus = (Button) findViewById(R.id.tambah);
        Btnminus = (Button) findViewById(R.id.kurang);
        Btnmultiply = (Button) findViewById(R.id.kali);
        Btndivide = (Button) findViewById(R.id.bagi);
        Btnclean = (Button) findViewById(R.id.bersihkan);

        Btnplus.setOnClickListener(this);
        Btnminus.setOnClickListener(this);
        Btndivide.setOnClickListener(this);
        Btnmultiply.setOnClickListener(this);
        Btnclean.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        yFirst = Float.parseFloat(first.getText().toString());
        ySecond = Float.parseFloat(second.getText().toString());
        switch (v.getId()) {
            case R.id.tambah:
                yResult = yFirst + ySecond;
                vresult.setText(String.valueOf(yResult));
                break;
        }
        switch (v.getId()) {
            case R.id.kurang:
                yResult = yFirst - ySecond;
                vresult.setText(String.valueOf(yResult));
                break;
        }
        switch (v.getId()) {
            case R.id.kali:
                yResult = yFirst * ySecond;
                vresult.setText(String.valueOf(yResult));
                break;
        }
        switch (v.getId()) {
            case R.id.bagi:
                yResult = yFirst / ySecond;
                vresult.setText(String.valueOf(yResult));
                break;
        }
        switch (v.getId()) {
            case R.id.bersihkan:
                first.setText("");
                second.setText("");
                vresult.setText("0");
                break;
        }
    }

}