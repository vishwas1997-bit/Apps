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
public class Shopping_Fragment extends Fragment {

    View view;
    Bundle bundle;
    String shopping_title[]={"Flipkart","Amazon","Myntra","Ajio","2GUD","Snapdeal"};
    String shopping_description[]={"Online Shopping","Online Shopping","Online Fashion Shop","Online Fashion and Apparels"
                                   ,"Online Refurbished Electronics","Online Shopping"};
    int imageid[]={R.drawable.flipkart,
                   R.drawable.amazon,
                   R.drawable.myntra,
                   R.drawable.ajio,
                   R.drawable.twogud,
                   R.drawable.snapdeal};

    public Shopping_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_shopping_, container, false);

        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        ListView listView=view.findViewById(R.id.listview_shopping);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),shopping_title,shopping_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        bundle.putString("text","Flipkart on Apps");
                        bundle.putString("address","https://www.flipkart.com/");
                        Navigation.findNavController(view).navigate(R.id.action_shopping_Fragment_to_webview2,bundle);
                        break;
                    case 1:
                        bundle.putString("text","Amazon on Apps");
                        bundle.putString("address","https://www.amazon.in/");
                        Navigation.findNavController(view).navigate(R.id.action_shopping_Fragment_to_webview2,bundle);
                        break;
                    case 2:
                        bundle.putString("text","Myntra on Apps");
                        bundle.putString("address","https://www.myntra.com/");
                        Navigation.findNavController(view).navigate(R.id.action_shopping_Fragment_to_webview2,bundle);
                        break;
                    case 3:
                        bundle.putString("text","Ajio on Apps");
                        bundle.putString("address","https://www.ajio.com/");
                        Navigation.findNavController(view).navigate(R.id.action_shopping_Fragment_to_webview2,bundle);
                        break;
                    case 4:
                        bundle.putString("text","2Gud on Apps");
                        bundle.putString("address","https://www.2gud.com/");
                        Navigation.findNavController(view).navigate(R.id.action_shopping_Fragment_to_webview2,bundle);
                        break;
                    case 5:
                        bundle.putString("text","Snapdeal on Apps");
                        bundle.putString("address","https://www.snapdeal.com/");
                        Navigation.findNavController(view).navigate(R.id.action_shopping_Fragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return view;
    }
}
