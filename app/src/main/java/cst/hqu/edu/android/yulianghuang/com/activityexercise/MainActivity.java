package cst.hqu.edu.android.yulianghuang.com.activityexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fist_layout);
        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Toast.makeText(MainActivity.this, "You clicked 线性布局", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });
        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked 相对布局", Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent(MainActivity.this,Activity3.class);
                startActivity(intent);
            }
        });
        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked 帧布局", Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent(MainActivity.this,Activity4.class);
                startActivity(intent);
            }
        });
        Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked 表格布局", Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent(MainActivity.this,Activity5.class);
                startActivity(intent);
            }
        });
        Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked 网络布局", Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent(MainActivity.this,Activity6.class);
                startActivity(intent);
            }
        });
    }
}
