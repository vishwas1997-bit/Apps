package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class NewsFragmentDirections {
  private NewsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNewsFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_newsFragment_to_webview2);
  }
}
