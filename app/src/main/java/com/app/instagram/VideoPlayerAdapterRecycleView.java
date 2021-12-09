package com.app.instagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class VideoPlayerAdapterRecycleView extends RecyclerView.Adapter<VideoPlayerViewHolderRecycleView> {

    ArrayList<VideoPlayerPageAdapterRecycleView> arrayList;
    Context context3;
    VideoPlayerAdapterRecycleView(Context context3, ArrayList<VideoPlayerPageAdapterRecycleView> arrayList) {
        this.context3=context3;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public VideoPlayerViewHolderRecycleView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context3);
        return new VideoPlayerViewHolderRecycleView(layoutInflater.inflate(R.layout.recycleview_adapte_video_player, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VideoPlayerViewHolderRecycleView holder, int position) {
        VideoPlayerPageAdapterRecycleView videoPlayerPageAdapterRecycleView= arrayList.get(position);
        ImageView imageView_main_screen=holder.itemView.findViewById(R.id.main_screen);
        TextView textView_text_view_like_count=holder.itemView.findViewById(R.id.text_view_like_count);
        TextView textView_text_view_message_count=holder.itemView.findViewById(R.id.text_view_message_count);
        ImageView imageView_image_profile=holder.itemView.findViewById(R.id.image_profile);
        TextView textView_text_profile_name=holder.itemView.findViewById(R.id.text_profile_name);
        TextView textView_text_emoji=holder.itemView.findViewById(R.id.text_emoji);
        TextView textView_text2=holder.itemView.findViewById(R.id.text2);
        ImageView imageView_image_photo=holder.itemView.findViewById(R.id.image_photo);
        imageView_main_screen.setImageResource(videoPlayerPageAdapterRecycleView.getMain_screen());
        textView_text_view_like_count.setText(videoPlayerPageAdapterRecycleView.getText_view_like_count());
        textView_text_view_message_count.setText(videoPlayerPageAdapterRecycleView.getText_view_message_count());
        //imageView_image_profile.setImageResource(videoPlayerPageAdapterRecycleView.getImage_profile());
        Glide.with(context3)
                .load(videoPlayerPageAdapterRecycleView.getImage_profile())
                .circleCrop()
                .into(imageView_image_profile);
        textView_text_profile_name.setText(videoPlayerPageAdapterRecycleView.getText_profile_name());
        textView_text_emoji.setText(videoPlayerPageAdapterRecycleView.getText_emoji());
        textView_text2.setText(videoPlayerPageAdapterRecycleView.getText2());
        imageView_image_photo.setImageResource(videoPlayerPageAdapterRecycleView.getImage_photo());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
