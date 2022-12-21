package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity4 extends ListActivity {

    private static final String [] ITENS = new String[]{"OPÇÃO 1","OPÇÃO 2","OPÇÃO 3","OPÇÃO 4"};
    private ArrayAdapter<String> mAdaptador;
    Intent intent;
    String string1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main4);

        mAdaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ITENS);

        setListAdapter(mAdaptador);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if (position==0){
            Toast.makeText(this,"OPÇÃO 1", Toast.LENGTH_SHORT).show();
        }
        if (position==1){
            intent = new Intent(MainActivity4.this,MainActivity3.class);
            string1 = "Texto da tela 1";

            intent.putExtra("string1", string1);
            startActivity(intent);
            //finish();
        }
        if (position==2){
            AlertDialog.Builder janelaDialogo;
            janelaDialogo = new AlertDialog.Builder(MainActivity4.this);

            janelaDialogo.setTitle("Janela de Diálogo");
            janelaDialogo.setMessage("Você clicou na opção 3");
            janelaDialogo.setNeutralButton("OK", null);

            janelaDialogo.show();
        }
        if (position==3){
            intent = new Intent(MainActivity4.this,MainActivity5.class);
            startActivity(intent);

        }
    }
}