package com.example.shixiuwen.inttohex;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etShi = (EditText) findViewById(R.id.etShi);
        final EditText etShiliu = (EditText) findViewById(R.id.etShiliu);
        Button btnZhuanhuan = (Button) findViewById(R.id.btnZhuanhuan);

        btnZhuanhuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = etShi.getText().toString();
                etShiliu.setText(Integer.toHexString(Integer.parseInt(s)));
                //git测试语句01
                //测试其他人修改
                //测试其他人修改2
                //测试自己修改2
                //测试其他人修改3
                //测试自己修改3
                //测试别人修改4(两处修改）)
                //别人也修改了
                //我在改这部分代码
            }
        });
    }
}
