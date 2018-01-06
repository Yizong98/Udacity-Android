/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.handsound_adapted_version;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyFavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myfavorite);
        Button button = (Button) findViewById(R.id.back4);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent backIntent = new Intent(MyFavoriteActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(backIntent);
            }
        });

        Button button2 = (Button) findViewById(R.id.search3);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent favIntent = new Intent(MyFavoriteActivity.this, SongSearchActivity.class);

                // Start the new activity
                startActivity(favIntent);
            }
        });
        Button button3 = (Button) findViewById(R.id.trending3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent searchIntent = new Intent(MyFavoriteActivity.this, TrendingNowActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });
        Button button4 = (Button) findViewById(R.id.forum4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent trendIntent = new Intent(MyFavoriteActivity.this, MusicForumActivity.class);

                // Start the new activity
                startActivity(trendIntent);
            }
        });
        String[] words = new String[3];
        words[0] = "Brief Explanation: The function of this screen is to display a list of user's favorite music";
        words[1] = "Needed Classes: SongClass,SongAdapter, which contains a listview, updates the list if needed, and releases musicplayer once the certain play button is clicked.";
        words[2] = "This website can help:https://code.tutsplus.com/tutorials/create-a-music-player-on-android-project-setup--mobile-22764";

        LinearLayout rootview = (LinearLayout) findViewById(R.id.favoritemusic);
        TextView wordView = new TextView(this);
        wordView.setText(words[0]);
        rootview.addView(wordView);

        TextView wordView2 = new TextView(this);
        wordView2.setText(words[1]);
        rootview.addView(wordView2);

        TextView wordView3 = new TextView(this);
        wordView3.setText(words[2]);
        rootview.addView(wordView3);
    }


    }

