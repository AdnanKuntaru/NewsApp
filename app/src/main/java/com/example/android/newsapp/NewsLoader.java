package com.example.android.newsapp;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.content.AsyncTaskLoader;

import android.util.Log;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * Created by USER on 10/5/2018.
 */


    /**
     * Loads a list of earthquakes by using an AsyncTask to perform the
     * network request to the given URL.
     */
    public class NewsLoader extends AsyncTaskLoader<List<News>> {
        public NewsLoader(Context context) {
            super(context);
        }
        @Override
        protected void onStartLoading() {
            super.onStartLoading();
            forceLoad();
        }

        @Override
        public List<News> loadInBackground() {
            List<News> listOfNews = null;
            try {
                URL url = QueryUtils.createUrl();
                String jsonResponse = QueryUtils.makeHttpRequest(url);
                listOfNews = QueryUtils.parseJson(jsonResponse);
            } catch (IOException e) {
                Log.e("Queryutils", "Error Loader LoadInBackground: ", e);
            }
            return listOfNews;
        }
    }