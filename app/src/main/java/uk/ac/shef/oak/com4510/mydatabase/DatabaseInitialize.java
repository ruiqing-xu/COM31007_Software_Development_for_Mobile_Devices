package uk.ac.shef.oak.com4510.mydatabase;

import android.content.Context;

import androidx.room.Room;

/**
 * DatabaseInitialize.java
 * @author Feng Li, Ruiqing Xu
 */

public class DatabaseInitialize {
    private static DatabaseConfig databaseConfig;

    public DatabaseInitialize(){}

    public static void init(Context context) {
        // Instantiate database object
        databaseConfig = Room
                .databaseBuilder(context.getApplicationContext(), DatabaseConfig.class, "huiminyougou")
                .allowMainThreadQueries()
                .build();
    }

    static DatabaseConfig getDatabaseConfig() {
        if (databaseConfig == null) {
            throw new NullPointerException("DatabaseInitialize.init(context) has not call, remember call this function in your Application.class");
        }
        return databaseConfig;
    }
}