package com.example.android.bookapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PiotrM on 02.07.2017.
 */

public class BookAdapter extends ArrayAdapter<Book> {


    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list, parent, false);
        }

        Book currentBook = getItem(position);

        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText(currentBook.getmAuthor());

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentBook.getmTitle());

        TextView categoryView = (TextView) listItemView.findViewById(R.id.category);
        categoryView.setText(currentBook.getmCategory());

        TextView pageView = (TextView) listItemView.findViewById(R.id.pageCount);
        pageView.setText(currentBook.getmPageCount());

        return listItemView;
    }

}
