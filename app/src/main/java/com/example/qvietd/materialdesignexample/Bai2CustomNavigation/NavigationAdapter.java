package com.example.qvietd.materialdesignexample.Bai2CustomNavigation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qvietd.materialdesignexample.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by qvietd on 28-04-17.
 */

public class NavigationAdapter extends RecyclerView.Adapter<NavigationAdapter.MyViewHolder>{

    private List<NavigationDrawerItem>mDataList= Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;

    public NavigationAdapter(List<NavigationDrawerItem> mDataList, Context context) {
        this.mDataList = mDataList;
        this.context = context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.nav_drawer_item,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NavigationDrawerItem item=mDataList.get(position);
        holder.imgIcon.setImageResource(item.getImageId());
        holder.title.setText(item.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show();
            }
        });
    }   

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView imgIcon;
        public MyViewHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.title);
            imgIcon=(ImageView)itemView.findViewById(R.id.imgIcon);
        }
    }
}
