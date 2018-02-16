package com.rethink.foundation.presentation.newsfeed;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rethink.foundation.R;
import com.rethink.foundation.utils.ActivityUtils;

/**
 * Created by zac on 16/02/18.
 */

public class NewsFeedActivity extends AppCompatActivity {

    private NewsFeedFragment newsFeedFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_main);

        newsFeedFragment =
                (NewsFeedFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (newsFeedFragment == null) {
            // Create the fragment
            newsFeedFragment = NewsFeedFragment.newInstance();
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), newsFeedFragment, R.id.contentFrame);
        }


        NewsFeedPresenter newsFeedPresenter = new NewsFeedPresenter(getApplication(), newsFeedFragment);
    }
}
