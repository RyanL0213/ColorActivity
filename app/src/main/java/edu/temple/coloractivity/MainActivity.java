package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView colorname;
    ArrayList<String> color;
    Spinner colorselection;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View currentLayout =
                findViewById(R.id.currentlayout);


        currentLayout.setBackgroundColor(Color.RED);

        colorname = findViewById(R.id.Helloworld);
        colorselection = findViewById(R.id.colorselection);
        listview = findViewById(R.id.listview);


        color = new ArrayList<>();
        color.add("Red");
        color.add("Black");
        color.add("Blue");
        color.add("Cyan");
        color.add("Dark Grey");
        color.add("White");
        color.add("Green");
        color.add("Light Grey");
        color.add("Magenta");
        color.add("Yellow");

        final BaseAdapter adapter = new ColorAdapter(this,color);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            colorname.setText(adapterView.getItemAtPosition(i).toString());
            }
        });


    }

}