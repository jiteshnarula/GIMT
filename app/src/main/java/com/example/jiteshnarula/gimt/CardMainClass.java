package com.example.jiteshnarula.gimt;

/**
 * Created by Jitesh Narula on 21-10-2017.
 */

public class CardMainClass {
    private String titleText;
    private String imgURL;
    private String msgText;

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public CardMainClass(String titleText, String imgURL, String msgText) {

        this.titleText = titleText;
        this.imgURL = imgURL;
        this.msgText = msgText;
    }
}