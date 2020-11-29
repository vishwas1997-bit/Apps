package com.vk5.apps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Fragment extends Fragment {

    View view;
    ViewPagerAdapter myviewPagerAdapter;
    ViewPager myviewPager;
    LinearLayout dots;
    int currentPage;
    Timer timer;
    long dely_ms=5000;
    long period_ms=6000;
    ImageView imageView[];
    Integer images[]=
            {
                    R.drawable.food_inshot,
                    R.drawable.dessert_inshort,
                    R.drawable.hotel_inshort,
                    R.drawable.cinema_inshort,
                    R.drawable.grocery_inshot,
                    R.drawable.shopping_inshot
            };

    // Image Icon Declaration
    ImageView food,hotel,movie,shopping,medicine,cab,bus,train,flight,grocery,localoffer,homeservice,
              mobile,electric,dth,water,game,fun,news,ott;



    public Home_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_home_, container, false);

        setupPagerIndidcatorDots();  //This is Method and it is define Below

        myviewPager=view.findViewById(R.id.viewpager);
        myviewPagerAdapter=new ViewPagerAdapter(getContext(),images);
        myviewPager.setAdapter(myviewPagerAdapter);


        imageView[0].setImageResource(R.drawable.filled_bubble);
        myviewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i=0;i<imageView.length;i++)
                {
                    imageView[i].setImageResource(R.drawable.blank_bubble);
                }
                imageView[position].setImageResource(R.drawable.filled_bubble);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //auto scroll image start
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == images.length) {
                    currentPage = 0;
                }
                myviewPager.setCurrentItem(currentPage++, true);
            }
        };


        timer = new Timer(); // This will create a new Thread
        timer.schedule(new TimerTask() { // task to be scheduled
            @Override
            public void run() {
                handler.post(Update);
            }
        }, dely_ms, period_ms);

        //auto scroll image end


        food=view.findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_food_Fragment);
            }
        });
        hotel=view.findViewById(R.id.hotel);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_hotel_Fragment);
            }
        });
        movie=view.findViewById(R.id.movie);
        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_movie_Fragment);
            }
        });
        shopping=view.findViewById(R.id.shopping);
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_shopping_Fragment);
            }
        });
        medicine=view.findViewById(R.id.medicine);
        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_medicineFragment);
            }
        });
        cab=view.findViewById(R.id.cab);
        cab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_cabFragment);
            }
        });
        flight=view.findViewById(R.id.flight);
        flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_flightFragment);
            }
        });
        train=view.findViewById(R.id.train);
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_trainFragment);
            }
        });
        bus=view.findViewById(R.id.bus);
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_busFragment);
            }
        });
        grocery=view.findViewById(R.id.grocery);
        grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_groceryFragment);
            }
        });
        localoffer=view.findViewById(R.id.local_offer);
        localoffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_localOffersFragment);
            }
        });
        homeservice=view.findViewById(R.id.home_service);
        homeservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_homeServiceFragment);
            }
        });
        mobile=view.findViewById(R.id.Mobile);
        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_mobileFragment);
            }
        });
        electric=view.findViewById(R.id.electric);
        electric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_electricFragment);
            }
        });
        dth=view.findViewById(R.id.dth);
        dth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_dthFragment);
            }
        });
        water=view.findViewById(R.id.water);
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_waterFragment);
            }
        });
        game=view.findViewById(R.id.game);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_gameFragment);
            }
        });
        fun=view.findViewById(R.id.fun);
        fun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_funFragment);
            }
        });
        news=view.findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_newsFragment);
            }
        });
        ott=view.findViewById(R.id.ott);
        ott.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_home_Fragment_to_ottFragment);
            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        if (timer!=null)
        {
            timer.cancel();
        }
        super.onDestroyView();
    }

    // Initialize setupPagerIndicatorDots Method


    private void setupPagerIndidcatorDots() {
        dots=view.findViewById(R.id.ll_pager_dots);

        imageView = new ImageView[images.length];
        for (int i = 0; i < imageView.length; i++) {
            imageView[i] = new ImageView(getContext());
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(15, 15);
            params.setMargins(3, 0, 3, 0);
            imageView[i].setLayoutParams(params);
            imageView[i].setImageResource(R.drawable.blank_bubble);
            final int finalI = i;
            imageView[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myviewPager.setCurrentItem(finalI);
                }
            });
            dots.addView(imageView[i]);
            dots.bringToFront();
        }
    }

}
