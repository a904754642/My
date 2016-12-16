package com.lyf.my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //我是分支
        TextView mTextView= (TextView) findViewById(R.id.tv);
        mTextView.setText("liuyafei");
    }
}
