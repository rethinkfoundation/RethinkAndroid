package com.rethink.foundation.presentation.newsfeed;

import com.rethink.foundation.presentation.BasePresenter;
import com.rethink.foundation.presentation.BaseView;

/**
 * Created by zac on 16/02/18.
 */

public interface NewsFeedContract {

    interface View extends BaseView<Presenter> {


    }

    interface Presenter extends BasePresenter {

        void loadData();
    }
}
