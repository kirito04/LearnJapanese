package com.example.learnmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "ichi", R.drawable.number_one));
        words.add(new Word("two", "ni", R.drawable.number_two));
        words.add(new Word("three", "san", R.drawable.number_three));
        words.add(new Word("four", "yon/shi", R.drawable.number_four));
        words.add(new Word("five", "go", R.drawable.number_five));
        words.add(new Word("six", "roku", R.drawable.number_six));
        words.add(new Word("seven", "nana/shichi", R.drawable.number_seven));
        words.add(new Word("eight", "hachi", R.drawable.number_eight));
        words.add(new Word("nine", "kyuu", R.drawable.number_nine));
        words.add(new Word("ten", "juu", R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}