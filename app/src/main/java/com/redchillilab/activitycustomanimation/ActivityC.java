package com.redchillilab.activitycustomanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    public void intentA(View view) {
        startActivity(new Intent(this,ActivityA.class));
    }

    public void intentB(View view) {
        startActivity(new Intent(this,ActivityB.class));
    }
}
