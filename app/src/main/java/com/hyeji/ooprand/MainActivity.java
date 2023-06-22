package com.hyeji.ooprand;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements JavaneseAppView.OnQuadrantTouchListener {

    private JavaneseAppView appView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        appView = new JavaneseAppView(this);
        appView.setOnQuadrantTouchListener(this);
        setContentView(appView);
    }

    @Override
    public void onAllQuadrantsTouched(float touchPercentage) {
        String message = "Percentage of 1s: " + touchPercentage + "%";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onQuadrantTouched(int touchValue) {
        Toast.makeText(this, "Sum of values: " + touchValue, Toast.LENGTH_SHORT).show();
    }
}