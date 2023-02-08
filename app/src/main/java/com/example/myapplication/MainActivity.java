package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button3);
        editText=findViewById(R.id.editTextTextPersonName);
        textView=findViewById(R.id.textView5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hi  click listener worked", Toast.LENGTH_SHORT).show();
                String s=editText.getText().toString();
                Integer kg=Integer.parseInt(s);

                Double pound=kg*2.205;
                textView.setText("The corresponding pounds value is "+pound);
            }
        });

    }
}