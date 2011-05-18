package com.example.android;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;


public class MainActivity extends RoboActivity {

    @InjectView(R.id.text1)
    private TextView text1;

    @InjectView(R.id.edit1)
    private EditText edit1;


    @InjectView(R.id.button1)
    private Button button1;



    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.android.R.layout.main);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                text1.setText( "Hello, " + edit1.getText());
            }
        });
    }



}
