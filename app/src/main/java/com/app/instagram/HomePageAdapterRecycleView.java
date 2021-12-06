package com.app.instagram;

public class HomePageAdapterRecycleView {

    private int image_view_story, image_view_dots, image_view_photo, image_view_like, image_view_message, image_view_reply, image_view_pin_save, image_view_liked_photo;
    private String text_view_title, text_view_liked;

    HomePageAdapterRecycleView(int image_view_story, String text_view_title, int image_view_dots, int image_view_photo, int image_view_like, int image_view_message, int image_view_reply, int image_view_pin_save, int image_view_liked_photo, String text_view_liked){
        this.image_view_story=image_view_story;
        this.text_view_title=text_view_title;
        this.image_view_dots=image_view_dots;
        this.image_view_photo=image_view_photo;
        this.image_view_like=image_view_like;
        this.image_view_message=image_view_message;
        this.image_view_reply=image_view_reply;
        this.image_view_pin_save=image_view_pin_save;
        this.image_view_liked_photo=image_view_liked_photo;
        this.text_view_liked=text_view_liked;
    }

    int getImage_view_story(){
        return image_view_story;
    }

    String getText_view_title(){
        return  text_view_title;
    }

    int getImage_view_dots(){
        return image_view_dots;
    }

    int getImage_view_photo(){
        return image_view_photo;
    }

    int getImage_view_like(){
        return image_view_like;
    }

    int getImage_view_message(){
        return image_view_message;
    }

    int getImage_view_reply(){
        return image_view_reply;
    }

    int getImage_view_pin_save() {
        return image_view_pin_save;
    }

    int getImage_view_liked_photo() {
        return image_view_liked_photo;
    }

    String getText_view_liked() {
        return text_view_liked;
    }
}
