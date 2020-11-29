package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class MedicineFragmentDirections {
  private MedicineFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMedicineFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_medicineFragment_to_webview2);
  }
}
