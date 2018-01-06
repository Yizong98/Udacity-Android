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
 * {@link Fragment} that displays a list of attractions.
 */
public class AttractionFragment extends Fragment {


    public AttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.at_aircraft,
                R.drawable.california_san_diego_midway_aircraft_carrier));
        places.add(new Place(R.string.at_balboa,
                R.drawable.california_san_diego_balboa_park_pond));
        places.add(new Place(R.string.at_gaslamp,
                R.drawable.california_san_diego_gaslamp_quarter));
        places.add(new Place(R.string.at_loma,
                R.drawable.california_san_diego_point_loma));
        places.add(new Place(R.string.at_mission,
                R.drawable.california_san_diego_mission));
        places.add(new Place(R.string.at_mission_beach,
                R.drawable.san_diego_things_to_do_mission_beach));
        places.add(new Place(R.string.at_oldtown,
                R.drawable.california_san_diego_old_town));
        places.add(new Place(R.string.at_seaport_village,
                R.drawable.california_san_diego_seaport_village));
        places.add(new Place(R.string.at_sunset,
                R.drawable.san_diego_things_to_do_sunset));
        places.add(new Place(R.string.at_zoo,
                R.drawable.california_san_diego_zoo));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }


    @Override
    public void onStop() {
        super.onStop();
    }


}