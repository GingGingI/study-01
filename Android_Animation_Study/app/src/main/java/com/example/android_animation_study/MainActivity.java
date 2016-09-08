package com.example.android_animation_study;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity{
    int x1,x2,b=0;
    Animation Ani1,Ani2;
    LinearLayout Lay0,Lay1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ani1 = AnimationUtils.loadAnimation(this, R.anim.ani_appear);
        Ani2 = AnimationUtils.loadAnimation(this, R.anim.ani_disappear);
        Lay0 = (LinearLayout)findViewById(R.id.Lay0);
        Lay1 = (LinearLayout)findViewById(R.id.Lay1);
    }

    private View.OnTouchListener mTouchEvent = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {

            int action = event.getAction();
            if (action == MotionEvent.ACTION_DOWN)
            {
                x1 = (int)event.getX();
                b=1;

           }else if (action == MotionEvent.ACTION_UP)
            {
                x2 = (int)event.getX();
                b=0;
            }
            return true;
        }
    };
}