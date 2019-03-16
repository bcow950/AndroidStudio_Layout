package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_ll ;
    private Button btn_cl ;
    private Button btn_tl ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ll = findViewById(R.id.btn_ll);
        btn_cl = findViewById(R.id.btn_cl);
        btn_tl = findViewById(R.id.btn_tl);

        setListeners();
    }
    private void setListeners() {
        OnClick onClick = new OnClick();
        btn_ll.setOnClickListener(onClick);
        btn_cl.setOnClickListener(onClick);
        btn_tl.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        Intent intent;

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_ll :
                    intent = new Intent(MainActivity.this,LinearLayoutActivity.class);
                    break;
                case R.id.btn_cl :
                    intent = new Intent(MainActivity.this,ConstraintLayoutActivity.class);
                    break;
                case R.id.btn_tl :
                    intent = new Intent(MainActivity.this,TableLayoutActivity.class);
                    break;
            }
            startActivity(intent);
        }

    }
}
