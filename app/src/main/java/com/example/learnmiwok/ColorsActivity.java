package com.example.learnmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "aka", R.drawable.color_red));
        words.add(new Word("green", "midori", R.drawable.color_green));
        words.add(new Word("brown", "chairo", R.drawable.color_brown));
        words.add(new Word("gray", "haiiro", R.drawable.color_gray));
        words.add(new Word("black", "kuro", R.drawable.color_black));
        words.add(new Word("white", "shiro", R.drawable.color_white));
        words.add(new Word("blue", "ao", R.drawable.color_dusty_yellow));
        words.add(new Word("yellow", "kiiro", R.drawable.color_mustard_yellow));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}