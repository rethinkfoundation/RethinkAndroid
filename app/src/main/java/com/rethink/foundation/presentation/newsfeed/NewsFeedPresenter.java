package com.rethink.foundation.presentation.newsfeed;

import android.content.Context;

import com.rethink.foundation.data.DataManager;
import com.rethink.foundation.utils.daggercomponents.DaggerComponent;
import com.rethink.foundation.utils.daggercomponents.DaggerDaggerComponent;
import com.rethink.foundation.utils.daggercomponents.DaggerModule;

/**
 * Created by zac on 16/02/18.
 */

public class NewsFeedPresenter implements NewsFeedContract.Presenter {

    private NewsFeedContract.View newsFeedView;
    private Context context;
    private DaggerComponent component;
    private DataManager dataManager;

    public NewsFeedPresenter(Context context, NewsFeedContract.View newsFeedView) {
        this.newsFeedView = newsFeedView;
        this.context = context;


        component = DaggerDaggerComponent.builder().daggerModule(new DaggerModule()).build();

        //getting model object
        dataManager = component.provideDataHelper();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
