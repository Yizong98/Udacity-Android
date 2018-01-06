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
 * {@link Fragment} that displays a list of companies.
 */
public class CompanyFragment extends Fragment {


    public CompanyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.cp_bam,
                R.drawable.bam_communications_el_cortez));
        places.add(new Place(R.string.cp_consortium,
                R.drawable.consortium_holdings_american_phycho));
        places.add(new Place(R.string.cp_fuse,
                R.drawable.fuse_integration_east_village));
        places.add(new Place(R.string.cp_gopro,
                R.drawable.gopro_carlsbad));
        places.add(new Place(R.string.cp_honest,
                R.drawable.honest_kitchen_san_diego));
        places.add(new Place(R.string.cp_illumina,
                R.drawable.illumina_utc_san_diego));
        places.add(new Place(R.string.cp_lpw,
                R.drawable.lpw_group_barrio_logan));
        places.add(new Place(R.string.cp_j,
                R.drawable.j_public_relations_downtown_san_diego));
        places.add(new Place(R.string.cp_sempra,
                R.drawable.sempra_energy_downtown_san_diego));
        places.add(new Place(R.string.cp_underground,
                R.drawable.underground_elephant_east_village));

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