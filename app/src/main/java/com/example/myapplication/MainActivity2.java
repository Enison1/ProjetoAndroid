package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity  implements View.OnClickListener{
    private Button btSoma, btSub, btMult, btDiv;
    private EditText edN1, edN2;
    private TextView tvRes;
    double num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btSoma = findViewById(R.id.buttonSoma);
        btSub = findViewById(R.id.buttonSub);
        btMult = findViewById(R.id.buttonMult);
        btDiv = findViewById(R.id.buttonDiv);

        edN1 = findViewById(R.id.editTextN1);
        edN2 = findViewById(R.id.editTextN2);

        tvRes = findViewById(R.id.textViewRes);

        btSoma.setOnClickListener(this);
        btSub.setOnClickListener(this);
        btMult.setOnClickListener(this);
        btDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (verificado()) {
            num1 = Double.parseDouble(edN1.getText().toString());
            num2 = Double.parseDouble(edN2.getText().toString());

            switch (view.getId()){
                case R.id.buttonSoma:
                    res = num1 + num2;
                    break;
                case R.id.buttonSub:
                    res = num1 - num2;
                    break;
                case R.id.buttonMult:
                    res = num1 * num2;
                    break;
                case R.id.buttonDiv:
                    res = num1 / num2;
                    break;
            }
            tvRes.setText("Resultado: " + String.format("%.2f",res));
        }
    }
    private boolean verificado(){
        boolean retorno = true;
        if(edN1.getText().toString().length() == 0){
            edN1.setError("Digite um número");
            retorno = false;
        }
        if(edN2.getText().toString().length() == 0){
            edN2.setError("Digite um número");
            retorno = false;
        }
        return retorno;
    }
}