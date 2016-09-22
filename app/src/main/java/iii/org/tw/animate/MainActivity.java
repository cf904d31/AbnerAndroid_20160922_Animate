package iii.org.tw.animate;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private ImageView img ;
    private ObjectAnimator animator;
    private ObjectAnimator animator2;
    private ObjectAnimator animator3;
    private LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.img);
        linear = (LinearLayout) findViewById(R.id.linear);
        linear.setX(-400);
    }

    public void test1(View v) {
        animator = ObjectAnimator.ofFloat(img,"x",0,100,200,300,400);
        animator.setDuration(4*1000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.start();
    }

    public void test2(View v) {
        animator = ObjectAnimator.ofFloat(img,"y",0,100,200,300,400,500,600,700,800,900,1000);
        animator.setDuration(4*1000);
        animator.start();
    }

    public void test3(View v) {
        animator = ObjectAnimator.ofFloat(linear,"x",-400,0);

        animator2 = ObjectAnimator.ofFloat(linear,"alpha",0,1);

        AnimatorSet set = new AnimatorSet();
        set.setDuration(2*1000);
        set.playTogether(animator,animator2);
        set.start();

    }

    public void test4(View v) {
//        animator = ObjectAnimator.ofFloat(img,"rotaionX",0f,360f);
//
//        animator2 = ObjectAnimator.ofFloat(img,"alpha",0,1);

        animator = ObjectAnimator.ofFloat(img, "rotationX", 0f,360f,0f,360f,0f,360f,0f);
        animator2 = ObjectAnimator.ofFloat(img, "rotationY", 0f,360f,0f,360f,0f,360f,0f);

        AnimatorSet set = new AnimatorSet();
        set.setDuration(2*1000);
        set.playTogether(animator,animator2);
        set.start();

    }
}
