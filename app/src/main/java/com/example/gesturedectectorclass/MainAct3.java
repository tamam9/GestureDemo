package com.example.gesturedectectorclass;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Yusuf on 2016/10/21.
 */

public class MainAct3 extends Activity implements View.OnTouchListener {

    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(getBaseContext());
        textView.setFocusable(true);
//        gestureDetector = new GestureDetector(new MyTouchListener());
        gestureDetector = new GestureDetector(new MyTouchListener2());
        textView.setOnTouchListener(this);
        setContentView(textView);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }


    public class MyTouchListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public void onShowPress(MotionEvent e) {
            super.onShowPress(e);
            Log.i("myGesture", "onShowPress");
        }
    }

    public class MyTouchListener2 implements GestureDetector.OnGestureListener {

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            Log.i("myGesture", "onDown");

            return false;
        }

        @Override
        public void onShowPress(MotionEvent motionEvent) {
            Log.i("myGesture", "onShowPress");

        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            Log.i("myGesture", "onSingleTapUp");

            return false;
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            Log.i("myGesture", "onScroll");

            return false;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {
            Log.i("myGesture", "onLongPress");

        }

        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            Log.i("myGesture", "onFling");

            return false;
        }
    }

}
