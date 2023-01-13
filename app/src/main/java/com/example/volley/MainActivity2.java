package com.example.volley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Objects.requireNonNull(getSupportActionBar()).hide();

    }



    public void google(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.linkedin.com/in/kshitij-pratap-tomer-608833225/"));

        startActivity(intent);

    }
}