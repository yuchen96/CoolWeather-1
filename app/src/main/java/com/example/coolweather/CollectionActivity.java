package com.example.coolweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class CollectionActivity extends AppCompatActivity {
   private ListView mList;
   private List<String> data;
   private Button setButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        Button setButton = (Button) findViewById(R.id.set_button);

        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(CollectionActivity.this,WeatherActivity.class);
                startActivity(intent);
            }
        });
    }
}
