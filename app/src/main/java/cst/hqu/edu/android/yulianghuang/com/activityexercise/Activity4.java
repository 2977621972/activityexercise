package cst.hqu.edu.android.yulianghuang.com.activityexercise;


import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Activity4 extends AppCompatActivity {
    private int viewPager= 0;
    final int[] imgs= new int[]{
            R.drawable.img_0035,
            R.drawable.img_0038,
            R.drawable.img_0184,
            R.drawable.img_0185,
            R.drawable.img_0186,
    };
    final int[] names=new int[]{
            R.id.image1,
            R.id.image2,
            R.id.image3,
            R.id.image4,
            R.id.image5,
    };
    ImageView[] views= new ImageView[names.length];
    @SuppressLint("HandlerLeak")
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg){
            if(msg.what==0x123){
                for (int i=0; i<names.length;i++) {
                    if (((i + viewPager) % names.length - 1) >= 0){
                        ImageView imageView1 = (ImageView)findViewById(names[(i + viewPager) % names.length - 1]);
                        imageView1.setVisibility(View.INVISIBLE);
                    }
                    else {
                        for (int j =0; j<5 ;j++){
                            ImageView imageView2 = (ImageView)findViewById(names[j]);
                            imageView2.setVisibility(View.INVISIBLE);
                        }
                    }
                    views[i].setImageResource(imgs[(i + viewPager) % names.length]);
                    ImageView imageView = (ImageView)findViewById(names[(i + viewPager) % names.length]);
                    imageView.setVisibility(View.VISIBLE);
                }
                viewPager++;
            }
            super.handleMessage(msg);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fou_layout);
        for (int i = 0;i < names.length;i++){
            views[i]=(ImageView) findViewById(names[i]);
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        },0,1500);
        Button button15=(Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
