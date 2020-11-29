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
public class CabFragment extends Fragment {

    View view;
    Bundle bundle;
    String cab_title[]={"Ola","Uber","Zoomcar"};
    String cab_description[]={"Book Cab Online","Book Cab Online","Book Cab Online"};
    int imageid[]={
                  R.drawable.ola,
                  R.drawable.uber,
                  R.drawable.zoomcar};

    public CabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_cab, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        ListView listView=view.findViewById(R.id.listview_cab);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),cab_title,cab_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        bundle.putString("text","Ola on Apps");
                        bundle.putString("address","https://www.olacabs.com/");
                        Navigation.findNavController(view).navigate(R.id.action_cabFragment_to_webview2,bundle);
                        break;
                    case 1:
                        bundle.putString("text","Uber on Apps");
                        bundle.putString("address","https://www.uber.com/in/en/");
                        Navigation.findNavController(view).navigate(R.id.action_cabFragment_to_webview2,bundle);
                        break;
                    case 2:
                        bundle.putString("text","Zoomcar on Apps");
                        bundle.putString("address","https://www.zoomcar.com/");
                        Navigation.findNavController(view).navigate(R.id.action_cabFragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return  view;
    }
}
