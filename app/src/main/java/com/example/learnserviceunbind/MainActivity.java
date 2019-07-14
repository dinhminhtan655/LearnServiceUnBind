package com.example.learnserviceunbind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void PlayService(View view) {
        Intent i = new Intent(MainActivity.this,MyService.class);
        this.startService(i);
    }

    public void StopService(View view) {
        Intent i = new Intent(MainActivity.this,MyService.class);
        this.stopService(i);
    }
}
