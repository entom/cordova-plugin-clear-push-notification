/*global cordova, module*/

module.exports = {
    clear: function (id, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Clearnotification", "clear", [id]);
    }
};
