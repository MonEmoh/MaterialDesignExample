package com.example.qvietd.materialdesignexample.Bai4AppBarLayoutCollapsingToolbarLayout.AppBarLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.qvietd.materialdesignexample.R;

public class CollapsingToolbarLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toobarCollapsing);
    }
}
