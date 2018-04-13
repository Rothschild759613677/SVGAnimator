package com.it.testmodule;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * SVG矢量图动画的实现
 * 1、矢量图的使用
 * 2、把一个矢量图画出来的动画
 */
public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mImageView = (ImageView) findViewById(R.id.imageView);

        //得到对应的AnimatedVectorDrawable对象-矢量图动画的对象
        AnimatedVectorDrawable mAnimatedVectorDrawable =
                (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.heart_vector_animator);

        //把矢量图设置到ImageView上
        mImageView.setImageDrawable(mAnimatedVectorDrawable);

        //开启动画
        if (mAnimatedVectorDrawable != null) {
            mAnimatedVectorDrawable.start();
        }
    }
}
