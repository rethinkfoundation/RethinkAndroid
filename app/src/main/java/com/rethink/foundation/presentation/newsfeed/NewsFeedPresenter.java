package com.rethink.foundation.presentation.newsfeed;

import android.content.Context;

import com.rethink.foundation.data.DataManager;
import com.rethink.foundation.utils.daggercomponents.DaggerComponent;
import com.rethink.foundation.utils.daggercomponents.DaggerDaggerComponent;
import com.rethink.foundation.utils.daggercomponents.DaggerModule;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by zac on 16/02/18.
 */

public class NewsFeedPresenter implements NewsFeedContract.Presenter {

    private NewsFeedContract.View newsFeedView;
    private Context context;
    private DaggerComponent component;
    private DataManager dataManager;

    NewsFeedPresenter(Context context, NewsFeedContract.View newsFeedView) {
        this.newsFeedView = newsFeedView;
        this.context = context;
        newsFeedView.setPresenter(this);
        component = DaggerDaggerComponent.builder().daggerModule(new DaggerModule(context)).build();
        //getting model object
        dataManager = component.provideDataHelper();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void loadData() {
        dataManager.getResultFromObservable(5, 3)
                // Run on a background thread
                .subscribeOn(Schedulers.io())
                // Be notified on the main thread
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(getObserver());
    }

    public Observer getObserver() {
        Observer<String> observer = new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {
            }

            //Result will be recieved in onNext
            @Override
            public void onNext(String value) {
                //Passing result to view
                System.out.println("Data - "+value);
            }

            //Error will be recieved if something went wrong
            @Override
            public void onError(Throwable e) {
            }

            //onComplete willbe executed at last
            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };
        return observer;
    }
}
