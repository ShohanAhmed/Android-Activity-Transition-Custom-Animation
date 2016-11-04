package com.redchillilab.activitycustomanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    public void intentC(View view) {
        startActivity(new Intent(this,ActivityC.class));
    }

    public void intentA(View view) {
        startActivity(new Intent(this,ActivityA.class));
    }
}
