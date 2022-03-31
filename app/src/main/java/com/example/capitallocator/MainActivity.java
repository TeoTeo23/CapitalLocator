package com.example.capitallocator;

import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapper map = new Mapper();
        map.regionInject();
        EditText input = findViewById(R.id.regionInput);
        TextView output = findViewById(R.id.Capital);
        Button push = findViewById(R.id.Push);
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String region = input.getText().toString();
                if(!map.isInMap(region))
                    output.setText("ERROR");
                else
                    output.setText(map.seek(region));
            }
        });
    }
}