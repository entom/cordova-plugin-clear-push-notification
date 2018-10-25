# Ionic Cordova Clear Push Notification Plugin

Feature of clear notification by ID parameter.

## Using
    
Install the plugin

    $ cd your_project_name
    $ cordova plugin add https://github.com/entom/cordova-plugin-clear-push-notification.git
    

Edit `www/js/index.js` and add the following code inside `onDeviceReady`

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error calling Plugin");
    }

    clearnotification.clear(100, success, failure);
```
