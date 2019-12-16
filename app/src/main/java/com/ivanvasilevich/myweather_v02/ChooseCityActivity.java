package com.ivanvasilevich.myweather_v02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class ChooseCityActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    public static final String EXTRA_MESSAGE = "Moscow";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_city);

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = findViewById(R.id.editText);
                String messageEditText = editText.getText().toString();
                Intent intent = new Intent(ChooseCityActivity.this,MainActivity.class);
                intent.putExtra(ChooseCityActivity.EXTRA_MESSAGE,messageEditText);
                startActivity(intent);
            }
        });
    }
}
