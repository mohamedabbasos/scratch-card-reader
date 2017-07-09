package com.example.dpteam.cardreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("Hello People!");
        //Toast.makeText(MainActivity.this,"Test toast",Toast.LENGTH_LONG).show();

        Button btn =(Button)findViewById(R.id.start);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello DP Team",Toast.LENGTH_LONG).show();
            }
        });
    }


}

