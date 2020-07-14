package com.jordhall.spookothers;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Components
        final TextView txtTest = findViewById(R.id.txtTest);
        final Button btnSound1 = findViewById(R.id.btnSound1);
        final Button btnSound2 = findViewById(R.id.btnSound2);
        final Button btnSound3 = findViewById(R.id.btnSound3);
        final Button btnSound4 = findViewById(R.id.btnSound4);
        final MediaPlayer sounds = MediaPlayer.create(this, R.raw.test);
        //Sound 1 button onClick
        btnSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTest.setText(R.string.sound1);
                sounds.start();
            }
        });
        //Sound 2 button onClick
        btnSound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTest.setText(R.string.sound2);
            }
        });
        //Sound 3 button onClick
        btnSound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTest.setText(R.string.sound3);
            }
        });
        //Sound 4 button onClick
        btnSound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTest.setText(R.string.sound4);
            }
        });
    }
}
