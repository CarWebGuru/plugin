package com.carwebguru.plugin;

public class CWGPluginConst {

    public static final int TYPE_EMPTY = 0;

    public static class Commands {

        public static final int GET_CWG_VERSION = 1;

        public static final int GET_CWG_INFO = 2;

        public static final int START_CWG_ACTION = 3;



        public static final int SETUP_PLUGIN_GROUP = 10;
        public static final int DELETE_PLUGIN_GROUP = 11;



        public static final int SETUP_PLUGIN = 20;

        public static final int DELETE_PLUGIN = 21;

        public static final int UPDATE_PLUGIN_VALUE = 22;
    }


    public static class IconTypes {
        public static final int ICON_CODE = 1;
        public static final int ICON_BITMAP = 2;
    }


    public static class CallbackTypes {
        public static final int SHOW_MESSAGE = 1;
        public static final int OPEN_APP = 2;
    }


    public static class Keys {
        public static final String COMMAND                      = "cmd";
        public static final String ACTION                       = "act";
        public static final String LOGIC                        = "logic";
        public static final String MODULE                       = "module";
        public static final String STEP_ID                      = "step-id";
        public static final String SENDER_PACKAGE               = "s-package";
        public static final String API_HASH                     = "api-hash";

        public static final String API_KEY                      = "api-key";

        public static final String ITEM_UID                     = "i-uid";
        public static final String OWNER_UID                    = "o-uid";

        public static final String TITLE                        = "title";
        public static final String DESCR                        = "descr";
        public static final String NUMBER                       = "num";
        public static final String PERCENT                      = "percent";


        public static final String COLOR_TEXT                   = "clr-txt";
        public static final String COLOR_BACKGROUND             = "clr-bck";

        public static final String VIEW_TYPE                    = "view-type";
        public static final String VALUE                        = "value";
        public static final String ENABLE                       = "enable";

        public static final String ICON_TYPE                    = "icn-type";
        public static final String ICON_BITMAP                  = "icn-bmp";
        public static final String ICON_CODE                    = "icn-code";

        public static final String ICON_VALUE                   = "icn-value";
        public static final String ICON_GROUP                   = "icn-group";
        public static final String BIG_TEXT                     = "big-txt";

        public static final String PLUGIN_AUTHOR                = "p-auth";
        public static final String PLUGIN_URL                   = "p-url";
        public static final String PLUGIN_CONTACT               = "p-cnt";
        public static final String PLUGIN_VERSION               = "p-ver";

        public static final String NEED_START                   = "need-start";


        public static final String SUPPORTED_VALUE              = "s-value";
        public static final String SUPPORTED_PERCENT            = "s-percent";
        public static final String SUPPORTED_COLOR_TEXT         = "s-clr-txt";
        public static final String SUPPORTED_COLOR_BACKGROUND   = "s-clr-bck";


        public static final String CALLBACK_TYPE                = "c-type";

        public static final String APP_PACKAGE                  = "app-package";
        public static final String APP_ACTIVITY                 = "app-activity";

        public static final String MESSAGE_CAPTION              = "msg-caption";

        public static final String MESSAGE_TEXT                 = "msg-text";



        public static final String EXTRA                        = "extra";
        public static final String TIMESTAMP                    = "ts";

        public static final String DEBUG                        = "dbg";

    }

}
