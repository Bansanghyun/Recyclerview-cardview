package com.example.ban.shop;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ban on 2017-03-15.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Itemname> item;
    //private int itemLayout;

    public Adapter(List<Itemname> item)
    {
        this.item = item;
        //this.itemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Itemname itemname = item.get(position);
        holder.imageView.setImageResource(itemname.image);
        holder.textView.setText(itemname.name);
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        public ImageView imageView;
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.image);
            textView = (TextView)itemView.findViewById(R.id.value);

        }
    }


}
