package com.aboutloans.edenrose;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Apply extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdzUforuLgTqUGERLhrJcSmrxR2OBxWSIg_mW32qYkhLzAk9Q/viewform?usp=sf_link"));
        startActivity(intent);
    }
}
