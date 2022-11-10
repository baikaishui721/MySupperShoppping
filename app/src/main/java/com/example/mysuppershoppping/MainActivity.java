package com.example.mysuppershoppping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//访问资源的三种方式：1、布局R.layout
                                               //2、R.id   3、R.string
        TextView textViewHelloWorld=this.findViewById(R.id.text_hello_world);//定义TextView控件
        textViewHelloWorld.setText("test");

        //textViewHelloWorld.setText(R.string.string_hello_world2);//把字符串的资源id作为一个参数传递

        String strHelloWorld2=this.getResources().getText(R.string.string_hello_world2).toString();
        Log.i("MainActivity",strHelloWorld2);//红色表示未引用，按Alt+Enter
        //textViewHelloWorld.setText(strHelloWorld2);

    }
}