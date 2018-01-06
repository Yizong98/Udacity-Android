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
 * {@link Fragment} that displays a list of restaurants.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.rt_ar,
                R.drawable.ar_valentin));
        places.add(new Place(R.string.rt_eddie,
                R.drawable.eddie_v_prime));
        places.add(new Place(R.string.rt_george,
                R.drawable.george_s_ocean_terrace));
        places.add(new Place(R.string.rt_island,
                R.drawable.island_prime_exterior));
        places.add(new Place(R.string.rt_herb,
                R.drawable.herb_wood));
        places.add(new Place(R.string.rt_ocean,
                R.drawable.oceanaire_seafood));
        places.add(new Place(R.string.rt_juniper,
                R.drawable.juniper_and_ivy));
        places.add(new Place(R.string.rt_marine,
                R.drawable.marine_room));
        places.add(new Place(R.string.rt_truluck,
                R.drawable.trulucks_seafood));
        places.add(new Place(R.string.rt_tom,
                R.drawable.top_ofmarket));


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