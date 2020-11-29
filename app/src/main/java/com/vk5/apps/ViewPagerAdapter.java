package com.vk5.apps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    Integer images[];

    ViewPagerAdapter(Context context,Integer [] images)
    {
        this.context=context;
        this.images=images;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.viewpager_imagelayout,container,false);
        ImageView imageView=view.findViewById(R.id.viewpager_sliding_image);
        imageView.setImageResource(images[position]);

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container,int position, @NonNull Object object) {
        ViewPager vp= (ViewPager) container;
        View view= (View) object;
        vp.removeView(view);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
}
