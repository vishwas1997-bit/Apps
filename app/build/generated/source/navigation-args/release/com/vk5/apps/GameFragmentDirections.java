package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class GameFragmentDirections {
  private GameFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGameFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_gameFragment_to_webview2);
  }
}
