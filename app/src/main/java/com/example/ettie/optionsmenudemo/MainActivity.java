package com.example.ettie.optionsmenudemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.itemAdd:
                Toast.makeText(this, "Menu Item Clicked: Add", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemEdit:
                Toast.makeText(this, "Menu Item Clicked: Edit", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemDelete:
                Toast.makeText(this, "Menu Item Clicked: Delete", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemSearch:
                Toast.makeText(this, "Menu Item Clicked: Search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemHelp:
                Toast.makeText(this, "Menu Item Clicked: Edit", Toast.LENGTH_SHORT).show();
                return true;
            default: return false;
        }
    }
}
