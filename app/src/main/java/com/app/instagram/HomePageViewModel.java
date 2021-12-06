package com.app.instagram;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class HomePageViewModel extends ViewModel {
    ArrayList<HomeAdapterPage> getHomeAdapterPage(){
        ArrayList<HomeAdapterPage> arrayList=new ArrayList<>();
        arrayList.add(new HomeAdapterPage(R.drawable.abc));
        arrayList.add(new HomeAdapterPage(R.drawable.abc1));
        arrayList.add(new HomeAdapterPage(R.drawable.abc3));
        arrayList.add(new HomeAdapterPage(R.drawable.abc4));
        arrayList.add(new HomeAdapterPage(R.drawable.abc5));
        arrayList.add(new HomeAdapterPage(R.drawable.abc6));
        arrayList.add(new HomeAdapterPage(R.drawable.abc7));
        return arrayList;
    }
}
