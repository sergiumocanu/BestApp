package com.example.bestapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by sergi on 2016-11-28.
 */

public class SelfieCamera extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selfiecamera);
    }

    public void onGoBack(View view) {
        Intent goBack = new Intent(this, MainActivity.class);
        goBack.putExtra("GoingBack", "ColourCamera");
        startActivity(goBack);

        finish();
    }
}
