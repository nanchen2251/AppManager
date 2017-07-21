package com.nanchen.crashtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 实际上下面两个方法都是在 BaseActivity 中做
        ((App) getApplication()).addActivity(this);

        final TextView textView = (TextView) findViewById(R.id.showText);
        findViewById(R.id.btn).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        textView.setText("boom...");
                    }
                }).start();
            }
        });
    }
}
