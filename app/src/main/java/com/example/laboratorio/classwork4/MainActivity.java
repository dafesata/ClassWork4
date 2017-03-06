
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

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String TAG = "ElTagListView";

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list=(ListView) findViewById(R.id.ListView1);

        String[] materias= new String[]{ "Materia 1","Materia 2","Materia 3","Materia 4",
                "Materia 5","Materia 6","Materia 7","Materia 8","Materia 9","Materia 10"};

        //ArrayAdapter adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,materias);
        CustomAdapter customAdapter = new CustomAdapter(this,materias);

         list.setAdapter(customAdapter);

       list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Log.d(TAG,"Click en "+i);
           }


       });


    }
    public void OnClickButtonRow(View view){
        Log.d(TAG,"Click en "+view.getTag());
        Intent i= new Intent(this,ActividadMateria.class);
        i.putExtra("value", new String());
        startActivity(i);
    }



}
