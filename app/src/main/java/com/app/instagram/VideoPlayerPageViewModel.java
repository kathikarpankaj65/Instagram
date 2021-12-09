package com.app.instagram;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class VideoPlayerPageViewModel extends ViewModel {
    ArrayList<VideoPlayerPageAdapterRecycleView> getVideoPlayerPageAdapterRecycleView() {
        ArrayList<VideoPlayerPageAdapterRecycleView> arrayList = new ArrayList<>();
        arrayList.add(new VideoPlayerPageAdapterRecycleView(R.drawable.abc,
                "230k",
                "215",
                R.drawable.abc1,
                "pankaj kathikar",
                "pankaj",
                "pankaj Emoji",
                "monu",
                R.drawable.abc3));

        arrayList.add(new VideoPlayerPageAdapterRecycleView(R.drawable.abc1,
                "20k",
                "2k",
                R.drawable.abc3,
                "krunal kathikar",
                "krunal",
                "krunal Emoji",
                "sonu",
                R.drawable.abc));

        arrayList.add(new VideoPlayerPageAdapterRecycleView(R.drawable.abc3,
                "30k",
                "210",
                R.drawable.abc,
                "monu kathikar",
                "monu",
                "monu Emoji",
                "pankaj",
                R.drawable.abc1));
        return arrayList;
    }
}
