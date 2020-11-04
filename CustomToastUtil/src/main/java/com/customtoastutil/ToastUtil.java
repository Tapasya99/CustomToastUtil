package com.customtoastutil;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static void makeToast(Context context){
        Toast.makeText(context, "customToastLibrary", Toast.LENGTH_SHORT).show();
    }
}
