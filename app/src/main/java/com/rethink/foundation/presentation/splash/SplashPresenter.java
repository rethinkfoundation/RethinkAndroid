package com.rethink.foundation.presentation.splash;

import com.rethink.foundation.data.DataCallBack;
import com.rethink.foundation.data.DataManager;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by zac on 13/02/18.
 */

public class SplashPresenter implements SplashContract.Presenter, DataCallBack {

    private DataManager dataManager;
    private SplashContract.View splashView;

    public SplashPresenter(DataManager dataManager, SplashContract.View splashView) {
        this.dataManager = checkNotNull(dataManager, "DataManager cannot be null");
        this.splashView = checkNotNull(splashView, "LoginView cannot be null");
        this.splashView.setPresenter(this);
        this.dataManager.setCallBack(this);
    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void checkFirstTime() {
        if (dataManager.checkLoggedIn()) {
            splashView.loadReferral();
        }
    }
}
