package com.ivanvasilevich.myweather_v02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button enterACity;
    private TextView city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterACity = findViewById(R.id.button);
        enterACity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChooseCityActivity.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        city = findViewById(R.id.city);
        String messageCity =intent.getStringExtra(ChooseCityActivity.EXTRA_MESSAGE);
        city.setText(messageCity);
    }
}
