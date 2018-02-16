package com.rethink.foundation.presentation.newsfeed;

import android.support.v4.app.Fragment;

/**
 * Created by zac on 16/02/18.
 */

public class NewsFeedFragment extends Fragment implements NewsFeedContract.View {

    private NewsFeedContract.Presenter presenter;

    public static NewsFeedFragment newInstance() {
        return new NewsFeedFragment();
    }

    @Override
    public void setPresenter(NewsFeedContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showNoDataConnectivityMessage(String message) {

    }
}
