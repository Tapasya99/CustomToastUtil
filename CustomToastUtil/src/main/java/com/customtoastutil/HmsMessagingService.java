package com.customtoastutil;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

//import com.huawei.hms.push.HmsMessageService;
//import com.huawei.hms.push.RemoteMessage;

import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;

import org.json.JSONObject;

public class HmsMessagingService extends HmsMessageService {
//    private Payload payload;


    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.i("compileOnly", "iZootoHmsMessagingService.onNewToken - "+s);
//        if (!s.isEmpty())
        HMSTokenGenerator.getTokenFromOnNewToken(s);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.i("CustomToastUtil", "PushType --- HMS ");
        Log.i("CustomToastUtil", "onMessageReceived: "+remoteMessage.getData());
//        handleNow(this, remoteMessage.getData());
    }
}
