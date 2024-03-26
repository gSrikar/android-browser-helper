package com.google.androidbrowserhelper.trusted;

import android.content.Context;
import android.webkit.JavascriptInterface;

import androidx.annotation.NonNull;

public class WebViewInterface {
    @NonNull
    private final EventInterface eventInterface;

    public WebViewInterface(@NonNull final EventInterface eventInterface) {
        this.eventInterface = eventInterface;
    }

    @JavascriptInterface
    public void syncData(String data) {
        eventInterface.syncData(data);
    }

}
