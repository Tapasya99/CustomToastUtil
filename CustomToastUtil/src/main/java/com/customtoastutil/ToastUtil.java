package com.customtoastutil;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class ToastUtil {
    public static void makeToast(Context context, String HMS_id){
        Toast.makeText(context, "customToastLibrary", Toast.LENGTH_SHORT).show();
        if (!HMS_id.isEmpty())
            initHmsService(context);
    }

    private static void initHmsService(final Context context){
        HMSTokenGenerator hmsTokenGenerator = new HMSTokenGenerator();
        hmsTokenGenerator.getHMSToken(context, new HMSTokenListener.HMSTokenGeneratorHandler() {
            @Override
            public void complete(String id) {
//                PreferenceUtil preferenceUtil = PreferenceUtil.getInstance(appContext);
//                preferenceUtil.setStringData(AppConstant.HMS_TOKEN,id);
                Log.i("CustomToastUtil", "complete: id--"+id);
            }

            @Override
            public void failure(String errorMessage) {
                Log.e("CustomToastUtil", "failure: "+errorMessage );
            }
        });
    }

}
