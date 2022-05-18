package com.example.task4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");

        edit1=(EditText)findViewById(R.id.Edit1);
        edit1=(EditText) findViewById(R.id.Edit2);
        btnAdd=(Button)findViewById(R.id.BtnAdd);
        btnSub=(Button)findViewById(R.id.BtnSub);
        btnDiv=(Button)findViewById(R.id.BtnDiv);
        btnMul=(Button)findViewById(R.id.BtnMul);
        btnMod=(Button)findViewById(R.id.BtnMod);
        textResult=(TextView)findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"값이 입력되지 않았습니다", Toast.LENGTH_SHORT).show();
                    return;
                }
                result=Double.parseDouble(num1)+Double.parseDouble(num2);
                textResult.setText("계산 결과 : "+result.toString());
            }
        });

        btnSub.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"값이 입력되지 않았습니다", Toast.LENGTH_SHORT).show();
                    return;
                }
                textResult.setText("계산 결과 : "+result.toString());
            }
        });

        btnDiv.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"값이 입력되지 않았습니다", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(Double.parseDouble(num2)==0){
                    Toast.makeText(getApplicationContext(),"0으로 나눕니다.", Toast.LENGTH_SHORT).show();
                    return;
                }
                result=Double.parseDouble(num1)/Double.parseDouble(num2);
                textResult.setText("계산 결과 : "+result.toString());
            }
        });

        btnMul.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"값이 입력되지 않았습니다", Toast.LENGTH_SHORT).show();
                    return;
                }
                result=Double.parseDouble(num1)*Double.parseDouble(num2);
                textResult.setText("계산 결과 : "+result.toString());
            }
        });

        btnDiv.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"값이 입력되지 않았습니다", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(Double.parseDouble(num2)==0){
                    Toast.makeText(getApplicationContext(),"0으로 나눕니다.", Toast.LENGTH_SHORT).show();
                    return;
                }
                result=Double.parseDouble(num1)%Double.parseDouble(num2);
                textResult.setText("계산 결과 : "+result.toString());
            }
        });


    }
}