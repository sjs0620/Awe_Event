package com.sjs.edu.awe_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String text;
        int id = v.getId();

        switch (id){
            case R.id.btn1:
                text =  ((Button)v).getText().toString(); break;
            case R.id.btn2:
                text =  ((Button)v).getText().toString(); break;
            case R.id.btn3:
                text =  ((Button)v).getText().toString(); break;
            case R.id.btn4:
                text =  ((Button)v).getText().toString(); break;
            default:
                text = "Nothing!!";
        }
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
     }
}
