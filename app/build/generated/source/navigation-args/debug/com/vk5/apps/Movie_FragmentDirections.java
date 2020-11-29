package com.vk5.apps;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class Movie_FragmentDirections {
  private Movie_FragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMovieFragmentToWebview2() {
    return new ActionOnlyNavDirections(R.id.action_movie_Fragment_to_webview2);
  }
}
