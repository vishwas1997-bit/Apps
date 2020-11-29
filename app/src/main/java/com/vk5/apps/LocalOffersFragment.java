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
public class LocalOffersFragment extends Fragment {

    Bundle bundle;
    String localoffers_title[]={"Nearbuy"};
    String localoffers_description[]={"Find Local Offers"};

    int imageid[]=
            {
                    R.drawable.nearbuy
            };

    public LocalOffersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_local_offers, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        ListView listView=view.findViewById(R.id.listview);


        ListAdapter ListAdapter=new ListAdapter(getActivity(),localoffers_title,localoffers_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        bundle.putString("text","NearBuy on Apps");
                        bundle.putString("address", "https://www.nearbuy.com/");
                        Navigation.findNavController(view).navigate(R.id.action_localOffersFragment_to_webview2, bundle);
                        break;
                }
            }
        });
        return view;
    }
}
