package harshit.animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView iv = (ImageView) findViewById(R.id.imageView);

      iv.setBackgroundResource(R.drawable.myframe);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationDrawable anim = (AnimationDrawable) iv.getBackground();
                anim.start();
                anim.isRunning();


            }
        });




    }
    public void animateMe(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.tween_animation);
        view.startAnimation(animation);
    }}
