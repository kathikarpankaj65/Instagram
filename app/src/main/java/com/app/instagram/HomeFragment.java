package com.app.instagram;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView=view.findViewById(R.id.home_recycle_view);
        HomePageViewModel homePageViewModel=new HomePageViewModel();
        recyclerView.setAdapter(new HomeAdapter(getActivity(), homePageViewModel.getHomeAdapterPage()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.addItemDecoration(new HomeDecoration(homePageViewModel.getHomeAdapterPage().size()));

        RecyclerView recyclerView1=view.findViewById(R.id.home_page_recycle_view);
        HomePageViewModelRecycleView homePageViewModelRecycleView=new HomePageViewModelRecycleView();
        recyclerView1.setAdapter(new HomeAdapterRecycleView(getActivity(), homePageViewModelRecycleView.getHomePageAdapterRecycleView()));
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}