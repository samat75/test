package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    Button btn;
    protected String edString;
    protected String ed2String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        btn = findViewById(R.id.btn);
        edString = ed1.getText().toString();
        ed2String = ed2.getText().toString();


        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                String s1 = ed1.getText().toString();
                String s2 = ed2.getText().toString();
                if (s1.isEmpty() && s2.isEmpty()) {


                    Toast.makeText(MainActivity.this, "Заполните оба поля", Toast.LENGTH_LONG).show();

                } else {
                    btn.setBackground(getDrawable(R.drawable.round));

                    Toast.makeText(MainActivity.this, "Добро пожаловать!!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}