package com.belajar.mysunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PlaceholderFragment extends Fragment {


    String[] forecastArray ={
            "Today - Sunny - 88/63",
            "Tomorrow - Foggy - 90/85",
            "Weds - Cloudy - 72/63",
            "Thurs - Asteroids - 88/63",
            "Fri - Heavy Rain - 88/63",
            "Sat - Run For your life - 70/88",
            "Sub - Sunny - 88/0"
    };

    public PlaceholderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.placeholderfragment,container,false);



            List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray)
            );

        ArrayAdapter mForescastAdapter = new ArrayAdapter<String>(
            getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
        );

   ListView listview = (ListView) rootView.findViewById(R.id.listview_forecast);
listview.setAdapter(mForescastAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }

}