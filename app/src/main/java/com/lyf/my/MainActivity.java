package com.lyf.my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTextView= (TextView) findViewById(R.id.tv);
        mTextView.setText("liuyafei");
    }
    public void onGo(View view){
        Toast.makeText(this,"hello!",Toast.LENGTH_SHORT).show();
    }
}
