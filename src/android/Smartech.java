package com.netcore.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import com.netcore.lib.ActivityLifeCycleCallBack;
import com.netcore.lib.NetcorePrefs;
import com.netcore.lib.NetcorePush;
import com.netcore.lib.NetcoreSDK;

public class Smartech extends CordovaPlugin {
   NetcoreSDK.Config config;
   public long sessionId;
   @Override
   public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

      if (action.equals("greet")) {
         sessionId = System.currentTimeMillis();
         NetcoreSDK.registerAppEvent( this, 3, sessionId, System.currentTimeMillis(), "", "", config );
         String name = data.getString(0);
         String message = "Hello, " + name;
         callbackContext.success(message);
         return true;
      } else {
         return false;
      }
   }
}
