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
package com.example.android.sd_tour_guide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of hotels.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.ht_cy,
                R.drawable.courtyard_marriott));
        places.add(new Place(R.string.ht_eh,
                R.drawable.express_hotel));
        places.add(new Place(R.string.ht_grande,
                R.drawable.grande_colonial_village));
        places.add(new Place(R.string.ht_homewood_airport,
                R.drawable.homewood_suites));
        places.add(new Place(R.string.ht_inn_by_sea,
                R.drawable.inn_by_sea));
        places.add(new Place(R.string.ht_omni,
                R.drawable.omni_sd));
        places.add(new Place(R.string.ht_sheraton,
                R.drawable.sheraton_lj));
        places.add(new Place(R.string.ht_tower,
                R.drawable.tower_hotel_view_from));
        places.add(new Place(R.string.ht_homewood_mission,
                R.drawable.homewood_suites_hilton));
        places.add(new Place(R.string.ht_z,
                R.drawable.hotel_z_a_staypineapple));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_colors);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }


    @Override
    public void onStop() {
        super.onStop();
    }


}