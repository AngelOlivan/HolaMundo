package com.example.usuario.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener{

    Button btnSaludo;
    Button btnSaludo2;
    TextView txtSaludo;
    TextView txtSaludo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludo = (Button) findViewById(R.id.btnSaludo);
        btnSaludo.setOnClickListener(this);

        btnSaludo2 = (Button) findViewById(R.id.btnSaludo);
        btnSaludo2.setOnLongClickListener(this);

    }

    public void onClick (View view){

        txtSaludo = (TextView) findViewById(R.id.txtSaludo);
        txtSaludo.setText(getString(android.R.txtClick));
    }

    public boolean onLongClick (View view){

        txtSaludo = (TextView) findViewById(R.id.txtSaludo);
        txtSaludo.setText(getString(android.R.txtLongClick));

        return true;
    }
}
