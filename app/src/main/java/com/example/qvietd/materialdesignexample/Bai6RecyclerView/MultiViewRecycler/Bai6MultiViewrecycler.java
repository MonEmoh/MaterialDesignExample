package com.example.qvietd.materialdesignexample.Bai6RecyclerView.MultiViewRecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.qvietd.materialdesignexample.Bai6RecyclerView.Adapter.Bai6MultiAdapter;
import com.example.qvietd.materialdesignexample.Bai6RecyclerView.Landscape;
import com.example.qvietd.materialdesignexample.R;

public class Bai6MultiViewrecycler extends AppCompatActivity {

    private RecyclerView recyclerView_multi;
    private Toolbar toolbar;
    private Bai6MultiAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6_multi_viewrecycler);
        toolbar=(Toolbar)findViewById(R.id.toolbar_bai6_view);
        toolbar.setTitle("MultiViewRecycler");
        setupRecycler();
    }

    private void setupRecycler() {
        recyclerView_multi=(RecyclerView)findViewById(R.id.recyclerView_bai6_view);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView_multi.setLayoutManager(linearLayoutManager);
        adapter=new Bai6MultiAdapter(this, Landscape.getData());
        recyclerView_multi.setAdapter(adapter);
        recyclerView_multi.setItemAnimator(new DefaultItemAnimator());
        adapter.notifyDataSetChanged();
    }
}
