package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class OttFragmentDirections {
  private OttFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOttFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_ottFragment_to_webview2);
  }
}
