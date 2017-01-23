package com.inoarte.testmodulebintray;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.inoarte.mylittlelibrary.CustomSum;


public class MainActivity extends Activity {

    private Button btnTeste;
    private TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTeste = (Button)findViewById(R.id.btnTeste);
        lblResult = (TextView)findViewById(R.id.lblResult);
        btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblResult.setText(String.valueOf(CustomSum.Sum(10, 20)));
            }
        });
    }
}
