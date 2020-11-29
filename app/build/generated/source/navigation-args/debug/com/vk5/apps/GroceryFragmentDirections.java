package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class GroceryFragmentDirections {
  private GroceryFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGroceryFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_groceryFragment_to_webview2);
  }
}
