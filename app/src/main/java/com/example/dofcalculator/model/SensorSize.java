package com.example.dofcalculator.model;

/**
 * Created by xujian on 2017/12/30.
 */

public class SensorSize {

    private String mSensorSizeName;

    public SensorSize(String sensorSizeName) {
        mSensorSizeName = sensorSizeName;
    }

    public String getSensorSizeName() {
        return mSensorSizeName;
    }

    public void setSensorSizeName(String mSensorSizeName) {
        this.mSensorSizeName = mSensorSizeName;
    }
}
