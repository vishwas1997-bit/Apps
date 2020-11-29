package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class Shopping_FragmentDirections {
  private Shopping_FragmentDirections() {
  }

  @NonNull
  public static NavDirections actionShoppingFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_shopping_Fragment_to_webview2);
  }
}
