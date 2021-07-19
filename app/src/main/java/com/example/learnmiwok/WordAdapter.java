package com.example.learnmiwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolorResourceID;

    public WordAdapter(Activity context, ArrayList<Word> objects, int colorResourceID) {
        super(context, 0,objects);
        mcolorResourceID = colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word word = getItem(position);

        ImageView miwokImageView = (ImageView) listItemView.findViewById(R.id.miwok_image_view);
        if(word.hasImage()) {
            miwokImageView.setImageResource(word.getImageResourceID());
            miwokImageView.setVisibility(View.VISIBLE);
        }else {
            miwokImageView.setVisibility(View.GONE);
        }

        View textContatiner = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mcolorResourceID);
        textContatiner.setBackgroundColor(color);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(word.getMiwokTranslation());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        englishTextView.setText(word.getEnglishTranslation());


        return listItemView;
    }
}
