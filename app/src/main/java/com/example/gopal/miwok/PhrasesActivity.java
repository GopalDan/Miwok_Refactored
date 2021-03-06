package com.example.gopal.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();
    }
}


//public class PhrasesActivity extends AppCompatActivity {
//
////    MediaPlayer mMediaPlayer;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_phrases);
//        final ArrayList<Word> words = new ArrayList<Word>();
//        words.add(new Word("Where are you going?","Where are you going?", R.raw.phrase_where_are_you_going));
//        words.add(new Word("What is your name?","tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
//        words.add(new Word("My name is...","oyaaset...", R.raw.phrase_my_name_is));
//        words.add(new Word("How are you feeling?","michәksәs?", R.raw.phrase_how_are_you_feeling));
//        words.add(new Word("I’m feeling good","kuchi achit", R.raw.phrase_im_feeling_good));
//        words.add(new Word("Are you coming?","әәnәs'aa?", R.raw.phrase_are_you_coming));
//        words.add(new Word("Yes, I’m coming.","hәә’ әәnәm", R.raw.phrase_yes_im_coming));
//        words.add(new Word("I’m coming.","әәnәm",R.raw.phrase_im_coming));
//        words.add(new Word("Let’s go.","yoowutis", R.raw.phrase_lets_go));
//        words.add(new Word("Come here.","әnni'nem", R.raw.phrase_come_here));
//
//        WordAdapter adapter = new WordAdapter(this,words,R.color.phrase_catagory_color);
//        ListView list = findViewById(R.id.list);
//        list.setAdapter(adapter);
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Word currentWord = words.get(i);
//                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this,currentWord.getmSongResourceId());
//                mMediaPlayer.start();
//                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mediaPlayer) {
//                        mMediaPlayer.release();
//                   }
//                });
//            }
//        });
   // }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        mMediaPlayer.release();
//    }
//}
