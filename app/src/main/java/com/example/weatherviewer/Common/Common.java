package com.example.weatherviewer.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static final String APP_ID = "767044e0e965b6eef6f9fa8da4e91dfb";
    public static Location current_location = null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat(" HH:mm  EEE  dd MM yyyy");
        String formatted = sdf.format(date);

        return formatted;
    }

    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formatted = sdf.format(date);

        return formatted;
    }
}
