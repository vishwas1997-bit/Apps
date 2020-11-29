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
public class TrainFragment extends Fragment {

    View view;
    Bundle bundle;
    String train_title[]={"IRCTC"};
    String train_description[]={"Book Train Tickets Online"};
    int imageid[]=
            {
                    R.drawable.irctc
            };

    public TrainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_train, container, false);
        bundle=new Bundle();
        TextView textView=new TextView(getActivity());
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        ListView listView=view.findViewById(R.id.listview_train);


        ListAdapter ListAdapter=new ListAdapter(getActivity(),train_title,train_description,imageid);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        bundle.putString("text","Irctc on Apps");
                        bundle.putString("address","https://www.irctc.co.in/nget/train-search");
                        Navigation.findNavController(view).navigate(R.id.action_trainFragment_to_webview2,bundle);
                        break;
                }
            }
        });
        return view;
    }
}
