package com.demo.zlm.handledemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                Snackbar.make(view, "Replace with he own action", Snackbar.LENGTH_LONG)
=======
                Snackbar.make(view, "Replace with me own action", Snackbar.LENGTH_LONG)
>>>>>>> 813b0bed8af40bab854f7ecac4d5dd81915f2cc6
                        .setAction("Action", null).show();
            }
        });
    }

}
