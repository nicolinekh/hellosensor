package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button compassButton;
    private Button accelerometersButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compassButton =(Button) findViewById(R.id.button1);
        accelerometersButton = (Button) findViewById(R.id.button);


        compassButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            getCompass();
            }
        });

        accelerometersButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            getAccelerometers();

        }
        });
    }
    public void getAccelerometers(){
        Intent intent = new Intent(this,DisplayAccelerometers.class);
        startActivity(intent);
    }
    public void getCompass(){
    Intent intent2 = new Intent (this, DisplayCompassActivity.class);
     startActivity(intent2);
    }

}