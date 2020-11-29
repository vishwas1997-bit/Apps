package com.vk5.apps;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Food_Fragment extends Fragment {

    Bundle bundle;
    String food_title[]={"Swiggy","Dominos","McDonald's","Zomato","Pizza Hut"};

    String food_description[]={
            "Order Food Online","Order Pizza Online","Order Food Online","Order Food Online","Order Pizza Online"};

    int imageid[]={
            R.drawable.swiggy,
            R.drawable.dominos,
            R.drawable.mc_donalds,
            R.drawable.zomato,
            R.drawable.pizza_hut,
    };
    public Food_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_food_, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getContext());
        textView.setTypeface(Typeface.DEFAULT_BOLD);


        ListView listView=view.findViewById(R.id.listview);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),food_title,food_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position)
                {
                    case 0:
                           bundle.putString("text","Swiggy on Apps");
                           bundle.putString("address","https://www.swiggy.com/");
                           Navigation.findNavController(view).navigate(R.id.action_food_Fragment_to_webview2,bundle);
                           break;
                    case 1:
                           bundle.putString("text","Dominos on Apps");
                           bundle.putString("address","https://m.dominos.co.in/");
                           Navigation.findNavController(view).navigate(R.id.action_food_Fragment_to_webview2,bundle);
                        break;
                    case 2:
                           bundle.putString("text","McDonalds on Apps");
                           bundle.putString("address","https://www.mcdonaldsindia.com/home.html");
                           Navigation.findNavController(view).navigate(R.id.action_food_Fragment_to_webview2,bundle);
                        break;
                    case 3:
                            bundle.putString("text","Zomato on Apps");
                            bundle.putString("address","https://www.zomato.com/kota");
                            Navigation.findNavController(view).navigate(R.id.action_food_Fragment_to_webview2,bundle);
                        break;
                    case 4:
                            bundle.putString("text","PizzaHut on Apps");
                            bundle.putString("address","https://www.pizzahut.co.in/");
                            Navigation.findNavController(view).navigate(R.id.action_food_Fragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return view;
    }
}
