package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class DthFragmentDirections {
  private DthFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDthFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_dthFragment_to_webview2);
  }
}
