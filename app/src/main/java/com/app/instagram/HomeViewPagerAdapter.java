package com.app.instagram;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class HomeViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> arrayList;

    public HomeViewPagerAdapter(@NonNull FragmentManager fm,ArrayList<Fragment> arrayList) {
        super(fm);
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }
}
