package com.framework.lvyerose.eventclosetest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivityD extends BaseActivity {
    private static final String TAG = "MainActivityD";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tag_tv);
        tv.setText(TAG);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivityD.this,MainActivityFinal.class));
            }
        });
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,TAG+"--关闭了");
        super.onDestroy();
    }
}
