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
        final EditText etShiliu = (EditText)findViewById(R.id.etShiliu);
        Button btnZhuanhuan = (Button)findViewById(R.id.btnZhuanhuan);

        btnZhuanhuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = etShi.getText().toString();
                String s1 = Integer.toHexString(Integer.parseInt(s));
                etShiliu.setText(Integer.toHexString(Integer.parseInt(s)));
                System.out.println(s1);
            }
        });
    }
}
