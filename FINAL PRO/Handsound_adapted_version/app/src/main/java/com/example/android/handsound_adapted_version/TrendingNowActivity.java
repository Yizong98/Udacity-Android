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


public class TrendingNowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trendingnow);


        Button button = (Button) findViewById(R.id.back2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent backIntent = new Intent(TrendingNowActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(backIntent);
            }
        });

        Button button2 = (Button) findViewById(R.id.favorite2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent favIntent = new Intent(TrendingNowActivity.this, MyFavoriteActivity.class);

                // Start the new activity
                startActivity(favIntent);
            }
        });
        Button button3 = (Button) findViewById(R.id.search2);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent searchIntent = new Intent(TrendingNowActivity.this, SongSearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });
        Button button4 = (Button) findViewById(R.id.forum2);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent trendIntent = new Intent(TrendingNowActivity.this, MusicForumActivity.class);

                // Start the new activity
                startActivity(trendIntent);
            }
        });
        String[] words = new String[2];
        words[0] = "Brief Explanation: The function of this screen is to display a list of current hit music and update the list periodically";
        words[1] = "Needed Classes: SongClass,SongAdapter, which contains a listview, updates the list if needed, and releases musicplayer once the certain play button is clicked.";

        LinearLayout rootview = (LinearLayout) findViewById(R.id.trendingroot);
        TextView wordView = new TextView(this);
        wordView.setText(words[0]);
        rootview.addView(wordView);

        TextView wordView2 = new TextView(this);
        wordView2.setText(words[1]);
        rootview.addView(wordView2);


    }


}
