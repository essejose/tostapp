package com.essejose.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.essejose.minhabiblioteca.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast customToast = new CustomToast();

        if(BuildConfig.REPORT_CRASH) {
            customToast.showToast(this, "REPORT_CRASH");
            customToast.showToast(this, "REPORT_CRASH");
            customToast.showToast(this, "REPORT_CRASH");
            customToast.showToast(this, "REPORT_CRASH");
        }else{
            customToast.showToast(this, "NO REPORT_CRASH");
            customToast.showToast(this, "NO REPORT_CRASH");
            customToast.showToast(this, "NO REPORT_CRASH");

            customToast.showToast(this, "NO REPORT_CRASH");
        }




    }
}
