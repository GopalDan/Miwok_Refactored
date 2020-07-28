package com.example.gopal.miwok;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
/*
 * Here you can delete all activities (except MainActivity) NumbersActivity, FamilyActivity, ColorsActivity & PhraseActivity
 * You can also delete activity_category which is acting as a container for all these activities.
 * You can also refactor name of activity_number to fragment_number & same for all others.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // getSupportActionBar().setElevation(0);

        setContentView(R.layout.activity_main);


        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);

//        TextView number = findViewById(R.id.number_activity);
//        number.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent numberActivity = new Intent(MainActivity.this,NumbersActivity.class);
//                startActivity(numberActivity);
//            }
//        });
//        TextView family = findViewById(R.id.family_activity);
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent familyActivity = new Intent(MainActivity.this,FamilyActivity.class);
//                startActivity(familyActivity);
//            }
//        });
//        TextView color = findViewById(R.id.colors_activity);
//        color.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent colorActivity = new Intent(MainActivity.this,ColorsActivity.class);
//                startActivity(colorActivity);
//            }
//        });
//        TextView phrase = findViewById(R.id.phrases_activity);
//        phrase.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent phraseActivity = new Intent(MainActivity.this,PhrasesActivity.class);
//                startActivity(phraseActivity);
//            }
//        });
//        Log.v("MainActivity","Hey is it you");
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.v("MainActivity","Start");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.v("MainActivity","Resume");
//
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.v("MainActivity","Stop");
//
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.v("MainActivity","Pause");
//
//    }
    }
}
