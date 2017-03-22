package hl.jaron.mysqlitemanager.util;

import android.content.Context;

import hl.jaron.mysqlitemanager.sqlite.MySqliteHelper;

/**
 * Created by Jaron Yu on 2017/3/22.
 */
public class DbManager {

    private static MySqliteHelper helper;

    public static MySqliteHelper getInstance(Context context) {
        if (helper == null) {
            synchronized (DbManager.class) {
                helper = new MySqliteHelper(context);
            }
        }
        return helper;
    }
}
