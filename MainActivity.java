 package com.example.correncyconverter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Formatter;

 public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void rupees(View v){
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }

    public void dollar(View v){
        Intent intent=new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent);
    }


}
