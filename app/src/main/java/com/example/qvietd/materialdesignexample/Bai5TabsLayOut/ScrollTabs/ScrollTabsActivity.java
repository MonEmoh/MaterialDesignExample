package com.example.qvietd.materialdesignexample.Bai5TabsLayOut.ScrollTabs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Adapter.ScrollTabsAdapter;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Fragment.OneFragment;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Fragment.ThreeFragment;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Fragment.TwoFragment;
import com.example.qvietd.materialdesignexample.R;

import java.util.ArrayList;
import java.util.List;

public class ScrollTabsActivity extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
    //
    private ViewPager viewPager;
    private ScrollTabsAdapter adapter;
    private TabLayout tabLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_tabs);
        toolbar = (Toolbar) findViewById(R.id.toolbarScrollTab);
        toolbar.setTitle("Scroll Tabs");
        tabLayout=(TabLayout)findViewById(R.id.tab_scroll);
        viewPager=(ViewPager)findViewById(R.id.viewPager_scrollTab);
        prepareData();
        adapter=new ScrollTabsAdapter(getSupportFragmentManager(),fragmentList,titleList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void prepareData() {
        addData(new OneFragment(),"One");
        addData(new TwoFragment(),"Two");
        addData(new ThreeFragment(),"Three");
    }

    private void addData(Fragment fragment, String title) {
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
