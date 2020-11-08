package com.example.firstdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    private List<Post> list;

    public RecyclerAdapter(List<Post> list)
    {
        this.list = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View row =  LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_layout,parent,false);
       MyViewHolder myViewHolder = new MyViewHolder(row);
    return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.user_id.setText("User id: "+list.get(position).getUserId());
    holder.ID.setText("ID: "+list.get(position).getId());
    holder.title.setText("Title: "+list.get(position).getTitle());
    holder.mainBody.setText(list.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView title, mainBody, user_id, ID;
        public MyViewHolder(View itemView) {
            super(itemView);
            //get the reference of the item view's
            user_id = (TextView) itemView.findViewById(R.id.User_ID);
            ID = (TextView) itemView.findViewById(R.id.identity);
            title = (TextView) itemView.findViewById(R.id.title);
            mainBody= (TextView) itemView.findViewById(R.id.body);
        }
    }
}

