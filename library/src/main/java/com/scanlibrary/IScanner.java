package com.scanlibrary;

import android.net.Uri;

/**
 * Created by jhansi on 04/04/15.
 */
public interface IScanner {

    void onBitmapSelect(Uri uri);
    void onBitmapSelect(Uri uri, int outputQuality, int targetWidth, int targetHeight);

    void onScanFinish(Uri uri);
    int outputQuality=80;
    int targetWidth=1600;
    int targetHeight=1600;
}
