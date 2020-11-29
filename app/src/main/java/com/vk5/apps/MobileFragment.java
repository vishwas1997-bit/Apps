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
public class MobileFragment extends Fragment {

    Bundle bundle;
    String mobile_title[]={"Amazon","Mobikwik","FreeCharge"};
    String mobile_description[]={"Online Recharge","Online Recharge","Online Recharge"};
    int imageid[]=
            {
                    R.drawable.amazon,
                    R.drawable.mobikwik,
                    R.drawable.freecharge
            };

    public MobileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mobile, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);


        ListView listView=view.findViewById(R.id.listview);

        ListAdapter ListAdapter=new ListAdapter(getActivity(),mobile_title,mobile_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        bundle.putString("text","Amazon on Apps");
                        bundle.putString("address","https://www.amazon.in/hfc/mobileRecharge");
                        Navigation.findNavController(view).navigate(R.id.action_mobileFragment_to_webview2,bundle);
                        break;
                    case 1:
                        bundle.putString("text","Mobikwik on Apps");
                        bundle.putString("address","https://www.mobikwik.com/prepaid-recharge");
                        Navigation.findNavController(view).navigate(R.id.action_mobileFragment_to_webview2,bundle);
                        break;
                    case 2:
                        bundle.putString("text","FreeCharge on Apps");
                        bundle.putString("address","https://www.freecharge.in/prepaid");
                        Navigation.findNavController(view).navigate(R.id.action_mobileFragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return view;
    }
}
