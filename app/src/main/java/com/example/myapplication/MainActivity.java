package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edNome;
    private Button bt1;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNome = findViewById(R.id.editNome);
        bt1 = findViewById(R.id.buttonRecNome);
        tv1 = findViewById(R.id.textViewNome);

    }

    public void funcaoJava(View n1){
        String nomeDigitado = edNome.getText().toString();
        tv1.setText("O nome digitado foi: " + nomeDigitado);
    }


}