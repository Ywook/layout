package com.examples.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example);



    }

    void init(){
        r1 = (RadioButton)findViewById(R.id.radio);
        r2 = (RadioButton)findViewById(R.id.radio2);

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(getApplicationContext(), "고등학생이 선택됨",Toast.LENGTH_SHORT).show();
                }
            }
        });

        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(getApplicationContext(), "대학생이 선택됨",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
