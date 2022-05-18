/* **********************************************
 * 프로그램명 :  MainActivity.java
 * 작성자 : 2019038026 이혁수
 * 작성일 : 2022.05.04
 *프로그램 설명 :  실습10-3 로그캣을 이용해 액티비티 생명주기 확인
 ************************************************/
package com.example.project10_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("엑티비티 테스트 예제");
        android.util.Log.i("액티비티 테스트","onCreate()");

        Button btnDial=(Button) findViewById(R.id.btnDial);
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse(("tel:01067668837"));
                Intent intent=new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });

        Button btnFinsh=(Button) findViewById(R.id.btnFinish);
        btnFinsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i("액티비티 테스트","onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i("액티비티 테스트","onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i("액티비티 테스트","onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i("액티비티 테스트","onStop()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i("액티비티 테스트","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i("액티비티 테스트","onResume()");
    }
}