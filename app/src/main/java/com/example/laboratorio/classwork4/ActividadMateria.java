
package com.example.laboratorio.classwork4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActividadMateria extends AppCompatActivity {
    private EditText nota1,nota2,nota3,nota4,def;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_materia);
        nota1 = (EditText) findViewById(R.id.Nota1Text);
        nota2 = (EditText) findViewById(R.id.Nota2Text);
        nota3 = (EditText) findViewById(R.id.Nota3Text);
        nota4 = (EditText) findViewById(R.id.Nota4Text);
        def = (EditText) findViewById(R.id.DefinitivaText);
    }

    public void OnClickCalcular(View v){
        double n1 = Double.parseDouble(nota1.getText().toString());
        double n2 = Double.parseDouble(nota2.getText().toString());
        double n3 = Double.parseDouble(nota3.getText().toString());
        double n4 = Double.parseDouble(nota4.getText().toString());
        double Def = (n1 *0.25)+(n2*0.25)+(n3*0.25)+(n4*0.25);

        def.setText(String.valueOf(Def));

    }

    public void OnClickBack(View v){
        Intent returnintent = new Intent();
        setResult(Activity.RESULT_OK, returnintent);
        finish();
    }
}
