package com.example.dofcalculator.constant;

import com.example.dofcalculator.R;

/**
 * Created by xujian on 2017/12/28.
 */

public interface DofConstants {

    // 描述相机与拍摄物体距离的常量信息
    enum UNIT_SYSTEM {
        METRIC, // 公制的、公尺的
        IMPERIAL // 英制的、英尺的
    }

    enum DISTANCE_UNIT {
        METERS, // 米
        CENTIMETERS, // 厘米
        FEET, // 英尺
        INCHES // 英寸
    }

    int DISTANCE_UNIT_NAME[] = {
            R.string.meter,
            R.string.centimeter,
            R.string.feet,
            R.string.inch
    };

    float DISTANCE_UNIT_LENGTH[] = {
            1.0f, // 一米对应一米
            0.01f, // 一厘米对应0.01米
            0.3048f, // 一英尺对应0.3048米
            0.0254f, // 一英寸对应0.0254米
    };


    // 容许弥散圆直径列表
    float CIRCLE_OF_CONFUSION[] = {
            0.011f, 0.015f, 0.018f, 0.018f, 0.019f, 0.023f, 0.029f, 0.047f,
            0.053f, 0.059f, 0.067f, 0.083f, 0.12f, 0.11f, 0.15f, 0.22f
    }; // 以毫米为计量单位

}
