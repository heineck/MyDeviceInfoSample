package com.heineck.mydeviceinfosample;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

import java.lang.reflect.Field;
import java.util.Properties;

/**
 * Created by vheineck on 08/10/15.
 */
public class MyDeviceInfo {

    private static final String TAG = "MyDeviceInfo";

    public static String getOSVersion() {
        return System.getProperty("os.version"); // OS version
    }

    public static String getOSName() {
        return System.getProperty("os.name"); // OS name
    }

    public static String getAPILevel() {
        return String.valueOf(android.os.Build.VERSION.SDK_INT);    // API Level
    }

    public static String getAndroidVersionName() {

        String name = "";
        Field[] fields = Build.VERSION_CODES.class.getFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            int fieldValue = -1;

            Log.d("MM", fieldName);

            try {
                fieldValue = field.getInt(new Object());
            } catch (IllegalArgumentException e) {
                Log.e(TAG, e.getLocalizedMessage());
            } catch (IllegalAccessException e) {
                Log.e(TAG, e.getLocalizedMessage());
            } catch (NullPointerException e) {
                Log.e(TAG, e.getLocalizedMessage());
            }

            if (fieldValue == Build.VERSION.SDK_INT) {
                name = fieldName;
            }
        }

        return name;

    }

    public static String getDevice() {
        return android.os.Build.DEVICE;           // Device
    }

    public static String getModel() {
        return android.os.Build.MODEL;            // Model
    }

    public static String getProduct() {
        return android.os.Build.PRODUCT;          // Product
    }

    public static String getManufacturer() {
        return android.os.Build.MANUFACTURER;
    }

    public static String getVersionRelease() {

        return android.os.Build.VERSION.RELEASE;
    }

    public static String getBrand() {
        return android.os.Build.BRAND;
    }

    public static String getCodeName() {
        return android.os.Build.VERSION.CODENAME;
    }

    public static String getDisplay() {
        return android.os.Build.DISPLAY;
    }

    public static String getUser() {
        return Build.USER;
    }

    public static String getHost() {
        return Build.HOST;
    }

    public static String getUniqueID(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    public static String getFingerprint() {
        return Build.FINGERPRINT;
    }

}
