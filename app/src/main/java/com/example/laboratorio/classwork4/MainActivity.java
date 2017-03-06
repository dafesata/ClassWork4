
package com.example.laboratorio.classwork4;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String TAG = "ElTagListView";
    private String[] materias;
    private ArrayList<String> materia=new ArrayList<String>();
    private int i=1;
    private CustomAdapter customAdapter;

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list=(ListView) findViewById(R.id.ListView1);
        materia.add(0,"Materia 1");
        materias= new String[]{ "Materia 1","","","","",""};

        //ArrayAdapter adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,materias);
        customAdapter =new CustomAdapter(this,materia);

         list.setAdapter(customAdapter);

       list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Log.d(TAG,"Click en "+i);
           }


       });


    }


    public void OnClickAdd(View view){
        materias[i]= "Materia "+(i+1);
        materia.add(i,"Materia "+(i+1));
        customAdapter = new CustomAdapter(this,materia);
        list.setAdapter(customAdapter);
        i++;
    }
    public void OnClickButtonRow(View view){
        Log.d(TAG,"Click en "+view.getTag());
        Intent i= new Intent(this,ActividadMateria.class);
        i.putExtra("value", new String());
        startActivity(i);
    }



}
