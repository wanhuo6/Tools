package com.ahuo.tools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.ahuo.tool.imageloader.GlideLoaderUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GlideLoaderUtil.loadFullWidthImage(this,"",1,new ImageView(this));
    }
}
