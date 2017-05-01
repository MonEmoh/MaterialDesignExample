package com.example.qvietd.materialdesignexample.Bai5TabsLayOut.CustomTabs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Adapter.CustomTabAdapters;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Fragment.OneFragment;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Fragment.ThreeFragment;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Fragment.TwoFragment;
import com.example.qvietd.materialdesignexample.R;

import java.util.ArrayList;
import java.util.List;

public class CustomTabsActivity extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    private ViewPager viewPager;
    private CustomTabAdapters adapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tabs);
        //
        initView();
        prepareData();
        //
        adapter=new CustomTabAdapters(getSupportFragmentManager(),fragmentList,titleList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        setCustomViewForTab();
    }
    private void setCustomViewForTab(){
        setCustomViewForTabs(0, "WALL", "TAB ONE");
        setCustomViewForTabs(1, "CHAT", "TAB TWO");
        setCustomViewForTabs(2, "PROFILE", "TAB THREE");
    }

    private void setCustomViewForTabs(int position, String title, String subtitle) {
        LinearLayout tabView=(LinearLayout) LayoutInflater.from(this).inflate(R.layout.bai5_customtabs_item,null);

        TextView txtTitle=(TextView)tabView.findViewById(R.id.tabTextTitle);
        txtTitle.setText(title);
        TextView txtSubTitle=(TextView)tabView.findViewById(R.id.tabTextSubTitle);
        txtSubTitle.setText(subtitle);
        tabLayout.getTabAt(position).setCustomView(tabView);
    }

    private void initView() {
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbarCustomTab);
        toolbar.setTitle("Custom Tab");
        viewPager=(ViewPager)findViewById(R.id.viewPager_customtab);
        tabLayout=(TabLayout)findViewById(R.id.tabs_custom);
    }
    private void prepareData() {
        addData(new OneFragment(), "ONE");
        addData(new TwoFragment(), "TWO");
        addData(new ThreeFragment(), "THREE");
    }
    private void addData(Fragment fragment,String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
