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
public class NewsFragment extends Fragment {

    Bundle bundle,bundeltext;
    String news_title[]={"MX Player"};
    String news_description[]={"Watch News"};
    int imageid[]=
            {
                    R.drawable.mxplayer
            };

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_news, container, false);

        bundle=new Bundle();
        bundeltext=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);


        ListView listView=view.findViewById(R.id.listview);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),news_title,news_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        bundle.putString("text","MXPlayer on Apps");
                        bundle.putString("address","https://www.mxplayer.in/news");
                        Navigation.findNavController(view).navigate(R.id.action_newsFragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return view;
    }
}
