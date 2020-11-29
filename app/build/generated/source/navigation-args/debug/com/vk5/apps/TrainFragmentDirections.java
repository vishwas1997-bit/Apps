package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class TrainFragmentDirections {
  private TrainFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionTrainFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_trainFragment_to_webview2);
  }
}
