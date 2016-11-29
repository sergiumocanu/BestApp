package com.example.bestapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.nfc.Tag;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.google.atap.tangoservice.Tango;
import com.google.atap.tangoservice.TangoCameraIntrinsics;
import com.google.atap.tangoservice.TangoCameraPreview;
import com.google.atap.tangoservice.TangoConfig;
import com.google.atap.tangoservice.TangoCoordinateFramePair;
import com.google.atap.tangoservice.TangoErrorException;
import com.google.atap.tangoservice.TangoEvent;
import com.google.atap.tangoservice.TangoInvalidException;
import com.google.atap.tangoservice.TangoOutOfDateException;
import com.google.atap.tangoservice.TangoPointCloudData;
import com.google.atap.tangoservice.TangoPoseData;
import com.google.atap.tangoservice.TangoXyzIjData;
import com.google.atap.tangoservice.experimental.TangoImageBuffer;

import java.io.File;

public class MainActivity extends Activity {
    ImageView image;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void openColour(View view){
        Intent goToColourIntent = new Intent(this, ColourCamera.class);
        final int result = 1;

        goToColourIntent.putExtra("callingColour", "MainActivity");
        startActivityForResult(goToColourIntent, result);

    }

    public void openFish(View view) {
        Intent goToFishIntent = new Intent(this, FishEyeCamera.class);
        final int result = 1;

        goToFishIntent.putExtra("callingFish", "MainActivity");
        startActivityForResult(goToFishIntent, result);
    }

    public void openSelfie(View view) {
        Intent goToSelfieIntent = new Intent(this, SelfieCamera.class);
        final int result = 1;

        goToSelfieIntent.putExtra("callingSelfie", "MainActivity");
        startActivityForResult(goToSelfieIntent, result);
    }
}


