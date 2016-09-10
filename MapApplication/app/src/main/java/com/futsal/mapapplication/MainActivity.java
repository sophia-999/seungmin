package com.futsal.mapapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapView;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent1=new Intent(MainActivity.this,test.class);

                startActivity(intent1);

            }

        });

    }
}
