/* **********************************************
 * 프로그램명 :  MainActivity
 * 작성자 : 2019038026 이혁수
 * 작성일 : 2022.03.30
 *프로그램 설명 :  버튼을 누르면 사진이 10도씩 회전하는 프로그램
 ************************************************/


package com.example.task4_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제4-9");

        btn=(Button) findViewById(R.id.Btn);
        img=(ImageView) findViewById(R.id.Img);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setRotation(img.getRotation()+10);
            }
        });
    }
}