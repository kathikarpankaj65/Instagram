package com.app.instagram;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class SearchFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText editText=view.findViewById(R.id.edittext_search);
        RecyclerView recyclerView=view.findViewById(R.id.search_recycle_view);
        SearchPageViewModel searchPageViewModel=new SearchPageViewModel();
        recyclerView.setAdapter(new SearchAdapter(getActivity(), searchPageViewModel.getSearchPageViewModel()));
        GridLayoutManager manager=new GridLayoutManager(getActivity(), 3);
        recyclerView.setLayoutManager(manager);
        SpanSizeLookUpSubClass spanSizeLookUpSubClass=new SpanSizeLookUpSubClass();
        //manager.setSpanSizeLookup(spanSizeLookUpSubClass);
    }
}