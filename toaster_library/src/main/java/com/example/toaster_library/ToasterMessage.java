package com.example.toaster_library;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

    public static double Result(double a,double b,char c)
    {
        switch (c){
            case '+':
                return  a+b;
            case '-':
                return a-b;
            case '*':
                return  a*b;
            case '/':
                return a/b;
        }
        return  0;
    }
 }
