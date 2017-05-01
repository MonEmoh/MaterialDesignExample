package com.example.qvietd.materialdesignexample.Bai2CustomNavigation;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.qvietd.materialdesignexample.R;

public class CustomNavigationActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_navigation);
        setUpToolbar();
        setUpDrawer();
    }

    private void setUpDrawer() {
        NavigationDrawerFragment drawerFragment=(NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(R.id.nav_drwr_fragment);
        DrawerLayout drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout_custom);
        drawerFragment.setUpDrawer(R.id.nav_drwr_fragment,drawerLayout,toolbar);

    }

    private void setUpToolbar() {
        toolbar=(Toolbar)findViewById(R.id.toolbar_customnavigation);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.menu_header_item);
    }
}
