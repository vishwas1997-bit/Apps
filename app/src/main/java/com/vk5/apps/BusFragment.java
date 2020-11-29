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
public class BusFragment extends Fragment {

    View view;
    Bundle bundle;
    String bus_title[]={"RedBus","MakeMyTrip","Goibibo"};
    String bus_description[]={"Book Bus Tickets Online","Book Bus Tickets Online","Book Bus Tickets Online"};
    int imageid[]=
            {
                    R.drawable.redbus,
                    R.drawable.makemytrip,
                    R.drawable.goibibo
            };

    public BusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_bus, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        ListView listView=view.findViewById(R.id.listview_bus);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),bus_title,bus_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        bundle.putString("text","RedBus on Apps");
                        bundle.putString("address", "https://www.redbus.in/");
                        Navigation.findNavController(view).navigate(R.id.action_busFragment_to_webview2, bundle);
                        break;
                    case 1:
                        bundle.putString("text","MakeMyTrip on Apps");
                        bundle.putString("address", "https://www.makemytrip.com/bus-tickets/");
                        Navigation.findNavController(view).navigate(R.id.action_busFragment_to_webview2, bundle);
                        break;
                    case 2:
                        bundle.putString("text","Goibibo on Apps");
                        bundle.putString("address", "https://www.goibibo.com/bus/#home");
                        Navigation.findNavController(view).navigate(R.id.action_busFragment_to_webview2, bundle);
                        break;
                }
            }
        });
        return view;
    }
}
