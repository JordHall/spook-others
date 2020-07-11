package com.jordhall.spookothers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Components
        final Button button = findViewById(R.id.btnSpook);
        final TextView txtOutput = findViewById(R.id.txtOutput);
        final Button resetBtn = findViewById(R.id.btnReset);
        //Spook button onClick
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                txtOutput.setText(String.valueOf(count));
            }
        });
        //Reset button onClick
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                txtOutput.setText("0");
            }
        });
    }
}
