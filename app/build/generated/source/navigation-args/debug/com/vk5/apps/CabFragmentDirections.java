package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class CabFragmentDirections {
  private CabFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCabFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_cabFragment_to_webview2);
  }
}
