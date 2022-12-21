package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {
    private CheckBox cb1, cb2, cb3;
    private Button bt;
    private Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);

        bt = findViewById(R.id.buttonCheck);

        sp1 = findViewById(R.id.spinner);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cb1.isChecked()){
                    Toast.makeText(getApplicationContext(),"CheckBox 1 marcado", Toast.LENGTH_SHORT).show();
                }
                if (cb2.isChecked()){
                    Toast.makeText(getApplicationContext(),"CheckBox 2 marcado", Toast.LENGTH_SHORT).show();
                }
                if (cb3.isChecked()){
                    Toast.makeText(getApplicationContext(),"CheckBox 3 marcado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ArrayList<String> dadosSpinner = new ArrayList<>();
        dadosSpinner.add("Opção 1");
        dadosSpinner.add("Opção 2");
        dadosSpinner.add("Opção 3");
        dadosSpinner.add("Opção 4");
        dadosSpinner.add("Opção 5");

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item,dadosSpinner);

        sp1.setAdapter(spinnerArrayAdapter);
        sp1.setOnItemSelectedListener(ouvinteSpinner);
    }

    AdapterView.OnItemSelectedListener ouvinteSpinner = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            if (i==2){
                Toast.makeText(MainActivity5.this,"Opção 3", Toast.LENGTH_SHORT).show();

            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
}