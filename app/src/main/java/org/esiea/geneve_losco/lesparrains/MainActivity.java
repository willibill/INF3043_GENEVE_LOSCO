package org.esiea.geneve_losco.lesparrains;

import android.app.DatePickerDialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    private DatePickerDialog dpd = null;
    private static final int NOTIF_ID = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetBiersServices.startActionget_all_biers(this);
        final Button btn_hello = (Button) findViewById(R.id.btn_hello);
        DatePickerDialog.OnDateSetListener odsl = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                btn_hello.setText(day +"/"+month+"/"+year);
            }
        };
        dpd = new DatePickerDialog(this,odsl,1996,05,25);
    }

    public void notification_test(View v) {
        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(this).setContentText("William, tu as gagné 1 million €").setContentTitle("Argent").setSmallIcon(R.mipmap.ic_launcher);
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(NOTIF_ID, builder.build());
    }

    public void makeIntent(View v) {
        Intent i = new Intent(this, secondeActivity.class);
        startActivity(i);
    }

    public void datePick(View v)
    {
        dpd.show();
    }
}
