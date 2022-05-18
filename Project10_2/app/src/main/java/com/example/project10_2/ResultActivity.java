/* **********************************************
 * 프로그램명 :  ResultActivity.java
 * 작성자 : 2019038026 이혁수
 * 작성일 : 2022.05.04
 *프로그램 설명 :  실습10-2 명화 선호도 투표 앱
 ************************************************/
package com.example.project10_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setTitle("투표결과");

        Intent intent=getIntent();
        int[] voteResult=intent.getIntArrayExtra("VoteCount");
        String[] imageName=intent.getStringArrayExtra(("ImageName"));

        TextView tv[]=new TextView[9];
        RatingBar rbar[]=new RatingBar[9];

        Integer tvID[]={R.id.tv1,R.id.tv2,R.id.tv3,R.id.tv4,R.id.tv5,
                R.id.tv6,R.id.tv7,R.id.tv8,R.id.tv9};
        Integer rbarID[]={R.id.rbar1,R.id.rbar2,R.id.rbar3,R.id.rbar4,
                R.id.rbar5,R.id.rbar6,R.id.rbar7,R.id.rbar8,R.id.rbar9};

        for(int i=0;i<voteResult.length;i++){
            tv[i]=(TextView)findViewById(tvID[i]);
            rbar[i]=(RatingBar) findViewById(rbarID[i]);
        }

        for(int i=0;i<voteResult.length;i++){
            tv[i].setText(imageName[i]);
            rbar[i].setRating((float) voteResult[i]);
        }

        Button btnReturn =(Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}