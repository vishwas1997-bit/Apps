package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class Hotel_FragmentDirections {
  private Hotel_FragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHotelFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_hotel_Fragment_to_webview2);
  }
}
