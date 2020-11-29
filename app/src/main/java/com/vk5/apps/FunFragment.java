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
public class FunFragment extends Fragment {

    Bundle bundle;
    String fun_title[]={"ShareChat","Tik Tok","Likee","Helo"};
    String fun_description[]={"Entertainment","Entertainment","Entertainment","Entertainment"};
    int imageid[]=
            {
                    R.drawable.sharechat,
                    R.drawable.tiktok,
                    R.drawable.likee,
                    R.drawable.helo
            };

    public FunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fun, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getContext());
        textView.setTypeface(Typeface.DEFAULT_BOLD);


        ListView listView=view.findViewById(R.id.listview);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),fun_title,fun_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        bundle.putString("text","ShareChat on Apps");
                        bundle.putString("address","https://sharechat.com/");
                        Navigation.findNavController(view).navigate(R.id.action_funFragment_to_webview2,bundle);
                        break;
                    case 1:
                        bundle.putString("text","Tik Tok on Apps");
                        bundle.putString("address","https://www.tiktok.com/trending/?lang=en");
                        Navigation.findNavController(view).navigate(R.id.action_funFragment_to_webview2,bundle);
                        break;
                    case 2:
                        bundle.putString("text","Likee on Apps");
                        bundle.putString("address","https://likee.com/trending");
                        Navigation.findNavController(view).navigate(R.id.action_funFragment_to_webview2,bundle);
                        break;
                    case 3:
                        bundle.putString("text","Helo on Apps");
                        bundle.putString("address","https://www.helo-app.com/explore/");
                        Navigation.findNavController(view).navigate(R.id.action_funFragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return view;
    }
}
