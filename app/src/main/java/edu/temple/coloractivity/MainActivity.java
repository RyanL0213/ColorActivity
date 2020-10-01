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


        colorname = findViewById(R.id.Helloworld);
        colorselection = findViewById(R.id.colorselection);


        color = new ArrayList<>();
        color.add("Choose a color");
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

        colorselection.setAdapter(adapter);
        View currentLayout = findViewById(R.id.currentlayout);


        colorselection.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                View currentLayout = findViewById(R.id.currentlayout);
                switch(adapterView.getItemAtPosition(i).toString()){
                    case "Choose a color":
                        currentLayout.setBackgroundColor(Color.WHITE);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    case "Red":
                        currentLayout.setBackgroundColor(Color.RED);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    case "Black":
                        currentLayout.setBackgroundColor(Color.BLACK);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    case "Blue":
                        currentLayout.setBackgroundColor(Color.BLUE);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    case "Cyan":
                        currentLayout.setBackgroundColor(Color.CYAN);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    case "Dark Grey":
                        currentLayout.setBackgroundColor(Color.DKGRAY);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    case "White":
                        currentLayout.setBackgroundColor(Color.WHITE);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    case "Green":
                        currentLayout.setBackgroundColor(Color.GREEN);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    case "Light Grey":
                        currentLayout.setBackgroundColor(Color.LTGRAY);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    case "Magenta":
                        currentLayout.setBackgroundColor(Color.MAGENTA);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    case "Yellow":
                        currentLayout.setBackgroundColor(Color.YELLOW);
                        view.setBackgroundColor(Color.WHITE);
                        break;
                    default:
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

}