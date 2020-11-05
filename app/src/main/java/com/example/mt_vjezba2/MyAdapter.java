package com.example.mt_vjezba2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<MyData> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textRepo,  textStars;
        public ImageView avatar;

        public MyViewHolder(View v) {

            super(v);
            textRepo = v.findViewById(R.id.textRepo);
            textStars = v.findViewById(R.id.textView3);
            avatar = v.findViewById(R.id.imageView);
        };
    }

    public MyAdapter(ArrayList<MyData> myDataset){
        this.mDataset = myDataset;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewCell = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row,parent,false);

        MyViewHolder viewHolder = new MyViewHolder(viewCell);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textRepo.setText(mDataset.get(position).repoName);
        holder.textStars.setText(mDataset.get(position).starsNumber);
        holder.avatar.setImageResource(mDataset.get(position).picture);

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
