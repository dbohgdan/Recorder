package com.dbohgdan.recorder;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

public class RecordApplication extends Application {

    private static RecordApplication application;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        application = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Start service
        startService(new Intent(this, RecordService.class));
    }

    public static RecordApplication getInstance() {
        return application;

    }
}
