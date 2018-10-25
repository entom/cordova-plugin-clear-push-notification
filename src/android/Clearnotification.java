package info.entom.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Clearnotification extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("clear")) {
            String id = data.getString(0);
            String message = "Id = " + id;
            callbackContext.success(message);

            return true;
        } else {
            return false;
        }
    }
}
