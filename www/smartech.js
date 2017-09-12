/*global cordova, module*/

module.exports = {
   track: function (eventId, successCallback, errorCallback) {
      cordova.exec(successCallback, errorCallback, "Smartech", "track", [eventId]);
   }
};
