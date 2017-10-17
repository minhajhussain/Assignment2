package com.example.minhaj.assignment2;

import android.content.Context;
import android.provider.SyncStateContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Minhaj on 10/15/2017.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.myViewHolder> {

    private ArrayList<String> data;
    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflator =   LayoutInflater.from(parent.getContext());
        View view = inflator.inflate(R.layout.list_layout,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position ) {
       String title = data.get(position);
        holder.text.setText(title);


    }



    @Override
    public int getItemCount() {
        return data.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView text;
        Button btn;
        public myViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.drawable.pic1);
            text =(TextView) itemView.findViewById(R.id.txtTitle);
            btn = (Button) itemView.findViewById(R.id.button);

        }
    }

    //Constructor

    public ListAdapter(ArrayList<String> data){
        this.data=data;
    }
}
