package com.app.instagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder>{

    ArrayList<HomeAdapterPage> arrayList;
    Context context;
    HomeAdapter(Context context, ArrayList<HomeAdapterPage> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        return new HomeViewHolder(layoutInflater.inflate(R.layout.adapter_home, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        HomeAdapterPage homeAdapterPage=arrayList.get(position);
        ImageView imageView=holder.itemView.findViewById(R.id.imageview_story);
        //imageView.setImageResource(homeAdapterPage.getImage());
        Glide.with(context)
                .load(homeAdapterPage.getImage())
                .circleCrop()
                .into(imageView);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
