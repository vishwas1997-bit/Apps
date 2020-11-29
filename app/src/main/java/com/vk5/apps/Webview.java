package com.vk5.apps;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static android.content.ContentValues.TAG;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;


/**
 * A simple {@link Fragment} subclass.
 */
public class Webview extends Fragment {

    String url_address,toolbar_text;
    ProgressDialog progressDialog;

    public Webview() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_webview, container, false);

        WebView webView=view.findViewById(R.id.webview);
        toolbar_text=getArguments().getString("text");
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(toolbar_text);
        url_address=getArguments().getString("address");
        progressDialog=new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading please wait");
        webView.setWebViewClient(new WebViewClient()
                                 {
                                     @Override
                                     public void onPageStarted(WebView view, String url, Bitmap favicon) {
                                         super.onPageStarted(view, url, favicon);
                                         progressDialog.show();
                                     }

                                     @Override
                                     public void onPageFinished(WebView view, String url) {
                                         super.onPageFinished(view, url);
                                         progressDialog.dismiss();
                                     }

                                 }
        );
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.getSettings().setSupportZoom(true);
        webView.loadUrl(url_address);

        webView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    WebView webView1= (WebView) v;

                    switch (keyCode)
                    {
                        case KeyEvent.KEYCODE_BACK:
                            if (webView1.canGoBack())
                            {
                                webView1.goBack();
                                return true;
                            }
                            break;
                    }
                }
                return false;
            }
        });
        return view;
    }
}

