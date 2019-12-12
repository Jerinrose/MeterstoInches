package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText entermeter;
    private Button convertbutton;
    private TextView resultview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entermeter=(EditText) findViewById(R.id.meterid);
        convertbutton = (Button) findViewById(R.id.buttonid);
        resultview = (TextView) findViewById(R.id.textView2);
        convertbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double multiplier=39.73;
                Double result=0.00;

                if(entermeter.getText().toString().equals("")){
                    resultview.setText("Enter valid no");
                    resultview.setTextColor(Color.RED);
                }
                else {

                    Double meterval = Double.parseDouble(entermeter.getText().toString());
                    result = meterval * multiplier;
                    resultview.setText(String.format("%.2f", result) + " inches");
                    resultview.setTextColor(Color.DKGRAY);
                }
            }
        });
    }
}
