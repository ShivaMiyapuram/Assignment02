package com.example.s528748.assignment02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static String str = "";
    public static ArrayList<String> arr = new ArrayList<>();
    public static String[] elements = {"H","O", "Na", "Cl", "K", "He", "C", "Se", "Po"};
    public void onClick(View v){
        int id = v.getId();
        Button b = (Button) findViewById(id);
        EditText et = (EditText) findViewById(R.id.editText);
        String symbol = b.getText().toString();
        arr.add(symbol);
        str+= symbol;
        et.setText(str);
    }

    public void onReset(View v){
        EditText et = (EditText) findViewById(R.id.editText);
        str = "";
        et.setText(str);
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText("");
        arr.clear();
    }

    public void onCalculate(View v) {
        String a[] = (String[]) arr.toArray(new String[arr.size()]);
        int count[] = new int[9];

        for (String temp : a) {
            switch (temp) {
                case "H": count[0]++;
                            break;
                case "O": count[1]++;
                            break;
                case "Na": count[2]++;
                            break;
                case "Cl": count[3]++;
                            break;
                case "K": count[4]++;
                            break;
                case "He": count[5]++;
                            break;
                case "C": count[6]++;
                            break;
                case "Se": count[7]++;
                            break;
                case "Po": count[8]++;
                            break;
            }
        }
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText("");
        str = "";

        String s = "";
       /* int i = 0;
        for(String temp: a){
            if(count[i] == 1) {
                s += elements[i];
                i++;
            }
            else if(count[i] > 1 ){
                s += elements[i] + count[i] + "";
                i++;
            }

        }   */
            for (int i = 0; i < count.length; i++) {
                if (count[i] == 1) {
                    s += elements[i];
                } else if (count[i] > 1) {
                    s += elements[i] + count[i] + "";
                }
                System.out.println(s);
            }

        tv.setText(s);
         arr.clear();
    }
}
