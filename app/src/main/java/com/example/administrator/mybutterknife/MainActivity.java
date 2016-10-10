package com.example.administrator.mybutterknife;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.tv2)
    TextView tv2;
    @BindView(R.id.tv3)
    TextView tv3;
    @BindView(R.id.tv4)
    TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv1:
                Toast.makeText(this,"tv1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv2:
                Toast.makeText(this,"tv1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv3:
                Toast.makeText(this,"tv1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv4:
                Toast.makeText(this,"tv1",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
