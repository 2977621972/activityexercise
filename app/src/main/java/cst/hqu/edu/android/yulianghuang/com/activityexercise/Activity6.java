package cst.hqu.edu.android.yulianghuang.com.activityexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class Activity6 extends AppCompatActivity {

    GridLayout gridLayout;
    String[] chars = new String[]{
            "1","2","3",
            "4","5","6",
            "7","8","9",
            "0","+","-",
            ".","/","=",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.six_layout);
        gridLayout = (GridLayout) findViewById(R.id.gri);
        for(int i=0;i<chars.length;i++){
            Button bn = new Button(this);
            bn.setText(chars[i]);
            bn.setTextSize(40);
            bn.setPadding(5,35,5,35);
            GridLayout.Spec rowSpec = GridLayout.spec(i/3);
            GridLayout.Spec conlumnSpec = GridLayout.spec(i%3);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,conlumnSpec);
            params.setGravity(Gravity.FILL);
            gridLayout.addView(bn,params);
        }
        Button button21=(Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
