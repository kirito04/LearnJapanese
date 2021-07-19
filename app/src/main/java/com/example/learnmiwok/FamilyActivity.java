package com.example.learnmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("father", "o tousan", R.drawable.family_father));
        words.add(new Word("mother", "o kaasan", R.drawable.family_mother));
        words.add(new Word("son", "musuko", R.drawable.family_son));
        words.add(new Word("daughter", "musume", R.drawable.family_daughter));
        words.add(new Word("older brother", "o niisan", R.drawable.family_older_brother));
        words.add(new Word("younger brother", "otouto", R.drawable.family_younger_brother));
        words.add(new Word("older sister", "o neesan", R.drawable.family_older_sister));
        words.add(new Word("younger sister", "imouto", R.drawable.family_younger_sister));
        words.add(new Word("grandmother", "obaasan", R.drawable.family_grandmother));
        words.add(new Word("grandfather", "ojiisan", R.drawable.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}