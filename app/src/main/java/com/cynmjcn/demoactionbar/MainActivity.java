package com.cynmjcn.demoactionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.options,menu);
    return  super.onCreateOptionsMenu(menu);
}
}