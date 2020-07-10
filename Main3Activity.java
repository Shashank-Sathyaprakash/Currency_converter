package com.example.correncyconverter;

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

public class Main3Activity extends AppCompatActivity {

    Button euro,rupee,pound,yen,dinar,bitc,rubel,ausd,cand,dirh;
    EditText edittxt;
    TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        euro=findViewById(R.id.euro);
        rupee=findViewById(R.id.rupee);
        pound=findViewById(R.id.pound);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        bitc=findViewById(R.id.bit);
        rubel=findViewById(R.id.rubel);
        ausd=findViewById(R.id.aust);
        cand=findViewById(R.id.cana);
        dirh=findViewById(R.id.dirham);
        edittxt=findViewById(R.id.editText);
        txtview=findViewById(R.id.textView);

        //Euros
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edittxt.getText().toString();

                if(TextUtils.isEmpty(a)){
                    edittxt.setError("Please provide a value");
                }
                else {
                    double i,j;
                    i=Double.parseDouble(a);
                    txtview.setText(null);
                    Formatter formater=new Formatter();
                    j= i*0.012;
                    Toast.makeText(getApplicationContext(),"Euro",Toast.LENGTH_SHORT).show();
                    DecimalFormat numberformat=new DecimalFormat("#.00");//#.00 is a decimal digits to be displayed after point in this case it is 2 numbers after decimal point
                    txtview.setText(""+numberformat.format(j));// this two line is used just because some phone may have priorities for double the below one line can be used instead

                }
            }
        });

        //Dollar
        rupee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edittxt.getText().toString();

                if(TextUtils.isEmpty(a)){
                    edittxt.setError("Please provide a value");
                }
                else {
                    double i,j;
                    i=Double.parseDouble(a);
                    txtview.setText(null);
                    Formatter formater=new Formatter();
                    j= i*75.70;
                    Toast.makeText(getApplicationContext(),"Rupees",Toast.LENGTH_SHORT).show();
                    DecimalFormat numberformat=new DecimalFormat("#.00");//#.00 is a decimal digits to be displayed after point in this case it is 2 numbers after decimal point
                    txtview.setText(""+numberformat.format(j));// this two line is used just because some phone may have priorities for double the below one line can be used instead

                }
            }
        });

        //pound
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edittxt.getText().toString();

                if(TextUtils.isEmpty(a)){
                    edittxt.setError("Please provide a value");
                }
                else {
                    double i,j;
                    i=Double.parseDouble(a);
                    txtview.setText(null);
                    Formatter formater=new Formatter();
                    j= i*0.011;
                    Toast.makeText(getApplicationContext(),"Pound",Toast.LENGTH_SHORT).show();
                    DecimalFormat numberformat=new DecimalFormat("#.00");//#.00 is a decimal digits to be displayed after point in this case it is 2 numbers after decimal point
                    txtview.setText(""+numberformat.format(j));// this two line is used just because some phone may have priorities for double the below one line can be used instead

                }
            }
        });

        //yen
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edittxt.getText().toString();

                if(TextUtils.isEmpty(a)){
                    edittxt.setError("Please provide a value");
                }
                else {
                    double i,j;
                    i=Double.parseDouble(a);
                    txtview.setText(null);
                    Formatter formater=new Formatter();
                    j= i*1.41;
                    Toast.makeText(getApplicationContext(),"Yen",Toast.LENGTH_SHORT).show();
                    DecimalFormat numberformat=new DecimalFormat("#.00");//#.00 is a decimal digits to be displayed after point in this case it is 2 numbers after decimal point
                    txtview.setText(""+numberformat.format(j));// this two line is used just because some phone may have priorities for double the below one line can be used instead

                }
            }
        });

        //dinar
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edittxt.getText().toString();

                if(TextUtils.isEmpty(a)){
                    edittxt.setError("Please provide a value");
                }
                else {
                    double i,j;
                    i=Double.parseDouble(a);
                    txtview.setText(null);
                    Formatter formater=new Formatter();
                    j= i*15.72;
                    Toast.makeText(getApplicationContext(),"Dinar",Toast.LENGTH_SHORT).show();
                    DecimalFormat numberformat=new DecimalFormat("#.00");//#.00 is a decimal digits to be displayed after point in this case it is 2 numbers after decimal point
                    txtview.setText(""+numberformat.format(j));// this two line is used just because some phone may have priorities for double the below one line can be used instead

                }
            }
        });

        //Bitcoins
        bitc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edittxt.getText().toString();

                if(TextUtils.isEmpty(a)){
                    edittxt.setError("Please provide a value");
                }
                else {
                    double i,j;
                    i=Double.parseDouble(a);
                    txtview.setText(null);
                    Formatter formater=new Formatter();
                    j= i*0.0000016;
                    Toast.makeText(getApplicationContext(),"Bitcoin",Toast.LENGTH_SHORT).show();
                    DecimalFormat numberformat=new DecimalFormat("#.00");//#.00 is a decimal digits to be displayed after point in this case it is 2 numbers after decimal point
                    txtview.setText(""+numberformat.format(j));// this two line is used just because some phone may have priorities for double the below one line can be used instead

                }
            }
        });

        //Ruble
        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edittxt.getText().toString();

                if(TextUtils.isEmpty(a)){
                    edittxt.setError("Please provide a value");
                }
                else {
                    double i,j;
                    i=Double.parseDouble(a);
                    txtview.setText(null);
                    Formatter formater=new Formatter();
                    j= i*0.97;
                    Toast.makeText(getApplicationContext(),"Rubel",Toast.LENGTH_SHORT).show();
                    DecimalFormat numberformat=new DecimalFormat("#.00");//#.00 is a decimal digits to be displayed after point in this case it is 2 numbers after decimal point
                    txtview.setText(""+numberformat.format(j));// this two line is used just because some phone may have priorities for double the below one line can be used instead

                }
            }
        });

        //Australian Dollar
        ausd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edittxt.getText().toString();

                if(TextUtils.isEmpty(a)){
                    edittxt.setError("Please provide a value");
                }
                else {
                    double i,j;
                    i=Double.parseDouble(a);
                    txtview.setText(null);
                    Formatter formater=new Formatter();
                    j= i*0.020;
                    Toast.makeText(getApplicationContext(),"Australian Dollar",Toast.LENGTH_SHORT).show();
                    DecimalFormat numberformat=new DecimalFormat("#.00");//#.00 is a decimal digits to be displayed after point in this case it is 2 numbers after decimal point
                    txtview.setText(""+numberformat.format(j));// this two line is used just because some phone may have priorities for double the below one line can be used instead

                }
            }
        });

        //Canadian Dollar
        cand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edittxt.getText().toString();

                if(TextUtils.isEmpty(a)){
                    edittxt.setError("Please provide a value");
                }
                else {
                    double i,j;
                    i=Double.parseDouble(a);
                    txtview.setText(null);
                    Formatter formater=new Formatter();
                    j= i*0.018;
                    Toast.makeText(getApplicationContext(),"Canadian Dollar",Toast.LENGTH_SHORT).show();
                    DecimalFormat numberformat=new DecimalFormat("#.00");//#.00 is a decimal digits to be displayed after point in this case it is 2 numbers after decimal point
                    txtview.setText(""+numberformat.format(j));// this two line is used just because some phone may have priorities for double the below one line can be used instead

                }
            }
        });

        //dirham
        dirh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edittxt.getText().toString();

                if(TextUtils.isEmpty(a)){
                    edittxt.setError("Please provide a value");
                }
                else {
                    double i,j;
                    i=Double.parseDouble(a);
                    txtview.setText(null);
//                    Formatter formater=new Formatter();
                    j= i*0.048;
                    Toast.makeText(getApplicationContext(),"Dirham",Toast.LENGTH_SHORT).show();
                    DecimalFormat numberformat=new DecimalFormat("#.00");//#.00 is a decimal digits to be displayed after point in this case it is 2 numbers after decimal point
                    txtview.setText(""+numberformat.format(j));// this two line is used just because some phone may have priorities for double the below one line can be used instead

                }
            }
        });
    }
    public void main(View v){
        Intent intent=new Intent(Main3Activity.this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Thanks for using our App",Toast.LENGTH_SHORT).show();
    }
}
