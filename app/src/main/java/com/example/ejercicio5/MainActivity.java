package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        Button showToast = findViewById(R.id.buttonShowToast);
        Button countToast = findViewById(R.id.butonShowcount);
        TextView textView = findViewById(R.id.texto);

        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"hello toast", Toast.LENGTH_SHORT).show();
            }
        });


      countToast.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {


           Integer numero = Integer.parseInt(textView.getText().toString());
           numero++;
           textView.setText(numero.toString());
        }
    });
}
}