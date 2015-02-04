package com.gravitybd.navigationtemplate;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.gravitybd.navigationtemplate.com.gravitybd.navigationtemplate.fragments.FragOne;
import com.gravitybd.navigationtemplate.com.gravitybd.navigationtemplate.fragments.FragTwo;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ListView listView;
    private ActionBarDrawerToggle mDrawerToggle;
    private CustomAdapter customAdapter;
    android.app.Fragment frag;
    android.app.FragmentTransaction fragTran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        mDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawerOpen, R.string.drawerClose){


            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        drawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        listView = (ListView) findViewById(R.id.listItems);
        listView.setOnItemClickListener(this);

        customAdapter = new CustomAdapter(this);
        listView.setAdapter(customAdapter);

        frag = new FragOne();
        fragTran = getFragmentManager().beginTransaction().add(R.id.container, frag);

        fragTran.commit();
   }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String[] item;
        item = this.getResources().getStringArray(R.array.items);





        switch(position) {
            case 0:
                Toast.makeText(getApplicationContext(),item[position], Toast.LENGTH_LONG).show();
                getSupportActionBar().setTitle(item[position]);
                frag = new FragOne();
                fragTran = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTran.commit();
                drawerLayout.closeDrawers();
                break;
            case 1:
                Toast.makeText(getApplicationContext(),item[position], Toast.LENGTH_LONG).show();
                frag = new FragTwo();
                fragTran = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTran.commit();
                getSupportActionBar().setTitle(item[position]);
                drawerLayout.closeDrawers();

                break;
            case 2:
                Toast.makeText(getApplicationContext(),item[position], Toast.LENGTH_LONG).show();
                getSupportActionBar().setTitle(item[position]);
                drawerLayout.closeDrawers();
                break;
            case 3:
                Toast.makeText(getApplicationContext(),item[position], Toast.LENGTH_LONG).show();
                getSupportActionBar().setTitle(item[position]);
                drawerLayout.closeDrawers();
                break;
            default:

                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_howto) {

            startActivity(new Intent(getApplicationContext(), AboutActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

}
