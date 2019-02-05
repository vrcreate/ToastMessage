package com.example.librarychecking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.toaster_library.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.s(getApplicationContext(),"Toast From Library");

        ToasterMessage.s(getApplicationContext(),ToasterMessage.Result(1.5,1.5,'+')+"");
        ToasterMessage.s(getApplicationContext(),ToasterMessage.Result(1.5,1.5,'-')+"");
        ToasterMessage.s(getApplicationContext(),ToasterMessage.Result(1.5,1.5,'*')+"");
        ToasterMessage.s(getApplicationContext(),ToasterMessage.Result(1.5,1.5,'/')+"");
    }
}
