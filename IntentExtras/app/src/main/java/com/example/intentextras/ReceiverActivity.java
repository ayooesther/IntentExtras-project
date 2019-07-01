package com.example.intentextras;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {
    TextView tvName;
    TextView tvAge;
    String names;
    String ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvName=findViewById(R.id.tvName);
        tvAge= findViewById(R.id.tvAge);
        Bundle extras =getIntent().getExtras();
        if (extras!=null){
            String names=extras.getString("etName");
            String ages=extras.getString("etAge");
            tvName.setText(names);
            tvAge.setText(ages);
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
