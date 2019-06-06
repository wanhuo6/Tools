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
        ImageView imageView=findViewById(R.id.ivPic);
        GlideLoaderUtil.loadNormalImage(this,"https://i1.whymtj.com/uploads/tu/201905/9999/c0a02826ba.jpg",-1,imageView);
    }
}
