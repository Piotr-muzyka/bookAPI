package com.example.android.bookapi;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by PiotrM on 02.07.2017.
 */

public class BookLoader extends AsyncTaskLoader<List<Book>> {


    private static final String LOG_TAG = BookLoader.class.getName();
    private String mUrl;
    public BookLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Book> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<Book> books = Utils.fetchBookData(mUrl);
        return books;
    }
}
