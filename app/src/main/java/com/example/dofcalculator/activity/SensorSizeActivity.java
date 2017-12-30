package com.example.dofcalculator.activity;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.dofcalculator.R;
import com.example.dofcalculator.adapter.SensorSizeAdapter;
import com.example.dofcalculator.constant.ApplicationConstants;
import com.example.dofcalculator.model.SensorSize;
import com.example.dofcalculator.util.UtilManager;

import java.util.ArrayList;
import java.util.List;

public class SensorSizeActivity extends AppCompatActivity {

    //控件获取
    private RecyclerView mSensorSizeRecyclerView;

    private SensorSizeAdapter mSensorSizeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_size);

        Toolbar toolbar = findViewById(R.id.sensor_size_activity_toolbar);
        setSupportActionBar(toolbar);

        // 获取RecyclerView控件
        mSensorSizeRecyclerView = findViewById(R.id.sensor_size_recycler_view);
        // 获取sensor size的list
        TypedArray sensorSizeTypedArray = getResources().obtainTypedArray(R.array.sensers_array);
        List<SensorSize> sensorSizeList = UtilManager.typedAyyay2SensorSizeList(sensorSizeTypedArray);
        sensorSizeList.add(0, new SensorSize(ApplicationConstants.CUSTOM_CIRCLE_OF_CONFUSION_LABEL_IN_RECTCLER_VIEW));

        // 设定layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mSensorSizeRecyclerView.setLayoutManager(linearLayoutManager);

        // 设定Adapter
        mSensorSizeAdapter = new SensorSizeAdapter(sensorSizeList);
        mSensorSizeRecyclerView.setAdapter(mSensorSizeAdapter);

    }



}
