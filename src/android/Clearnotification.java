package info.entom.plugin;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.util.Log;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Clearnotification extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("clear")) {
            String id = data.getString(0);
            String message = "Id = " + id;
            StatusBarNotification[] notifs;

            NotificationManager notificationManager = (NotificationManager)this.cordova.getContext().getSystemService(Context.NOTIFICATION_SERVICE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                notifs = notificationManager.getActiveNotifications();
                for (StatusBarNotification notif : notifs) {
                    StatusBarNotification notif1 = notif;
                    if (Integer.parseInt(id) == notif.getId()) {
                        notificationManager.cancel(notif.getTag(), notif.getId());
                    }
                }
            }

            callbackContext.success(message);

            return true;
        } else {
            return false;
        }
    }
}
