package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity{
    private EditText ed1, ed2;
    private RadioGroup rg1;
    private TextView tv1;
    private double n1, n2, res=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ed1 = findViewById(R.id.editTextN1Rg);
        ed2 = findViewById(R.id.editTextN2Rg);
        rg1 = findViewById(R.id.radioGroup);
        tv1 = findViewById(R.id.textViewRg);

        rg1.setOnCheckedChangeListener(meuOuvinte);

        Intent intent2 = getIntent();
        String textoTela1 = String.valueOf(intent2.getSerializableExtra("string1"));

        tv1.setText(textoTela1);


    }

    RadioGroup.OnCheckedChangeListener meuOuvinte = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if(verificado()){
                n1 = Double.parseDouble(ed1.getText().toString());
                n2 = Double.parseDouble(ed2.getText().toString());

                switch(i){
                    case R.id.radioButton:
                        res = n1 +n2;
                        break;
                    case R.id.radioButton2:
                        res = n1 -n2;
                        break;
                    case R.id.radioButton3:
                        res = n1 *n2;
                        break;
                    case R.id.radioButton4:
                        res = n1 /n2;
                        break;
                }
                tv1.setText("Resultado: " + String.format("%.2f", res));



            }
        }
    };


    private boolean verificado() {
        boolean retorno = true;
        if(ed1.getText().toString().length() == 0){
            ed1.setError("Digite um número.");
            retorno = false;
        }
        if(ed2.getText().toString().length() == 0){
            ed2.setError("Digite um número.");
            retorno = false;
        }
        return retorno;
    }
}