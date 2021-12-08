package com.app.instagram;

import androidx.recyclerview.widget.GridLayoutManager;

public class SpanSizeLookUpSubClass extends GridLayoutManager.SpanSizeLookup {
    @Override
    public int getSpanSize(int position) {
        int modulo=position%6;
        if(modulo==0){
            return 3;
        }else if(modulo==1||modulo==2){
            return 2;
        }else if(modulo==3||modulo==4||modulo==5){
            return 1;
        }
        return 1;
    }
}
