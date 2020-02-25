package com.example.rssprocessing;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<String> mFeedTitles = new ArrayList<>();
    private Context mContext;

    public MyAdapter(ArrayList<String> mFeedTitles, Context mContext) {
        this.mFeedTitles = mFeedTitles;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d("Marcelo", "onBindViewHolder: called");
        
        holder.feedTitle.setText(mFeedTitles.get(position));
//        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Marcelo", "onClick: " + mFeedTitles.get(position));
//            }
//        });
        
    }

    @Override
    public int getItemCount() {
        return mFeedTitles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView feedTitle;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            feedTitle = itemView.findViewById(R.id.feed_title);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}



