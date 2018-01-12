package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertFunc(View view) {
        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);
        Double amountDouble = Double.parseDouble(amountEditText.getText().toString());
        Double result = amountDouble * 13354;
        Toast.makeText(this, "Rp. " + String.format("%.2f", result), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
