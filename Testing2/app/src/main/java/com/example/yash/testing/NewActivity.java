package com.example.yash.testing;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends MainActivity {
    static Integer n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_main, null, false);
        drawer.addView(contentView, 0);
        View newView = inflater.inflate(R.layout.activity_new, null, false);
        drawer.addView(newView);
        setContentView(drawer);
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 TextView textView= (TextView) findViewById(R.id.textView2);
                 n++;
                 textView.setText(n.toString());
            }
        });
    }
}
