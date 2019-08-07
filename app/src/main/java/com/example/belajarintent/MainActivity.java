package com.example.belajarintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button exIntent, imIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exIntent = findViewById(R.id.explicitIntent);
        exIntent.setOnClickListener(this);
        imIntent = findViewById(R.id.implicitIntent);
        imIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explicitIntent:
                Intent exIntent = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(exIntent);
                break;
            case R.id.implicitIntent:
                Intent imIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3school.com"));
                startActivity(imIntent);
                break;
        }
    }
}
