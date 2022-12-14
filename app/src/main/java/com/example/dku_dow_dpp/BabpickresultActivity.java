package com.example.dku_dow_dpp;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BabpickresultActivity extends AppCompatActivity {
    ImageButton backbtn;
    Button returnbtn;
    TextView tv_name;
    TextView tv_time;
    String eng_name;
    ImageView place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babpickresult);

        Intent getstr = getIntent();

        String name = getstr.getStringExtra("getname");
        String time = getstr.getStringExtra("gettime");

        tv_name = findViewById(R.id.nametext);
        tv_name.setText(name);

        tv_time = findViewById(R.id.timetext);
        tv_time.setText(time);

        backbtn = findViewById(R.id.button);
        backbtn.setOnClickListener(view -> onBackPressed());

        eng_name = getstr.getStringExtra("eng_name");
        int iResId = getResources().getIdentifier( "@drawable/"+eng_name, "drawable", this.getPackageName() );
        place = findViewById(R.id.place);
        place.setImageResource(iResId);

        returnbtn = findViewById(R.id.return_btn);
        returnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BabpickresultActivity.this, BabpickselectActivity.class);

                startActivity(intent);
            }
        });


    }
}