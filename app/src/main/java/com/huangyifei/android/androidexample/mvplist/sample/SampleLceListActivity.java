package com.huangyifei.android.androidexample.mvplist.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.huangyifei.android.androidexample.BaseActivity;
import com.huangyifei.android.androidexample.mvplist.sample.view.UserListView;

/**
 * Created by huangyifei on 16/10/21.
 */
public class SampleLceListActivity extends BaseActivity {

    UserListView mUserListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUserListView = new UserListView(this);
        setContentView(mUserListView);
    }


    public static void launch(Activity activity) {
        activity.startActivity(new Intent(activity, SampleLceListActivity.class));
    }
}