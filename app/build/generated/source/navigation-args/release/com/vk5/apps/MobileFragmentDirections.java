package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class MobileFragmentDirections {
  private MobileFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMobileFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_mobileFragment_to_webview2);
  }
}
