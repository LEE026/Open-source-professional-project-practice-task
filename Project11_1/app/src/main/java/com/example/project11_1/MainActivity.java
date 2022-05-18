/* **********************************************
 * 프로그램명 :  MainActivity.java
 * 작성자 : 2019038026 이혁수
 * 작성일 : 2022.05.04
 *프로그램 설명 :  실습11-1 영화 포스터 보기1
 ************************************************/
package com.example.project11_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Integer[] posterID={
            R.drawable.mov01,R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,
            R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,
            R.drawable.mov09,R.drawable.mov10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("그리드뷰 영화 포스터");

        final GridView gv=(GridView) findViewById(R.id.gridView1);
        MyGridAdapter gAdapter=new MyGridAdapter(this);
        gv.setAdapter(gAdapter);



    }

    public class MyGridAdapter extends BaseAdapter{
        Context context;
        public MyGridAdapter(Context c){
            context=c;
        }

        @Override
        public int getCount() {
            return posterID.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(200,300));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(5,5,5,5);

            imageView.setImageResource(posterID[i]);

            final  int pos=i;

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    View dialogView=(View) View.inflate(MainActivity.this,
                            R.layout.dialog,null);
                    AlertDialog.Builder dlg =new AlertDialog.Builder(MainActivity.this);
                    ImageView ivPoster=(ImageView)  dialogView.findViewById(R.id.ivPoster);
                    ivPoster.setImageResource(posterID[pos]);
                    dlg.setTitle("큰 포스터");
                    dlg.setIcon(R.drawable.ic_launcher_foreground);
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기",null);
                    dlg.show();
                }
            });

            return imageView;
        }
    }
}