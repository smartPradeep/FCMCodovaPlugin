# Smartech Android Cordova Plugin

Smartech plugin for Activity tracking in cordova Android Application.

Greeting an activity track with "eventId" is something that could be done in JavaScript. This plugin provides Activity tracking in cordova Android Application.

## Using

Create a new Cordova Project

    $ cordova create smartech com.netcore.smartech Smartech
    $ cd smartech

Integrate Smartech SDK in created Cordova Project by following below github link

    https://github.com/NetcoreSolutions/Smartech-Android-GCM-SDK

Install the plugin

    $ cordova plugin add https://github.com/NetcoreSolutions/Smartech-Cordova-Android-GCM-Plugin.git
    

Edit `www/js/index.js` and add the following code inside `onDeviceReady`

```js
    var success = function(message) {
        alert(message);
    }
    var failure = function() {
        alert("Error While APi Call");
    }
    smartech.track("<eventId>", success, failure);

// For Ex. for FirstApp launch :- smartech.track("20", success, failure);
// For Ex. for App launch :- smartech.track("21", success, failure);
```

Note: For other custom Events add where the activity called not inside onDeviceReady

Install Android platform

    cordova platform add android
    
Run the code

    cordova run 

## More Info

For more information on setting up Cordova see [the documentation](http://cordova.apache.org/docs/en/latest/guide/cli/index.html)

For more info on plugins see the [Plugin Development Guide](http://cordova.apache.org/docs/en/latest/guide/hybrid/plugins/index.html)

