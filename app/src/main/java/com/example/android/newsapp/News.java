package com.example.android.newsapp;

import android.content.IntentFilter;

import java.util.Date;

/**
 * Created by USER on 10/4/2018.
 */

public class News {

    private String mAuthor;
    private String mTitle;
    private String mUrl;
    private String mDate;
    private String mSection;


    public News(String author, String title, String url, String date, String section) {
        mAuthor = author;
        mTitle = title;
        mUrl = url;
        mSection = section;
        mDate = date;
    }


    public String getAuthor() {
        return mAuthor;

    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getDate() {
        return mDate;
    }

    public String getSection() {
        return mSection;
    }

    }


