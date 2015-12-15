package com.example.test;

import com.example.test.business.SubProcess;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.TextureView;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView)this.findViewById(R.id.txt);
        SubProcess subProcess = new SubProcess();
//        txt.setText("txt");
        txt.setText(subProcess.getHello());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
