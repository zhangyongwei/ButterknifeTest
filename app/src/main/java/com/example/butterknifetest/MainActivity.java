package com.example.butterknifetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_id)
    Button btnId;
    @BindView(R.id.btn_name)
    Button btnName;
    @BindView(R.id.btn_code)
    Button btnCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_id, R.id.btn_name, R.id.btn_code})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_id:


                break;
            case R.id.btn_name:
                break;
            case R.id.btn_code:
                break;
        }
    }



}
