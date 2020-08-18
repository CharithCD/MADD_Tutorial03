package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE= "com.example.IntentPro.MESSAGE";
    public static final String EXTRA_MESSAGE2 = null;
    private Button btnOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

       
    }


    public void sendMessage(View view){


        Intent intent = new Intent(this,SecondActivity.class);
        //Intent intent2 = new Intent(this,SecondActivity.class);

        EditText editText1 = (EditText) findViewById(R.id.edit01);
        EditText editText2 = (EditText) findViewById(R.id.edit02);
        String message = editText1.getText().toString();
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message); startActivity(intent);
        intent.putExtra(EXTRA_MESSAGE2,message2); startActivity(intent);

       // Context context = getApplicationContext();
       // CharSequence messa = "Sending Message";
       // int duration = Toast.LENGTH_SHORT;

        //Toast toast = Toast.makeText(context,messa,duration);
        //toast.show();

        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file

        View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));
//Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();



    }


}