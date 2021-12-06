package com.app.instagram;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class HomePageViewModelRecycleView extends ViewModel {
    ArrayList<HomePageAdapterRecycleView> getHomePageAdapterRecycleView(){
        ArrayList<HomePageAdapterRecycleView> arrayList=new ArrayList<>();
        arrayList.add(new HomePageAdapterRecycleView(R.drawable.abc, "Photo shoot Contain", R.drawable.dots, R.drawable.abc3, R.drawable.heart, R.drawable.chat, R.drawable.send, R.drawable.bookmark, R.drawable.abc5, "Liked by others"));
        arrayList.add(new HomePageAdapterRecycleView(R.drawable.abc, "Photo shoot Contain", R.drawable.dots, R.drawable.abc3, R.drawable.heart, R.drawable.chat, R.drawable.send, R.drawable.bookmark, R.drawable.abc5, "Liked by others"));
        arrayList.add(new HomePageAdapterRecycleView(R.drawable.abc, "Photo shoot Contain", R.drawable.dots, R.drawable.abc3, R.drawable.heart, R.drawable.chat, R.drawable.send, R.drawable.bookmark, R.drawable.abc5, "Liked by others"));
        arrayList.add(new HomePageAdapterRecycleView(R.drawable.abc, "Photo shoot Contain", R.drawable.dots, R.drawable.abc3, R.drawable.heart, R.drawable.chat, R.drawable.send, R.drawable.bookmark, R.drawable.abc5, "Liked by others"));
        return arrayList;
    }
}
