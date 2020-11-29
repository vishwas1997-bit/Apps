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
public class GroceryFragment extends Fragment {

    Bundle bundle;
    String grocery_title[]={"BigBasket","Grofers"};
    String grocery_description[]={"Order Grocery Online","Order Grocery Online"};

    int imageid[]=
            {
                    R.drawable.bigbasket,
                    R.drawable.grofers
            };

    public GroceryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_grocery, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        ListView listView=view.findViewById(R.id.listview);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),grocery_title,grocery_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        bundle.putString("text","Bigbasket on Apps");
                        bundle.putString("address","https://www.bigbasket.com/");
                        Navigation.findNavController(view).navigate(R.id.action_groceryFragment_to_webview2,bundle);
                        break;
                    case 1:
                        bundle.putString("text","Grofers on Apps");
                        bundle.putString("address","https://grofers.com/");
                        Navigation.findNavController(view).navigate(R.id.action_groceryFragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return view;
    }
}
