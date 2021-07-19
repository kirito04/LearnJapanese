package com.example.learnmiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Hello", "konnichiwa"));
        words.add(new Word("How are you?", "genki desuka"));
        words.add(new Word("I'm fine, thank you.", "genki desu arigatou"));
        words.add(new Word("My name is...", "watashi no namae wa ... desu"));
        words.add(new Word("Nice to meet you.", "douzoyoroshiku"));
        words.add(new Word("Goodbye", "sayounara"));
        words.add(new Word("Good morning", "Ohayou-gozaimasu"));
        words.add(new Word("Good evening", "Konbanwa"));
        words.add(new Word("Thank you", "Arigatou gozaimasu"));
        words.add(new Word("Excuse me", "Sumimasen"));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}