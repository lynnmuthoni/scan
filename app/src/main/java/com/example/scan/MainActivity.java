package com.example.scan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTakePicture, btnScanBarcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btnTakePicture = (Button) findViewById(R.id.btnTakePicture);
        btnScanBarcode = (Button) findViewById(R.id.btnScanBarcode);
        btnTakePicture.setOnClickListener(this);
        btnScanBarcode.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       if(view.getId()==R.id.btnTakePicture) {

           startActivity(new Intent(MainActivity.this, PictureBarcodeActivity.class));
       } else if (view.getId()==R.id.btnScanBarcode) {
           startActivity(new Intent(MainActivity.this, ScannedBarcodeActivity.class));

       }

        }

    }
