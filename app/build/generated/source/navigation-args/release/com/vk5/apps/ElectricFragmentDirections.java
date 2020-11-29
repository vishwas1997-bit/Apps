package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class ElectricFragmentDirections {
  private ElectricFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionElectricFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_electricFragment_to_webview2);
  }
}
