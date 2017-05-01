package com.example.qvietd.materialdesignexample.Bai4AppBarLayoutCollapsingToolbarLayout.AppBarLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.qvietd.materialdesignexample.R;

public class AppBarLayout extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar_bai4);
        toolbar.setTitle("App Bar Layout");
    }
}
