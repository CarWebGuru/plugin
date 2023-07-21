package com.carwebguru.plugin.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.carwebguru.plugin.CWGPlugin;
import com.carwebguru.plugin.ICWGPlugin;
import com.carwebguru.plugin.R;
import com.carwebguru.plugin.data.CWGPluginCallback;
import com.carwebguru.plugin.data.CWGPluginCommand;
import com.carwebguru.plugin.data.CWGPluginExtra;
import com.carwebguru.plugin.data.CWGPluginValues;

public class MainActivity extends AppCompatActivity {

    private CWGPlugin plugin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createPlugin();
    }

    private void createPlugin() {
        plugin = new CWGPlugin(getApplicationContext());

        plugin.events = new ICWGPlugin() {
            @Override
            public void onCommand(CWGPluginCommand command, CWGPluginValues values, CWGPluginCallback callback, CWGPluginExtra extra, boolean myself) {
                toLog(String.format("onCommand[p-client]: %d, t: %s, d: %s", command.getCommand(), values.getTitle(), values.getDescription()));

                if( (extra != null) || (extra.getExtra() != null)) {
                    Bundle bundle = extra.getExtra();
                    for (String key : bundle.keySet()) {
                        toLog( " > [p-client] " + key + " => " + bundle.get(key) + ";");
                    }
                }
            }
        };

    }

    @Override
    protected void onStart() {
        super.onStart();
        plugin.setEnabled(true);
    }


    @Override
    protected void onStop() {
        plugin.setEnabled(false);
        super.onStop();
    }

    private void toLog(String txt) {
        Log.d(this.getClass().getSimpleName(), txt);
    }
}