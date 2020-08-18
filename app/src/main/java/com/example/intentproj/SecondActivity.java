package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button add , sub , mul , div;
    private EditText editText1 , editText2;
    private TextView editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent1 = getIntent();
        String message1 = intent1.getStringExtra(FirstActivity.EXTRA_MESSAGE);
        EditText editTt1 = findViewById(R.id.et1);
        editTt1.setText(message1);

        Intent intent2 = getIntent();
        String message2 = intent2.getStringExtra(FirstActivity.EXTRA_MESSAGE2);
        EditText editTt2 = findViewById(R.id.et2);
        editTt2.setText(message2);

        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnSub);
        mul = (Button)findViewById(R.id.btnMul);
        div = (Button)findViewById(R.id.btnDiv);

        editText1 = (EditText)findViewById(R.id.et1);
        editText2 = (EditText)findViewById(R.id.et2);
        editText3 = (TextView)findViewById(R.id.et3);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Some Details", Toast.LENGTH_SHORT).show();
                }
                else {
                    editText1.getText().toString();
                    editText2.getText().toString();
                    double a1 = Double.valueOf(editText1.getText().toString());
                    double a2 = Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3 = a1 + a2;
                    editText3.setText(String.valueOf(editText1.getText().toString()+ " + "+editText2.getText().toString() +" = "+ a3));
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Some Details", Toast.LENGTH_SHORT).show();
                }
                else {
                    editText1.getText().toString();
                    editText2.getText().toString();
                    double a1 = Double.valueOf(editText1.getText().toString());
                    double a2 = Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3 = a1 - a2;
                    editText3.setText(String.valueOf(editText1.getText().toString()+ " - "+editText2.getText().toString() +" = "+ a3));
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Some Details", Toast.LENGTH_SHORT).show();
                }
                else {
                    editText1.getText().toString();
                    editText2.getText().toString();
                    double a1 = Double.valueOf(editText1.getText().toString());
                    double a2 = Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3 = a1 * a2;
                    editText3.setText(String.valueOf(editText1.getText().toString()+ " * "+editText2.getText().toString() +" = "+ a3));
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Some Details", Toast.LENGTH_SHORT).show();
                }
                else {
                    editText1.getText().toString();
                    editText2.getText().toString();
                    double a1 = Double.valueOf(editText1.getText().toString());
                    double a2 = Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3 = a1 / a2;
                    editText3.setText(String.valueOf(editText1.getText().toString()+ " / "+editText2.getText().toString() +" = "+ a3));
                }
            }
        });
    }
}