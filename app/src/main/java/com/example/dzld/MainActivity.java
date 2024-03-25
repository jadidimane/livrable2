package com.example.dzld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText e1=findViewById(R.id.txtcin);
        EditText e2=findViewById(R.id.txtnom);
        EditText e3=findViewById(R.id.txtrenom);
        EditText e4=findViewById(R.id.txttel);
        EditText e5=findViewById(R.id.txtmail);
        EditText e6=findViewById(R.id.txtdate);


        Button b1 = findViewById(R.id.bc);
        Button b2 = findViewById(R.id.ba);
        TextView t1 = findViewById(R.id.textView2);

        b1.setOnClickListener(v -> t1.setText(e1.getText()+"/n"+e2.getText()+"/n"+e3.getText()+"/n"+e4.getText()+"/n"+e5.getText()+"/n"+e6.getText()+"/n"));


        b2.setOnClickListener(v -> {
            t1.setText("Au revoir");

        });
    }
}