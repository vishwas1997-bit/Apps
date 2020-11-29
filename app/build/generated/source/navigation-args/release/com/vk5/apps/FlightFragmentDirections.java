package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class FlightFragmentDirections {
  private FlightFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFlightFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_flightFragment_to_webview2);
  }
}
