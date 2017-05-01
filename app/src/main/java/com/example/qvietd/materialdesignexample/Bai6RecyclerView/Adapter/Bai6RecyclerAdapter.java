package com.example.qvietd.materialdesignexample.Bai6RecyclerView.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qvietd.materialdesignexample.Bai6RecyclerView.Landscape;
import com.example.qvietd.materialdesignexample.R;

import java.util.List;

/**
 * Created by qvietd on 01-05-17.
 */

public class Bai6RecyclerAdapter extends RecyclerView.Adapter<Bai6RecyclerAdapter.MyViewHolder>{

    private static final String TAG=Bai6RecyclerAdapter.class.getSimpleName();
    private List<Landscape>landscapeList;
    private LayoutInflater inflater;

    public Bai6RecyclerAdapter(Context context,List<Landscape> landscapeList) {
        this.landscapeList = landscapeList;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i(TAG,"On Crreate View Holder");
        View view=inflater.inflate(R.layout.bai6_list_item_cardview,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.i(TAG,"on Bing View Holder: "+position);
        Landscape landscape=landscapeList.get(position);
        holder.setData(landscape,position);
        holder.setListener();
    }

    @Override
    public int getItemCount() {
        return landscapeList.size();
    }

    public void addItem(int position,Landscape landscape){
        landscapeList.add(position,landscape);
        notifyItemInserted(position);
        notifyItemRangeChanged(position,getItemCount());
        notifyDataSetChanged();
    }
    public void deleteItem(int position){
        landscapeList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position,getItemCount());
        notifyDataSetChanged();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvTitle;
        ImageView imgThumb, imgDelete, imgAdd;
        int position;
        Landscape current;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvTitle=(TextView)itemView.findViewById(R.id.tvTitle);
            imgThumb=(ImageView)itemView.findViewById(R.id.bai6_imgRow);
            imgDelete=(ImageView)itemView.findViewById(R.id.img_row_delete);
            imgAdd=(ImageView)itemView.findViewById(R.id.img_row_add);
        }
        public void setData(Landscape current,int position){
            this.tvTitle.setText(current.getTitle());
            this.imgThumb.setImageResource(current.getImageID());
            this.current=current;
            this.position=position;
        }
        public void setListener(){
            imgDelete.setOnClickListener(MyViewHolder.this);
            imgAdd.setOnClickListener(MyViewHolder.this);
        }

        @Override
        public void onClick(View v) {
            int id=v.getId();
            switch (v.getId()){
                case R.id.img_row_add:
                    addItem(position,current);
                    break;
                case R.id.img_row_delete:
                    deleteItem(position);
                    break;

            }

        }
    }
}
