package com.carwebguru.plugin;


import com.carwebguru.plugin.data.CWGPluginCallback;
import com.carwebguru.plugin.data.CWGPluginCommand;
import com.carwebguru.plugin.data.CWGPluginExtra;
import com.carwebguru.plugin.data.CWGPluginValues;

public interface ICWGPlugin {

    void onCommand(CWGPluginCommand command, CWGPluginValues values, CWGPluginCallback callback, CWGPluginExtra extra, boolean myself);

}
