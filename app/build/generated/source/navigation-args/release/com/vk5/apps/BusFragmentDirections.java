package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class BusFragmentDirections {
  private BusFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionBusFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_busFragment_to_webview2);
  }
}
