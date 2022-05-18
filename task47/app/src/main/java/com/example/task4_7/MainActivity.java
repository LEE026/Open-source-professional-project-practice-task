/* **********************************************
 * 프로그램명 :  MainActivity
 * 작성자 : 2019038026 이혁수
 * 작성일 : 2022.03.30
 *프로그램 설명 :  체크박스가 체크 되어 있는 기능을 버튼에 적용
 ************************************************/
package com.example.task4_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    CheckBox check1,check2,check3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-7");

        btn=(Button) findViewById(R.id.Btn);
        check1=(CheckBox) findViewById(R.id.Check1);
        check2=(CheckBox) findViewById(R.id.Check2);
        check3=(CheckBox) findViewById(R.id.Check3);

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                btn.setEnabled(b);
            }
        });

        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                btn.setClickable(b);
            }
        });

        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                btn.setRotation(45.0f*((b)?1f:0f));
            }
        });
    }
}