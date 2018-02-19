package com.rethink.foundation.data;

import android.content.Context;
import android.support.annotation.NonNull;

import com.rethink.foundation.data.local.LocalDataManager;
import com.rethink.foundation.data.preference.PreferenceManager;
import com.rethink.foundation.data.remote.RemoteDataManager;

import io.reactivex.Observable;

/**
 * Created by zac on 12/02/18.
 */

public class DataManager {

    private RemoteDataManager remoteDataManager;
    private LocalDataManager localDataManager;
    private DataCallBack dataCallBack;
    private PreferenceManager preferenceManager;
    private Context context;


    private DataManager(RemoteDataManager remoteDataManager, LocalDataManager localDataManager, Context context) {
        this.remoteDataManager = remoteDataManager;
        this.localDataManager = localDataManager;
        this.context = context;

        preferenceManager = new PreferenceManager(context);
        //remoteDataManager.setListener(this);
        //localDataManager.setListener(this);

        //registerBroadcastReceiver();
    }

    @NonNull
    public static DataManager getInstance(RemoteDataManager remoteDataManager, LocalDataManager localDataManager, Context context) {
        return new DataManager(remoteDataManager, localDataManager, context);
    }

    public void setCallBack(DataCallBack callBack) {
        this.dataCallBack = callBack;
    }

    public boolean checkLoggedIn() {
        return true;
    }

    public Observable<String> getResultFromObservable(int a, int b) {
        int result=a+b;

        return Observable.just(result+"");
    }
}
