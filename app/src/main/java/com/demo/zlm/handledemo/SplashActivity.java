package com.demo.zlm.handledemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.lang.ref.WeakReference;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startMainActivity();
                finish();
            }
        },3000);
    }
    private Handler handler=new Handler();
    private void startMainActivity()
    {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
//    private Myhandle myhandle=new Myhandle(this);
//    private static class Myhandle extends Handler
//    {
//        private WeakReference<SplashActivity> weak;
//        public Myhandle(SplashActivity activity)
//        {
//            weak=new WeakReference<SplashActivity>(activity);
//        }
//        @Override
//        public void handleMessage(Message msg) {
//            if(weak!=null)
//            {
//
//            }
//        }
//    }

}
