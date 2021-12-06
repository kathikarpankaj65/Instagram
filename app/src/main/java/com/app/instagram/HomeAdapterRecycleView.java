package com.app.instagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapterRecycleView extends RecyclerView.Adapter<HomeViewHolderRecycleView> {

    ArrayList<HomePageAdapterRecycleView> arrayList;
    Context context1;
    HomeAdapterRecycleView(Context context1, ArrayList<HomePageAdapterRecycleView> arrayList){
        this.context1=context1;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public HomeViewHolderRecycleView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context1);
        return new HomeViewHolderRecycleView(layoutInflater.inflate(R.layout.recycleview_adapte_home, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolderRecycleView holder, int position) {
        HomePageAdapterRecycleView homePageAdapterRecycleView=arrayList.get(position);
        ImageView imageView=holder.itemView.findViewById(R.id.imageview_recycle_view_story);
        TextView textView=holder.itemView.findViewById(R.id.textview_title);
        ImageView imageView1=holder.itemView.findViewById(R.id.imageview_dots);
        ImageView imageView2=holder.itemView.findViewById(R.id.imageview_photo);
        ImageView imageView3=holder.itemView.findViewById(R.id.imageview_like);
        ImageView imageView4=holder.itemView.findViewById(R.id.imageview_message);
        ImageView imageView5=holder.itemView.findViewById(R.id.imageview_reply);
        ImageView imageView6=holder.itemView.findViewById(R.id.imageview_pin_save);
        ImageView imageView7=holder.itemView.findViewById(R.id.imageview_liked_photo);
        TextView textView1=holder.itemView.findViewById(R.id.textview_liked);
        imageView.setImageResource(homePageAdapterRecycleView.getImage_view_story());
        textView.setText(homePageAdapterRecycleView.getText_view_title());
        imageView1.setImageResource(homePageAdapterRecycleView.getImage_view_dots());
        imageView2.setImageResource(homePageAdapterRecycleView.getImage_view_photo());
        imageView3.setImageResource(homePageAdapterRecycleView.getImage_view_like());
        imageView4.setImageResource(homePageAdapterRecycleView.getImage_view_message());
        imageView5.setImageResource(homePageAdapterRecycleView.getImage_view_reply());
        imageView6.setImageResource(homePageAdapterRecycleView.getImage_view_pin_save());
        imageView7.setImageResource(homePageAdapterRecycleView.getImage_view_liked_photo());
        textView1.setText(homePageAdapterRecycleView.getText_view_liked());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
