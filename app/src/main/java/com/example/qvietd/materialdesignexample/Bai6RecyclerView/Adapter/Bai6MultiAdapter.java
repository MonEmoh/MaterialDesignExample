package com.example.qvietd.materialdesignexample.Bai6RecyclerView.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
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

public class Bai6MultiAdapter extends RecyclerView.Adapter<Bai6MultiAdapter.MyViewHolder>{
    private static final int PRIME_ROW = 0;
    private static final int NON_PRIME_ROW = 1;

    private List<Landscape>landscapeList;
    private LayoutInflater inflater;

    public Bai6MultiAdapter(Context context,List<Landscape> landscapeList) {
        this.landscapeList = landscapeList;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case PRIME_ROW:
                ViewGroup primeRow=(ViewGroup)inflater.inflate(R.layout.bai6_listitem_2,parent,false);
                return new MyViewHolder_PRIME(primeRow);
            case NON_PRIME_ROW:
                ViewGroup notPrimeRow=(ViewGroup)inflater.inflate(R.layout.bai6_listitem_1,parent,false);
                return new MyViewHolder_NotPrime(notPrimeRow);
            default:
                ViewGroup primeRow1=(ViewGroup)inflater.inflate(R.layout.bai6_listitem_2,parent,false);
                return new MyViewHolder_PRIME(primeRow1);
        }
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            Landscape landscape=landscapeList.get(position);
        switch (holder.getItemViewType()){
            case PRIME_ROW:
                MyViewHolder_PRIME holder_prime= (MyViewHolder_PRIME) holder;
                holder_prime.setData(landscape);
                break;
            case NON_PRIME_ROW:
                MyViewHolder_NotPrime holder_notPrime= (MyViewHolder_NotPrime) holder;
                holder_notPrime.setData(landscape);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return landscapeList.size();
    }

    @Override
    public int getItemViewType(int position) {
//        Landscape landscape=landscapeList.get(position);
        if(Landscape.checkPrime(position))return PRIME_ROW;
        return NON_PRIME_ROW;
    }
    class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
    class MyViewHolder_PRIME extends MyViewHolder {
        private static final int PRIME_ROW = 0;
        private static final int NON_PRIME_ROW = 1;
        TextView tvTitle;
        ImageView imgThumb, imgRowtype;

        public MyViewHolder_PRIME(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle_bai6_view2);
            imgThumb = (ImageView) itemView.findViewById(R.id.img_row_bai6_view2);
            imgRowtype = (ImageView) itemView.findViewById(R.id.img_row_prime_bai6_view2);

        }

        public void setData(Landscape landscape) {
            this.tvTitle.setText(landscape.getTitle());
            this.imgThumb.setImageResource(landscape.getImageID());
            this.imgRowtype.setImageResource(R.drawable.prime);
        }
    }

    class MyViewHolder_NotPrime extends MyViewHolder {

        TextView tvTitle;
        ImageView imgThumb, imgRowType;

        public MyViewHolder_NotPrime(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitlebai6_view1);
            imgThumb = (ImageView) itemView.findViewById(R.id.img_row_bai6_view1);
            imgRowType = (ImageView) itemView.findViewById(R.id.img_row_not_prime_view1);
        }

        public void setData(Landscape landscape) {
            this.tvTitle.setText(landscape.getTitle());
            this.imgThumb.setImageResource(landscape.getImageID());
            this.imgRowType.setImageResource(R.drawable.not_prime);
        }
    }
}
