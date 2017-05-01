package com.example.qvietd.materialdesignexample.Bai6RecyclerView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import com.example.qvietd.materialdesignexample.Bai6RecyclerView.Adapter.Bai6RecyclerAdapter;
import com.example.qvietd.materialdesignexample.R;

public class RecyclerViewCardViewDemo extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_card_view_demo);
        toolbar=(Toolbar)findViewById(R.id.toolbar_bai6);
        toolbar.setTitle("RecyclerDemo");
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView_bai6);
        Bai6RecyclerAdapter adapter=new Bai6RecyclerAdapter(this,Landscape.getData());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(LinearLayout.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter.notifyDataSetChanged();
    }
}
