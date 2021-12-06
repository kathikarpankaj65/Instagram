package com.app.instagram;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeDecoration extends RecyclerView.ItemDecoration {

    int last_element_index;
    HomeDecoration(int last_element_index){
        this.last_element_index=last_element_index;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.left=30;
        outRect.top=30;
        outRect.bottom=30;
        int index=parent.getChildLayoutPosition(view);
        if(last_element_index-1==index){
            outRect.right=30;
        }
    }
}
