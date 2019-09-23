package com.example.drawfunction;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MathView(this,-1,0));
    }
    public void OnClick()
    {
        //super.onCreate(savedInstanceState);
        setContentView(new SinView(this));
    }
}

