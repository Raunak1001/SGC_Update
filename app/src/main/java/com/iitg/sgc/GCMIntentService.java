package com.iitg.sgc;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.android.gcm.GCMBaseIntentService;

import java.util.Calendar;

import static com.iitg.sgc.CommonUtilities.SENDER_ID;
import static com.iitg.sgc.CommonUtilities.displayMessage;
/**
 * Created by Raunak on 10/21/2015.
 */
public class GCMIntentService extends GCMBaseIntentService {


    private static final String TAG = "GCMIntentService";
    String[] notifications=new String[12];
    String[] results=new String[12];
    Boolean techtogle,culttoggle,sportstoggle,weltoggle,hosteltoggle,restoggle;



    public GCMIntentService() {
        super(SENDER_ID);
    }

    /**
     * Method called on device registered
     **/
    @Override
    protected void onRegistered(Context context, String registrationId) {
        Log.i(TAG, "Device registered: regId = " + registrationId);
        displayMessage(context, "Your device registred with GCM");
        ServerUtilities.register(context, registrationId);
    }

    /**
     * Method called on device un registred
     * */
    @Override
    protected void onUnregistered(Context context, String registrationId) {
        Log.i(TAG, "Device unregistered");
        ServerUtilities.unregister(context, registrationId);
    }

    /**
     * Method called on Receiving a new message
     * */
    @Override
    protected void onMessage(Context context, Intent intent) {
        Log.i(TAG, "Received message");
        String message1 = intent.getExtras().getString("title");
        SharedPreferences a = getSharedPreferences("Notifications", 0);
        SharedPreferences.Editor editor = a.edit();
        SharedPreferences b = getSharedPreferences("Results", 0);
        SharedPreferences.Editor editor1 = b.edit();
        SharedPreferences c = getSharedPreferences("Toggle", 0);
        String[] z = new String[1];
        if (message1 != null) {
            z = message1.split("\n");
        }

techtogle=c.getBoolean("TECH",true);
        culttoggle=c.getBoolean("CULT",true);
        weltoggle=c.getBoolean("WELF",true);
        hosteltoggle=c.getBoolean("HAB",true);
        sportstoggle=c.getBoolean("SPORT",true);
        restoggle=c.getBoolean("RES",true);

        if (z[1].trim().equalsIgnoreCase("Current")) {
            for (int i = 1; i < 12; i++) {
                notifications[i] = a.getString("Noti" + i, "");

            }

            editor.putString("Noti11", message1);
            editor.commit();

            if (!notifications[1].equalsIgnoreCase(notifications[11])) {
                for (int i = 10; i > 1; i--) {
                    editor.putString("Noti" + i, notifications[i - 1]);
                    editor.commit();
                }
                editor.putString("Noti1", notifications[11]);
                editor.commit();

                if ((z[0].trim().equalsIgnoreCase("Technical") && techtogle) || (z[0].trim().equalsIgnoreCase("Cultural") && culttoggle) || (z[0].trim().equalsIgnoreCase("Sports") && sportstoggle) || (z[0].trim().equalsIgnoreCase("Welfare") && weltoggle) || (z[0].trim().equalsIgnoreCase("HAB") && hosteltoggle) || (z[0].trim().equalsIgnoreCase("Other"))) {

                    // notifies user
                    generateNotification(context, message1);
                }
            }
        }
        else if(z[1].trim().equalsIgnoreCase("Upcoming")) {
            for (int i = 1; i < 12; i++) {
                results[i] = b.getString("Resulti" + i, "");

            }

            editor1.putString("Resulti11", message1);
            editor1.commit();

            if (!results[1].equalsIgnoreCase(results[11])) {
                for (int i = 10; i > 1; i--) {
                    editor1.putString("Resulti" + i, results[i - 1]);
                    editor1.commit();
                }
                editor1.putString("Resulti1", results[11]);
                editor1.commit();




            }
        }






    }

    /**
     * Method called on receiving a deleted message
     * */
    @Override
    protected void onDeletedMessages(Context context, int total) {

    }

    /**
     * Method called on Error
     * */
    @Override
    public void onError(Context context, String errorId) {

    }

    @Override
    protected boolean onRecoverableError(Context context, String errorId) {
        // log message

        return false;
    }

    /**
     * Issues a notification to inform the user that server has sent a message.
     */
    private void generateNotification(Context context, String message) {

        NotificationManager notificationManager = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);
       // Notification notification = new Notification(icon, message, when);



      message=message+"\n \n \n \n \n";


    String[] q=message.split("\n");

        String show = q[3] + "\n" + q[4];
        Calendar c = Calendar.getInstance();
        int seconds = c.get(Calendar.MILLISECOND);
        String title = q[2];

        Intent notificationIntent = new Intent(context, Notification.class);
        // set intent so it does not start a new activity
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
              Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent intent =
                PendingIntent.getActivity(context, 0, notificationIntent,seconds );
        android.app.Notification.Builder builder = new android.app.Notification.Builder(context);
        builder.setSmallIcon(R.drawable. notification_template_icon_bg)
                .setContentTitle(title)
                .setContentText(show)
                .setContentIntent(intent)
        .setSmallIcon(R.mipmap.ic_launcher);

      android.app.Notification notification = builder.getNotification();

        notification.flags |= android.app.Notification.FLAG_AUTO_CANCEL;

        // Play default notification sound
        notification.defaults |= android.app.Notification.DEFAULT_SOUND;

        //notification.sound = Uri.parse("android.resource://" + context.getPackageName() + "your_sound_file_name.mp3");

        // Vibrate if vibrate is enabled
        notification.defaults |= android.app.Notification.DEFAULT_VIBRATE;
        notificationManager.notify(seconds, notification);

    }


}
