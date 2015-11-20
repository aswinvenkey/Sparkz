package com.aswinvenkat.sparkz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by aswin venkat on 9/13/2015.
 */
public class ActivityLauncher extends ActionBarActivity {

    private Boolean firstRun=true;
    private SharedPreferences fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fr = getSharedPreferences("prefs", 0);
        firstRun = fr.getBoolean("firstRun", true);
        if ( firstRun ) {
            Intent intent = new Intent(this,RegisterActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
