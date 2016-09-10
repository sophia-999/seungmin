package com.futsal.vnttkf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapView;

public class detail_field extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_field);

        //다음이 제공하는 MapView객체 생성 및 API Key 설정
        MapView mapView = new MapView(this);
        mapView.setDaumMapApiKey("4604576ac44bcea4161f42483d866881");

        //xml에 선언된 map_view 레이아웃을 찾아온 후, 생성한 MapView객체 추가
        RelativeLayout container = (RelativeLayout) findViewById(R.id.map_view);

        container.addView(mapView);


    }
}
