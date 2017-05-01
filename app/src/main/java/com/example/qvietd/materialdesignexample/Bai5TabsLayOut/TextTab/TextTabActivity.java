package com.example.qvietd.materialdesignexample.Bai5TabsLayOut.TextTab;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Adapter.TextTabAdapter;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Fragment.OneFragment;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Fragment.ThreeFragment;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.Fragment.TwoFragment;
import com.example.qvietd.materialdesignexample.R;

import java.util.ArrayList;
import java.util.List;

public class TextTabActivity extends AppCompatActivity {

    private List<Fragment>fragmentList=new ArrayList<>();
    private List<String>titleList=new ArrayList<>();
    //
    private ViewPager viewPager;
    private TextTabAdapter adapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tab);
        initWidget();
        prepareData();
        adapter=new TextTabAdapter(getSupportFragmentManager(),fragmentList,titleList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        setIConTab();

    }
    private void initWidget() {
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbarTextTab);
        toolbar.setTitle("Text Tab");
        viewPager=(ViewPager)findViewById(R.id.viewpager_bai5);
        tabLayout=(TabLayout) findViewById(R.id.tabs);

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
    private void setIConTab(){
        tabLayout.getTabAt(0).setIcon(R.mipmap.ic_launcher);
        tabLayout.getTabAt(1).setIcon(R.mipmap.ic_launcher);
        tabLayout.getTabAt(2).setIcon(R.mipmap.ic_launcher);
    }
}
