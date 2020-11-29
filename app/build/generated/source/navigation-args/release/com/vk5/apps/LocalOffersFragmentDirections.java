package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class LocalOffersFragmentDirections {
  private LocalOffersFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLocalOffersFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_localOffersFragment_to_webview2);
  }
}
