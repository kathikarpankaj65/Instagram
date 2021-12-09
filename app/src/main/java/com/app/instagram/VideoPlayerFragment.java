package com.app.instagram;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;


public class VideoPlayerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_video_player, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toolbar toolbar=view.findViewById(R.id.video_player_toolbar);
        toolbar.inflateMenu(R.menu.video_player_toolbar);

        RecyclerView recyclerView=view.findViewById(R.id.video_player_recycle_view);
        VideoPlayerPageViewModel videoPlayerPageViewModel=new VideoPlayerPageViewModel();
        recyclerView.setAdapter(new VideoPlayerAdapterRecycleView(getActivity(),
                videoPlayerPageViewModel.getVideoPlayerPageAdapterRecycleView()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        PagerSnapHelper pagerSnapHelper=new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(recyclerView);
    }
}