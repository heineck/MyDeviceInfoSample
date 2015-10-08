package com.heineck.mydeviceinfosample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtInfo = (TextView)findViewById(R.id.txtInfo);


        String OSVersion = MyDeviceInfo.getOSVersion();
        String OSName = MyDeviceInfo.getOSName();
        String APILevel = MyDeviceInfo.getAPILevel();
        String versionName = MyDeviceInfo.getAndroidVersionName();
        String device = MyDeviceInfo.getDevice();
        String model = MyDeviceInfo.getModel();
        String product = MyDeviceInfo.getProduct();
        String manufacturer = MyDeviceInfo.getManufacturer();
        String releaseVersion = MyDeviceInfo.getVersionRelease();
        String brand = MyDeviceInfo.getBrand();
        String codeName = MyDeviceInfo.getCodeName();
        String display = MyDeviceInfo.getDisplay();
        String user = MyDeviceInfo.getUser();
        String host = MyDeviceInfo.getHost();
        String uuid = MyDeviceInfo.getUniqueID(getApplicationContext());
        String fingerprint = MyDeviceInfo.getFingerprint();
        String unknown = MyDeviceInfo.getUnknown();

        txtInfo.append("OSVersion: " + OSVersion + "\n");
        txtInfo.append("OS name: " + OSName);
        txtInfo.append("\nAPI level: " + APILevel);
        txtInfo.append("\nversion name: " + versionName);
        txtInfo.append("\ndevice: " + device);
        txtInfo.append("\nmodel: " + model);
        txtInfo.append("\nproduct: " + product);
        txtInfo.append("\nmanufacturer: " + manufacturer);
        txtInfo.append("\nrelease version: " + releaseVersion);
        txtInfo.append("\nbrand: " + brand);
        txtInfo.append("\ncode name: " + codeName);
        txtInfo.append("\ndisplay: " + display);
        txtInfo.append("\nuser: " + user);
        txtInfo.append("\nhost: " + host);
        txtInfo.append("\nUUID: " + uuid);
        txtInfo.append("\nfingerprint: " + fingerprint);
        txtInfo.append("\nunknown: " + unknown);

    }

}
