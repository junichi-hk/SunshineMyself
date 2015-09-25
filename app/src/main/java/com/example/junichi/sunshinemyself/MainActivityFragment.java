package com.example.junichi.sunshinemyself;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String [] forecastArray = {
                "Today - Sunny 30/25",
                "Tomorrow - Piggy 38/25",
                "Wed - Doggy 31/23",
                "Thu - Foggy 20/17",
                "Fri - Rain 23/18",
                "Sat - Rainbow 32/25",
                "Sun - Sunny 30/25",
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecastAdapter);

//        return inflater.inflate(R.layout.fragment_main, container, false);
        return(rootView);
    }
}
