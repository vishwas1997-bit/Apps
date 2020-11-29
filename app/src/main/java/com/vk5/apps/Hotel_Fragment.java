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
public class Hotel_Fragment extends Fragment {

    View view;
    Bundle bundle;
    String hotel_title[]={"Oyo","Goibibo","MakeMyTrip","Booking.com","Cleartrip"};
    String hotel_description[]={"Book Hotels Online","Book Hotels Online","Book Hotels Online","Book Hotels Online","Book Hotels Online"};

    int imageid[]={
            R.drawable.oyo,
            R.drawable.goibibo,
            R.drawable.makemytrip,
            R.drawable.bookingcom,
            R.drawable.cleartrip,
    };
    public Hotel_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view=inflater.inflate(R.layout.fragment_hotel_, container, false);

        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        ListView listView=view.findViewById(R.id.listview_hotel);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),hotel_title,hotel_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        bundle.putString("text","Oyo on Apps");
                        bundle.putString("address","https://www.oyorooms.com/");
                        Navigation.findNavController(view).navigate(R.id.action_hotel_Fragment_to_webview2,bundle);
                        break;
                    case 1:
                        bundle.putString("text","Goibibo on Apps");
                        bundle.putString("address","https://www.goibibo.com/");
                        Navigation.findNavController(view).navigate(R.id.action_hotel_Fragment_to_webview2,bundle);
                        break;
                    case 2:
                        bundle.putString("text","MakeMyTrip on Apps");
                        bundle.putString("address","https://www.makemytrip.com/");
                        Navigation.findNavController(view).navigate(R.id.action_hotel_Fragment_to_webview2,bundle);
                        break;
                    case 3:
                        bundle.putString("text","Booking.com on Apps");
                        bundle.putString("address","https://www.booking.com/");
                        Navigation.findNavController(view).navigate(R.id.action_hotel_Fragment_to_webview2,bundle);
                        break;
                    case 4:
                        bundle.putString("text","ClearTrip on Apps");
                        bundle.putString("address","https://www.cleartrip.com/hotels");
                        Navigation.findNavController(view).navigate(R.id.action_hotel_Fragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return view;
    }
}
