package com.example.qvietd.materialdesignexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.qvietd.materialdesignexample.Bai1Navigation.NavigationDemo;
import com.example.qvietd.materialdesignexample.Bai2CustomNavigation.CustomNavigationActivity;
import com.example.qvietd.materialdesignexample.Bai3FloatLableEditText.FloatLableEditText;
import com.example.qvietd.materialdesignexample.Bai4AppBarLayoutCollapsingToolbarLayout.AppBarLayout.AppBarLayout;
import com.example.qvietd.materialdesignexample.Bai4AppBarLayoutCollapsingToolbarLayout.AppBarLayout.CollapsingToolbarLayout;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.CustomTabs.CustomTabsActivity;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.ScrollTabs.ScrollTabsActivity;
import com.example.qvietd.materialdesignexample.Bai5TabsLayOut.TextTab.TextTabActivity;
import com.example.qvietd.materialdesignexample.Bai6RecyclerView.MultiViewRecycler.Bai6MultiViewrecycler;
import com.example.qvietd.materialdesignexample.Bai6RecyclerView.RecyclerViewCardViewDemo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void navigation(View view){
        Intent intent=new Intent(this, NavigationDemo.class);
        startActivity(intent);
    }
    public void customnavigation(View view){
        Intent intent=new Intent(this, CustomNavigationActivity.class);
        startActivity(intent);
    }
    public void floatLableEditText(View view){
        Intent intent=new Intent(this, FloatLableEditText.class);
        startActivity(intent);
    }
    public void openbai4(View view){
        //Khi scroll view thi toolbar se an di
        Intent intent=new Intent(this, AppBarLayout.class);
        startActivity(intent);
    }
    public void openToolbarCollapsing(View view){
        Intent intent=new Intent(this, CollapsingToolbarLayout.class);
        startActivity(intent);
    }
    public void bai5TextTab(View view){
        Intent intent=new Intent(this, TextTabActivity.class);
        startActivity(intent);
    }
    public void scrollTabs(View view){
        Intent intent=new Intent(this, ScrollTabsActivity.class);
        startActivity(intent);
    }
    public void customTabs(View view){
        Intent intent=new Intent(this, CustomTabsActivity.class);
        startActivity(intent);
    }
    public void openRecycler(View view){
        Intent intent=new Intent(this, RecyclerViewCardViewDemo.class);
        startActivity(intent);
    }
    public void multiRowRecyler(View view){
        Intent intent=new Intent(this, Bai6MultiViewrecycler.class);
        startActivity(intent);
    }
}
