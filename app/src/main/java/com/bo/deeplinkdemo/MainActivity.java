package com.bo.deeplinkdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        deepLinkSwitcher();
    }

    private void deepLinkSwitcher() {
        Intent intent = getIntent();
        if (intent != null && intent.getData() != null) {
            String intentData = intent.getData().toString();
            Log.d("deepData", "" + intentData);
            if (intentData != null && !intentData.isEmpty()) {

                /*
                Here
                SCHEME = https
                HOST = www.pexels.com
                PATH PATTERN = /@md-emran-hossain-emran-11822
                * */
                Intent intObj=null;
                if (intentData.equalsIgnoreCase("https://www.pexels.com/@md-emran-hossain-emran-11822")) {
                    intObj = new Intent(mContext , DemoLink1Activity.class);
                }

                /*
                Here
                SCHEME = uapp
                HOST = yrhost.com
                PATH PATTERN = /target_activity
                * */
                else if(intentData.equalsIgnoreCase("uapp://yrhost.com/target_activity")){
                    intObj = new Intent(mContext , DemoLink2Activity.class);
                }
                else if(intentData.equalsIgnoreCase("uapp://yrhost.com/target_another_activity")){
                    intObj = new Intent(mContext , DemoLink3Activity.class);
                }

                if(intObj!=null)
                    startActivity(intObj);
            }
        }
    }//end function
}
