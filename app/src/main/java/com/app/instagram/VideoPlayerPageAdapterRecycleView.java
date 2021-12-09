package com.app.instagram;

public class VideoPlayerPageAdapterRecycleView {

    private int image_profile, image_photo, main_screen;
    private String text_view_like_count, text_view_message_count,
            text_profile_name, text2, text_emoji, textview_name;

    VideoPlayerPageAdapterRecycleView(int main_screen, String text_view_like_count,
                                      String text_view_message_count, int image_profile,
                                      String text_profile_name, String textview_name ,
                                      String text_emoji , String text2, int image_photo){

        this.main_screen=main_screen;
        this.text_view_like_count=text_view_like_count;
        this.text_view_message_count=text_view_message_count;
        this.image_profile=image_profile;
        this.text_profile_name=text_profile_name;
        this.textview_name=textview_name;
        this.text_emoji=text_emoji;
        this.text2=text2;
        this.image_photo=image_photo;

    }

    int getMain_screen() {
        return main_screen;
    }

    String getText_view_like_count() {
        return text_view_like_count;
    }

    String getText_view_message_count() {
        return text_view_message_count;
    }

    int getImage_profile() {
        return image_profile;
    }

    String getText_profile_name() {
        return text_profile_name;
    }

    String getTextview_name() {
        return textview_name;
    }

    String getText_emoji() {
        return text_emoji;
    }

    String getText2() {
        return text2;
    }

    int getImage_photo() {
        return image_photo;
    }

}
