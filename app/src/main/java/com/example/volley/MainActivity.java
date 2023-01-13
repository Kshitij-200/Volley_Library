package com.example.volley;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView2);
        Button button1 = findViewById(R.id.button1);
        Objects.requireNonNull(getSupportActionBar()).hide();

//        textView.setText("Your name is" + s);

//        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
//        Log.v("Test","User enter" + s);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                Toast.makeText(getApplicationContext(), "Hi your name is "  + name, Toast.LENGTH_LONG).show();
                textView.setText("Hi " +  name);

            }
        });
    }

    public void nayapage(View v){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}