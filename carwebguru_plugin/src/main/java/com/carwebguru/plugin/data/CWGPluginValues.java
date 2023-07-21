package com.carwebguru.plugin.data;

import android.content.Intent;
import android.graphics.Bitmap;

import com.carwebguru.plugin.CWGPluginConst;


public class CWGPluginValues extends CWGPluginAbstractData {

    private final CWGVar title;

    private final CWGVar description;

    private final CWGVar value;

    private final CWGVar percent;

    private final CWGVar number;


    private final CWGVar enable;


    public CWGIcon icon;

    public CWGView view;



    public CWGPluginValues() {
        title = createVar(CWGPluginConst.Keys.TITLE, "");
        description = createVar(CWGPluginConst.Keys.DESCR, "");
        value = createVar(CWGPluginConst.Keys.VALUE, "");
        percent = createVar(CWGPluginConst.Keys.PERCENT, (float) 0f);
        number = createVar(CWGPluginConst.Keys.NUMBER, (int) 0);
        enable = createVar(CWGPluginConst.Keys.ENABLE, true, true);

        icon = new CWGIcon();
        view = new CWGView();
    }


    @Override
    public void saveToIntent(Intent intent) {
        super.saveToIntent(intent);
        icon.saveToIntent(intent);
        view.saveToIntent(intent);
    }


    @Override
    public void loadFromIntent(Intent intent) {
        super.loadFromIntent(intent);
        icon.loadFromIntent(intent);
        view.loadFromIntent(intent);
    }

    @Override
    public void reset() {
        super.reset();
        icon.reset();
        view.reset();
    }



    public boolean isIconBitmapExists() {
        return icon.isIconBitmapExists();
    }

    public int getIconType() {
        return icon.getIconType();
    }



    public String getTitle() {
        return title.getValueString();
    }

    public void setTitle(String value) {
        this.title.setValueString(value);
    }



    public String getDescription() {
        return description.getValueString();
    }

    public void setDescription(String value) {
        description.setValueString(value);
    }



    public String getValue() {
        return value.getValueString();
    }

    public void setValue(String value) {
        this.value.setValueString(value);
    }




    public float getPercent() {
        return percent.getValueFloat();
    }

    public void setPercent(float value) {
        this.percent.setValueFloat(value);
    }



    public int getNumber() {
        return number.getValueInt();
    }

    public void setNumber(int value) {
        this.number.setValueInt(value);
    }




    public boolean isEnable() {
        return enable.isValueBool();
    }

    public void setEnable(boolean value) {
        this.enable.setValueBool(value);
    }

}
