package com.iitg.sgc;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Raunak on 10/21/2015.
 */
public class CommonUtilities {

    // give your server registration url here
    static final String SERVER_URL = "http://sgciitgserver.16mb.com/gcm_server1_php/register.php";

    // Google project id
    public static final String SENDER_ID = "1021069950176";

    /**
     * Tag used on log messages.
     */
    static final String TAG = "AndroidHive GCM";

    public static final String DISPLAY_MESSAGE_ACTION =
            "com.example.raunak.gcm_hive.DISPLAY_MESSAGE";

    public  static final String EXTRA_MESSAGE = "message";


    /**
     * Notifies UI to display a message.
     * <p>
     * This method is defined in the common helper because it's used both by
     * the UI and the background service.
     *
     * @param context application's context.
     * @param message1 message to be displayed.
     * */
    static void displayMessage(Context context, String message1) {
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message1);
    }
}
