package com.example.l0011638.myapplication2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> myAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);


        String[] myForecastArray = {
                "Today - Sunny - 88 / 63",
                "Tomorrow - Foggy - 70 / 46",
                "Wed - Cloudy  72 / 63",
                "Thur - Asteroids - 75 / 65",
                "Fri - Heavy Rain - 65 / 56",
                "Sat - HELP TRAPPED IN WEATHERSTATION - 60 / 51",
                "Sun - Sunny - 80 / 68",
                "Mon - Sunny - 210 / 4168",
                "Tue - Fuck this sun - 380 / 668",
                "Wed - Okay it's raining - 80 / 68",
                "Thur - Raining - 850 / 6668"
        };

        ArrayList<String> myWeather = new ArrayList<>(Arrays.asList(myForecastArray));

        myAdapter = new ArrayAdapter<>(
                getActivity(), //Current context (this fragment's parent activity)
                R.layout.list_item_forecast, //ID of list item layout
                R.id.list_item_forecast_textview, //ID of the textview to populate
                myWeather //Forecast data
        );

        ListView myListView = (ListView) view.findViewById(R.id.listview_forecast);

        myListView.setAdapter(myAdapter);

        //return inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}
