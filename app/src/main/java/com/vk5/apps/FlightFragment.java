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
public class FlightFragment extends Fragment {

    View view;
    Bundle bundle;
    String flight_title[]={"Goibibo","MakeMyTrip","Booking.com","Cleartrip"};
    String flight_description[]={"Book Flight Online","Book Flight Online","Book Flight Online","Book Flight Online"};
    int imageid[]=
            {
                    R.drawable.goibibo,
                    R.drawable.makemytrip,
                    R.drawable.bookingcom,
                    R.drawable.cleartrip
            };
    public FlightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_flight, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);


        ListView listView=view.findViewById(R.id.listview_flight);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),flight_title,flight_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        bundle.putString("text","Goibibo on Apps");
                        bundle.putString("address", "https://www.goibibo.com/flights/");
                        Navigation.findNavController(view).navigate(R.id.action_flightFragment_to_webview2, bundle);
                        break;
                    case 1:
                        bundle.putString("text","MakeMyTrip on Apps");
                        bundle.putString("address", "https://www.makemytrip.com/flights/");
                        Navigation.findNavController(view).navigate(R.id.action_flightFragment_to_webview2, bundle);
                        break;
                    case 2:
                        bundle.putString("text","Booking.com on Apps");
                        bundle.putString("address", "https://booking.kayak.com/?origin=New+Delhi+%28DEL%29&origincode=DEL%2F32821&destination=chenni&destinationcode=&cabinType=e&M_3B-adults-input=1&M_3B-seniors-input=0&M_3B-youth-input=0&M_3B-child-input=0&M_3B-seatInfant-input=0&M_3B-lapInfant-input=0");
                        Navigation.findNavController(view).navigate(R.id.action_flightFragment_to_webview2, bundle);
                        break;
                    case 3:
                        bundle.putString("text","ClearTrip on Apps");
                        bundle.putString("address","https://www.cleartrip.com/flights");
                        Navigation.findNavController(view).navigate(R.id.action_flightFragment_to_webview2, bundle);
                        break;
                }
            }
        });
        return view;
    }
}
