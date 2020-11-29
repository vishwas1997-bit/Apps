package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class HomeServiceFragmentDirections {
  private HomeServiceFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeServiceFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_homeServiceFragment_to_webview2);
  }
}
