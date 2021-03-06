package com.ericliudeveloper.mvpevent.provider;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by eric.liu on 20/05/15.
 */
public class ProviderContract {
    private ProviderContract(){}

    public static final String CONTENT_AUTHORITY = "com.ericliudeveloper.mvpevent";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_FIRSTMODEL = "firstmodel";



    public static class FirstModels {
        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/vnd.ericliu.androidmvp.firstmodel";
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/vnd.ericliu.androidmvp.firstmodel";


        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_FIRSTMODEL).build();

        public static String[] PROJECTION = {
                FirstModelTable.COL_ID,
                FirstModelTable.COL_DIRECTION,
                FirstModelTable.COL_PROGRESS,
                FirstModelTable.COL_NAME,
        };

        public static String SELECTION_BY_ID = BaseColumns._ID + " = ? ";
    }
}
