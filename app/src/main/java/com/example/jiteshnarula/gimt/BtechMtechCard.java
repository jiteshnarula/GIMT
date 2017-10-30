package com.example.jiteshnarula.gimt;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jitesh Narula on 15-10-2017.
 */

public class BtechMtechCard {
    private String titleTextView;
    private String imageURL;
    private String messageTextView;

    public BtechMtechCard(String titleTextView, String imageURL, String messageTextView) {
        this.titleTextView = titleTextView;
        this.imageURL = imageURL;
        this.messageTextView = messageTextView;
    }


    public String getTitleTextView() {
        return titleTextView;
    }

    public void setTitleTextView(String titleTextView) {
        this.titleTextView = titleTextView;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getMessageTextView() {
        return messageTextView;
    }

    public void setMessageTextView(String messageTextView) {
        this.messageTextView = messageTextView;
    }
}
