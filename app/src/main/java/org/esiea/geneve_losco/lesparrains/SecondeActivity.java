package org.esiea.geneve_losco.lesparrains;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class secondeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);
        GetBiersServices.startActionget_all_biers(this);
    }
}
