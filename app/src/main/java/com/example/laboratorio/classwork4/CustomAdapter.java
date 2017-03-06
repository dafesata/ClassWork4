
package com.example.laboratorio.classwork4;

import android.content.Context;
import android.util.StringBuilderPrinter;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Laboratorio on 06/03/2017.
 */

public class CustomAdapter extends BaseAdapter{

    private Context context;
    private String[] data;
    private View view;
    public CustomAdapter(Context context,String[] values){
        this.context=context;
        this.data=values;

    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return data[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        String text = data[i];
        if (view==null){
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.row,null);
        }
        TextView tv= (TextView) view.findViewById(R.id.DefaultValue);
        Button button =(Button) view.findViewById(R.id.Editar);
        button.setFocusable(false);
        button.setFocusableInTouchMode(false);
        button.setTag(i);
        tv.setText(text);
        return view;
    }

    public void setData(String[] values){
        this.data=values;
    }
}
