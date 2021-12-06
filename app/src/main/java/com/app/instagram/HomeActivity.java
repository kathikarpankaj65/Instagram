package com.app.instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        viewPager=findViewById(R.id.view_pager);
        ArrayList<Fragment> arrayList=new ArrayList<>();
        arrayList.add(new HomeFragment());
        arrayList.add(new SearchFragment());
        arrayList.add(new VideoPlayerFragment());
        arrayList.add(new NotificationsFragment());
        arrayList.add(new AccountFragment());
        HomeViewPagerAdapter homeViewPagerAdapter=new HomeViewPagerAdapter(getSupportFragmentManager(),arrayList);
        viewPager.setAdapter(homeViewPagerAdapter);
        BottomNavigationView bottomNavigationView=findViewById(R.id.navigator_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home_page:
                viewPager.setCurrentItem(0);
                Toast.makeText(this, "home_page", Toast.LENGTH_SHORT).show();
                break;

            case R.id.search_page:
                viewPager.setCurrentItem(1);
                Toast.makeText(this, "search_page", Toast.LENGTH_SHORT).show();
                break;

            case R.id.video_player_page:
                viewPager.setCurrentItem(2);
                Toast.makeText(this, "video_player_page", Toast.LENGTH_SHORT).show();
                break;

            case R.id.notifications_page:
                viewPager.setCurrentItem(3);
                Toast.makeText(this, "notifications_page", Toast.LENGTH_SHORT).show();
                break;

            case R.id.account_page:
                viewPager.setCurrentItem(4);
                Toast.makeText(this, "account_page", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}