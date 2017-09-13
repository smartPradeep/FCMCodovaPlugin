/*global cordova, module*/

module.exports = {
   track: function (data, successCallback, errorCallback) {
      cordova.exec(successCallback, errorCallback, "Smartech", "track", [data]);
   }
};
