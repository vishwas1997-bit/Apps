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
public class GameFragment extends Fragment {

    Bundle bundle;
    String game_title[]={"Dream11","Arkadium"};
    String game_description[]={"Play Game","Play Game"};
    int imageid[]=
            {R.drawable.dream11,R.drawable.game1};

    public GameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_game, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);


        ListView listView=view.findViewById(R.id.listview);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),game_title,game_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        bundle.putString("text","Dream11 on Apps");
                        bundle.putString("address","https://www.dream11.com/login?ru=%2Fleagues");
                        Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_webview2,bundle);
                        break;
                    case 1:
                        bundle.putString("text","Arkadium on Apps");
                        bundle.putString("address","https://www.arkadium.com/free-online-games/");
                        Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return view;
    }
}
