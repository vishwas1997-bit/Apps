package com.vk5.apps;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

public class ListAdapter extends ArrayAdapter {

    Activity context;
    String food_title[];
    String food_description[];
    int imageid[];

    ListAdapter(Activity context,String food_title[],String food_description[],int imageid[])
    {
        super(context, R.layout.listviewdesign,food_title);
        this.context=context;
        this.food_title=food_title;
        this.food_description=food_description;
        this.imageid=imageid;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.listviewdesign, null, true);
        TextView textViewtitle = (TextView) row.findViewById(R.id.foodtextview_1);
        TextView textViewdescription = (TextView) row.findViewById(R.id.foodtextview2);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.foodlistimage_id);

        textViewtitle.setText(food_title[position]);
        textViewdescription.setText(food_description[position]);
        imageFlag.setImageResource(imageid[position]);


        return  row;
    }
}

