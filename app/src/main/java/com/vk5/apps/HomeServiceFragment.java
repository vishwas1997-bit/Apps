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
public class HomeServiceFragment extends Fragment {

    Bundle bundle;
    String homeservice_title[]={"HouseJoy","UrbanClap"};
    String homeservice_description[]={"Beauty and Home Service","Book Salon and Home Services"};

    int imageid[]=
            {
                    R.drawable.housejoy,
                    R.drawable.urbanclap
            };

    public HomeServiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_service, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        ListView listView=view.findViewById(R.id.listview);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),homeservice_title,homeservice_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        bundle.putString("text","HouseJoy on Apps");
                        bundle.putString("address","https://www.housejoy.in/");
                        Navigation.findNavController(view).navigate(R.id.action_homeServiceFragment_to_webview2,bundle);
                        break;
                    case 1:
                        bundle.putString("text","UrbanClap on Apps");
                        bundle.putString("address","https://www.urbancompany.com/");
                        Navigation.findNavController(view).navigate(R.id.action_homeServiceFragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return view;
    }
}
