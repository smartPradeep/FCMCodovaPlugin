package com.netcore.plugin;

import android.content.Context;
import com.netcore.lib.NetcoreSDK;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class Smartech extends CordovaPlugin {
   NetcoreSDK.Config config;
   public long sessionId;

   @Override
   public boolean execute(String action, JSONArray data, final CallbackContext callbackContext) throws JSONException {
      final Context context = this.cordova.getActivity().getApplicationContext();
      sessionId = System.currentTimeMillis();
      config = new NetcoreSDK.Config();
      if (action.equals("track")) {
         String eventId = data.getString(0);
         NetcoreSDK.registerAppEvent(context, Integer.parseInt(eventId), sessionId, System.currentTimeMillis(), "", "", config);
         String message = "Track, " + eventId;
         callbackContext.success(message);
         return true;
      } else {
         return false;
      }
   }
}
