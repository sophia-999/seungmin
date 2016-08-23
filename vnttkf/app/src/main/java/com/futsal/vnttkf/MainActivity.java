package com.futsal.vnttkf;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private void DialogRadio(){
//        final CharSequence[] PhoneModels = {"3 Km","5 Km", "7 Km", "8 Km", "10 Km", "10 Km 이상"};
//        AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
//        alt_bld.setTitle("반경 거리 변경");
//        alt_bld.setSingleChoiceItems(PhoneModels, -1, new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int item) {
//                Toast.makeText(getApplicationContext(), "거리 = "+PhoneModels[item], Toast.LENGTH_SHORT).show();
//                // dialog.cancel();
//            }
//        });
//        AlertDialog alert = alt_bld.create();
//        alert.show();
//    }
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<MyData> myDataset;



//    Button btn_km;
//    TextView num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        myDataset = new ArrayList<>();

        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);






        myDataset.add(new MyData(R.mipmap.mini,"얌얌축구장",R.mipmap.img,"3km","무료" ));
        myDataset.add(new MyData(R.mipmap.toystory,"랄랄라축구장",R.mipmap.img,"7km","무료"));
//
//        btn_km=(Button)findViewById(R.id.km);
//        num=(TextView)findViewById(R.id.num);
//
//
//
//        btn_km.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){ //버튼 클릭시 다이얼로그 띄움
//                DialogRadio();
//
//            }
//        });


    }
}




