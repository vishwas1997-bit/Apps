package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class Food_FragmentDirections {
  private Food_FragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFoodFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_food_Fragment_to_webview2);
  }
}
