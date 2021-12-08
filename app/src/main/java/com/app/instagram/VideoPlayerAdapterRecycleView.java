package com.app.instagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VideoPlayerAdapterRecycleView extends RecyclerView.Adapter<VideoPlayerViewHolderRecycleView> {

    Context context3;
    VideoPlayerAdapterRecycleView(Context context3){
        this.context3=context3;
    }

    @NonNull
    @Override
    public VideoPlayerViewHolderRecycleView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context3);
        return new VideoPlayerViewHolderRecycleView(layoutInflater.inflate(R.layout.recycleview_adapte_video_player, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VideoPlayerViewHolderRecycleView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
