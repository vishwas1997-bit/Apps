package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class WaterFragmentDirections {
  private WaterFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionWaterFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_waterFragment_to_webview2);
  }
}
