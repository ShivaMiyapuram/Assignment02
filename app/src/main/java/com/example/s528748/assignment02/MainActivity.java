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
    public static String[] elements = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S"};

    public void onClick(View v) {
        int id = v.getId();
        Button b = (Button) findViewById(id);
        EditText et = (EditText) findViewById(R.id.editText);
        String name = b.getText().toString();
        switch(name){
            case "Hydrogen":    arr.add(elements[0]);
                                str += elements[0];
                                break;
            case "Helium":      arr.add(elements[1]);
                                str += elements[1];
                                break;
            case "Lithium":     arr.add(elements[2]);
                                str += elements[2];
                                break;
            case "Beryllium":   arr.add(elements[3]);
                                str += elements[3];
                                break;
            case "Boron":       arr.add(elements[4]);
                                str += elements[4];
                                break;
            case "Carbon":      arr.add(elements[5]);
                                str += elements[5];
                                break;
            case "Nitrogen":    arr.add(elements[6]);
                                str += elements[6];
                                break;
            case "Oxygen":      arr.add(elements[7]);
                                str += elements[7];
                                break;
            case "Fluorine":    arr.add(elements[8]);
                                str += elements[8];
                                break;
            case "Neon":        arr.add(elements[9]);
                                str += elements[9];
                                break;
        }
        et.setText(str);

    }

    public void onReset(View v) {
        EditText et = (EditText) findViewById(R.id.editText);
        str = "";
        et.setText(str);
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText("");
        arr.clear();
    }

    public void onCalculate(View v) {
        String a[] = (String[]) arr.toArray(new String[arr.size()]);
        int count = 1;
        String s1 = "";
        for(int i=0; i < a.length; i++) {
            if (i + 1 < a.length) {
                if (a[i].equals(a[i + 1])) {
                    count++;
                } else {
                    if (count == 1)
                        s1 = s1 + a[i];
                    else
                        s1 = s1 + a[i] + count;
                    count = 1;
                }
            } else {
                if (count == 1)
                    s1 = s1 + a[i];
                else
                    s1 = s1 + a[i] + count;
                count = 1;
            }
        }

        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(s1);
        }


        //int count[] = new int[16];
       // int c1 = 1;
        //int count2 = 1;
     /*   String temp = "";
        String result = "";
        for(int i = 0; i < a.length - 1; i++ ){
            if(a[i].equals(a[i+1])){
                temp = a[i];
                if(c1 >= 2){

                }
                else {
                    c1++;
                    result = temp + c1;
                }
            }

        }

        */


    /*    for (String temp : a) {
            switch (temp) {

                case "Al":  count[0]++;
                            break;
                case "B":   count[1]++;
                            break;
                case "Be":  count[2]++;
                            break;
                case "C":   count[3]++;
                            break;
                case "F":   count[4]++;
                            break;
                case "H":   count[5]++;
                            break;
                case "He":  count[6]++;
                            break;
                case "Li":  count[7]++;
                            break;
                case "Mg":  count[8]++;
                            break;
                case "N":   count[9]++;
                            break;
                case "Na":  count[10]++;
                            break;
                case "Ne":  count[11]++;
                            break;
                case "O":   count[12]++;
                            break;
                case "P":   count[13]++;
                            break;
                case "S":   count[14]++;
                            break;
                case "Si": count[15]++;
                            break;


            }
        }
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText("");
        str = "";

        String s = "";
        */
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
         /*
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
    }   */
    }
