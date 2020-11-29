package com.vk5.apps;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Movie_Fragment extends Fragment {

    View view;
    Bundle bundle;
    String movies_title[]={"BookMyShow"};
    String movies_description[]={"Book Movies Tickets"};

    int imageid[]={
            R.drawable.bookmyshow};

    public Movie_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_movie_, container, false);

        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        ListView listView=view.findViewById(R.id.listview_movie);


        ListAdapter ListAdapter=new ListAdapter(getActivity(),movies_title,movies_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        bundle.putString("text","BookMyShow on Apps");
                        bundle.putString("address", "https://in.bookmyshow.com/");
                        Navigation.findNavController(view).navigate(R.id.action_movie_Fragment_to_webview2, bundle);
                        break;
                }
            }
        });
        return view;
    }
}
