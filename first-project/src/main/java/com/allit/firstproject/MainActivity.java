package com.allit.firstproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvConsole;
    Button btAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvConsole = (TextView) findViewById(R.id.tvConsole);

        btAdd = (Button) findViewById(R.id.btAdd);
        btAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        tvConsole.append("Click sur bouton add\n");
    }
}