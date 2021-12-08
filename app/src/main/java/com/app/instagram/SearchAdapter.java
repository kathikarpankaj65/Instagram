package com.app.instagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder> {

    ArrayList<SearchAdapterPage> arrayList;
    Context context2;
    SearchAdapter(Context context2, ArrayList<SearchAdapterPage> arrayList){
        this.context2=context2;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context2);
        return new SearchViewHolder(layoutInflater.inflate(R.layout.adapter_search, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        SearchAdapterPage searchAdapterPage=arrayList.get(position);
        ImageView imageView=holder.itemView.findViewById(R.id.search_adapter_image);
        imageView.setImageResource(searchAdapterPage.getImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
