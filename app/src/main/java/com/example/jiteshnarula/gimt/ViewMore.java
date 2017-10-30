package com.example.jiteshnarula.gimt;

/**
 * Created by Jitesh Narula on 23-10-2017.
 */

public class ViewMore {
    String imgUrl;
    String field;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public ViewMore(String imgUrl, String field) {

        this.imgUrl = imgUrl;
        this.field = field;
    }
}
