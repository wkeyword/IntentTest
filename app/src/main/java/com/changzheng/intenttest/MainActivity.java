package com.changzheng.intenttest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void webCli(View view) {

        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.baidu.com"));
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }

    public void otherAty(View view) {

        Intent intent=new Intent();
        intent.setClass(this,OtherActivity.class);
        startActivity(intent);
    }

    public void dataChange(View view) {
        Intent intent=new Intent();
        intent.setClass(this,OtherActivity.class);
        intent.putExtra("name","wkeyword");
        intent.putExtra("age",28);
        startActivity(intent);

    }
}
