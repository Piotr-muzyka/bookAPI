package com.example.android.bookapi;

/**
 * Created by PiotrM on 02.07.2017.
 */


//List Items display at least author and title information.

/**
 * "title": "Android for Work",
 * "subtitle": "Productivity for Professionals",
 * "authors": ["Marziah Karch"],
 * "pageCount": 312,
 * "publishedDate": "2010-09-01",
 * "categories": ["Computers"],
 **/
public class Book {

    private String mTitle;
    private String mAuthor;
    private String mCategory;
    private int mPageCount;

    public Book(String title, String author, String category, int pages) {
        mTitle = title;
        mAuthor = author;
        mCategory = category;
        mPageCount = pages;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmCategory() {
        return mCategory;
    }

    public int getmPageCount() {
        return mPageCount;
    }
}



