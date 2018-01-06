package com.example.android.handsound_adapted_version;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView trendingnow = (TextView) findViewById(R.id.trendingnow);

        // Set a click listener on that View
        trendingnow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicForumActivity}
                Intent trendingIntent = new Intent(MainActivity.this, TrendingNowActivity.class);

                // Start the new activity
                startActivity(trendingIntent);
            }
        });

        // Find the View that shows the favorite category
        TextView myfavorite = (TextView) findViewById(R.id.myfavorite);

        // Set a click listener on that View
        myfavorite.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongSearchActivity}
                Intent favoriteIntent = new Intent(MainActivity.this, MyFavoriteActivity.class);

                // Start the new activity
                startActivity(favoriteIntent);
            }
        });

        // Find the View that shows the forum category
        TextView forum = (TextView) findViewById(R.id.musicforum);

        // Set a click listener on that View
        forum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicForumActivity}
                Intent forumIntent = new Intent(MainActivity.this, MusicForumActivity.class);

                // Start the new activity
                startActivity(forumIntent);
            }
        });

        // Find the View that shows the songsearch category
        TextView search = (TextView) findViewById(R.id.songsearch);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongSearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SongSearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });
    }
}
