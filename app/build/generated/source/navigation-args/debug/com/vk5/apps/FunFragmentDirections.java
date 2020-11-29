package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class FunFragmentDirections {
  private FunFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFunFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_funFragment_to_webview2);
  }
}
