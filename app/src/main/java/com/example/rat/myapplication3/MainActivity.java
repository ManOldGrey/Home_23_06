package com.example.rat.myapplication3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // TextView textView = new TextView(this);
       // textView.setText("Hello");
       setContentView(R.layout.activity_main);
       // findViewById(R.id.some_id);
        View view =findViewById(R.id.some_id1);
       // RelativeLayout relativLayout = (RelativeLayout) view.getParent();
        ViewGroup relativLayout = (ViewGroup) view.getParent();
        TextView texView = new TextView(this);

        view.setBackgroundColor(Color.BLUE);
    }
}
