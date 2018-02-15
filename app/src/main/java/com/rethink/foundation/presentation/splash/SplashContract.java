package com.rethink.foundation.presentation.splash;

import com.rethink.foundation.presentation.BasePresenter;
import com.rethink.foundation.presentation.BaseView;

/**
 * Created by zac on 13/02/18.
 */

public interface SplashContract {

    interface View extends BaseView<Presenter> {

        void loadReferral();

        void loadProfile();
    }

    interface Presenter extends BasePresenter {
        void checkFirstTime();
    }
}
