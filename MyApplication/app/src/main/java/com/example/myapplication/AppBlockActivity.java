package com.example.myapplication

import android.app.Activity;
import android.os.Bundle;
import com.*

public class AppBlockActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_block);

        // Start the foreground service
        startService(new Intent(this, AppBlockService.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(new Intent(this, AppBlockService.class));
    }
}
