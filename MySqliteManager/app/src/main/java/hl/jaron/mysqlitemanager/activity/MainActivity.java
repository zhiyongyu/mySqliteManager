package hl.jaron.mysqlitemanager.activity;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import hl.jaron.mysqlitemanager.sqlite.MySqliteHelper;
import hl.jaron.mysqlitemanager.util.DbManager;

/**
 * Created by Jaron Yu on 2017/3/22.
 */
public class MainActivity extends Activity {
    private MySqliteHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        helper = DbManager.getInstance(this);
        /*
        创建数据库，记得最后关闭数据库。
         */
        SQLiteDatabase db = helper.getWritableDatabase();

        /*
        通过db.execSQL(sql);来执行sql语句
         */

        db.close();
    }
}
