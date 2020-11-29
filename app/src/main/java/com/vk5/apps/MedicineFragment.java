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
public class MedicineFragment extends Fragment {

    View view;
    Bundle bundle;
    String medicine_title[]={"1mg","PharmEasy","NetMeds","ApolloPharmecy","Medlife"};
    String medicine_description[]={"Order Medicines Online","Order Medicines Online","Order Medicines Online",
            "Order Medicines Online","Order Medicines Online","Order Medicines Online"};
    int imageid[]={
                   R.drawable.onemg,
                   R.drawable.pharmeasy,
                   R.drawable.netmeds,
                   R.drawable.apollopharmacy,
                   R.drawable.medlife,
    };
    public MedicineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_medicine, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        ListView listView=view.findViewById(R.id.listview_medicine);


        ListAdapter ListAdapter=new ListAdapter(getActivity(),medicine_title,medicine_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        bundle.putString("text","1Mg on Apps");
                        bundle.putString("address","https://www.1mg.com/");
                        Navigation.findNavController(view).navigate(R.id.action_medicineFragment_to_webview2,bundle);
                        break;
                    case 1:
                        bundle.putString("text","Pharmeasy on Apps");
                        bundle.putString("address","https://pharmeasy.in/");
                        Navigation.findNavController(view).navigate(R.id.action_medicineFragment_to_webview2,bundle);
                        break;
                    case 2:
                        bundle.putString("text","Netmeds on Apps");
                        bundle.putString("address","https://www.netmeds.com/");
                        Navigation.findNavController(view).navigate(R.id.action_medicineFragment_to_webview2,bundle);
                        break;
                    case 3:
                        bundle.putString("text","ApolloPharmacy on Apps");
                        bundle.putString("address","https://www.apollopharmacy.in/");
                        Navigation.findNavController(view).navigate(R.id.action_medicineFragment_to_webview2,bundle);
                        break;
                    case 4:
                        bundle.putString("text","Medlife on Apps");
                        bundle.putString("address","https://www.medlife.com/");
                        Navigation.findNavController(view).navigate(R.id.action_medicineFragment_to_webview2,bundle);
                        break;

                }
            }
        });
        return view;
    }
}
