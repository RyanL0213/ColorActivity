package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {
    int colors[];
    Context context;
    ArrayList<String> color;


    public ColorAdapter(Context context, ArrayList<String> color){
        this.context = context;
        this.color = color;

        colors = new int[11];
        colors[0] = Color.WHITE;
        colors[1] = Color.RED;
        colors[2] = Color.BLACK;
        colors[3] = Color.BLUE;
        colors[4] = Color.CYAN;
        colors[5] = Color.DKGRAY;
        colors[6] = Color.WHITE;
        colors[7] = Color.GREEN;
        colors[8] = Color.LTGRAY;
        colors[9] = Color.MAGENTA;
        colors[10] = Color.YELLOW;
    }
    @Override
    public int getCount() {
        return color.size();
    }

    @Override
    public Object getItem(int i) {
        return color.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView textview;
        if(view==null){
            textview = new TextView(context);
            textview.setTextSize(20);
            textview.setPadding(8,8,8,8);
        }
        else
            textview = (TextView)view;

        textview.setText(getItem(i).toString());
        textview.setBackgroundColor(colors[i%colors.length]);

        return textview;
    }

    public View getDroppedDownView(int i, View view,ViewGroup viewGroup){
        View v = getView(i,view,viewGroup);
        v.setBackgroundColor(Color.WHITE);
        return v;
    }
}
